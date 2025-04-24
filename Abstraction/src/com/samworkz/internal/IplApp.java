package com.samworkz.internal;

public class IplApp {
    private JDBC jdbc;

    public IplApp(JDBC jdbc) {
        this.jdbc = jdbc;
    }

    public void Details() {
        if (jdbc != null) {

            System.out.println("running in the details");

        }
        else {
            System.err.println(" error");
        }
    }
}
