package ua.edu.ucu.apps.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class FacebookUser {
    public String email;
    private String userCountry;
    private String lastActiveTime;

    public String getEmail(){
        return email;
    }

    public String getUserCountry(){
        return userCountry;
    }

    public String getLastUserATime(){
        return lastActiveTime;
    }

}
