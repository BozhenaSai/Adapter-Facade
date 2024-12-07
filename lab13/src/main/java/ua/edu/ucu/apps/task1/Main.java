package ua.edu.ucu.apps.task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;
        User user = null;
        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("facebook_email", "Ukraine", LocalDate.now().toString());
                user = new FacebookUserAdapter(facebookUser);

                break;
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("twitter_email", "Ukraine", LocalDate.now().toString());
                user = new TwitterUserAdapter(twitterUser);
                break;
            default:
                break;
        }
        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello!");
    }
}
