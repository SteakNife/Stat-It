package com.app.sports.stats.sportstat.app;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.BackendlessCallback;

/**
 * Created by epadcas on 25/02/2016.
 */
public class Player {

    private String playerName;

    public Player(final String playerName){

        this.playerName = playerName;
    }


    BackendlessUser user = new BackendlessUser();

    public void doSomething() {

        Backendless.Persistence.save(new Player(playerName), new BackendlessCallback<Player>(){

            @Override
            public void handleResponse(Player player)
            {

            }
        });
    }




    public void setName( String playerName )
    {
        this.playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName;
    }
}
