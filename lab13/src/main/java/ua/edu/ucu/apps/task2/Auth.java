package ua.edu.ucu.apps.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Auth {

    private Авторизація auth;

    public Auth() {
        this.auth = new Авторизація();
    }

    public boolean authenticate(Database db) {
        return auth.авторизуватися(db.getDb());
    }

}