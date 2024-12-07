package ua.edu.ucu.apps.task2;

public class Database extends БазаДаних {
    private БазаДаних db;

    public БазаДаних getDb() {
        return db;
    }

    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return отриматиСтатистичніДані();
    }

}