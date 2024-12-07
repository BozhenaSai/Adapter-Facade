package ua.edu.ucu.apps.task1;

public class TwitterUserAdapter implements User{

    private TwitterUser TwitterUser;
    
    public TwitterUserAdapter(TwitterUser TwitterUser){
        this.TwitterUser = TwitterUser;
    }


    @Override
    public String getMail() {
        return TwitterUser.getEmail();
    }

    @Override
    public String getCountry() {
        return TwitterUser.getUserCountry();
    }

    @Override
    public String getActiveTime() {
        return TwitterUser.getLastUserATime();
    }

    @Override
    public String toString() {
        return TwitterUser.toString();
    }
    
}
