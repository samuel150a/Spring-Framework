package com.samworkz.internal;

public class IplApp {
    private JDBC jdbc;

    public IplApp(JDBC jdbc) {

        this.jdbc = jdbc;
    }

    public void Details() {
        if (jdbc != null) {
            this.jdbc.Save();

        }
        else {
            System.err.println(" error");
        }
    }
}
