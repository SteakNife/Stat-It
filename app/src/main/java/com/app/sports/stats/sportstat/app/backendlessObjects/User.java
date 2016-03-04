package com.app.sports.stats.sportstat.app.backendlessObjects;

/**
 * Created by Padraic Cashin on 26/01/2016.
 */
public class User {

    private String name, email, password, confirmPassword;

    public User(final String name, final String email, final String password, final String confirmPassword){

        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;

    }

    public User (final String email, final String password){

        this.name = "";
        this.email = email;
        this.password = password;
        this.confirmPassword = "";

    }
}
