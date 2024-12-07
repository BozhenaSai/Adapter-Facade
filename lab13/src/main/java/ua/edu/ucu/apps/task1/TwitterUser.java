package ua.edu.ucu.apps.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private String lastUserATime;

    public String getEmail() {
        return userMail;
    }

    public String getUserCountry() {
        return country;
    }

    public String getLastUserATime() {
        return lastUserATime;
    }

}
