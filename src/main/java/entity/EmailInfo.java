package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailInfo {
    private final String email;
    private final String domain;
    private final String username;

    private static final String EMAIL_REGEX_BR = "\\.[a-zA-Z]{3,}\\.br$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public EmailInfo(String email) {
        this.email = email;
        if (!isValidEmail())
            throw new RuntimeException("Email is not valid");
        this.username = email.split("@")[0];
        this.domain = email.split("@")[1];
        if (email.isEmpty())
            throw new IllegalArgumentException("Email should not null");

    }

    public String getDomain() {
        //return email.substring(email.indexOf("@"));
        return domain;
    }

    public String getUsername() {
        //return email.substring(0, email.indexOf("@"));
        return username;
    }

    public boolean isValidEmail() {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);

        return (matcher.matches());

    }

    public boolean isEmailBrazilian() {

        //Pattern pattern = Pattern.compile(EMAIL_REGEX_BR);
        //Matcher matcher = pattern.matcher(email);
        //return (matcher.matches());
        return email.endsWith(".br");

    }
}