package com.app.sports.stats.sportstat.app.service;

import com.app.sports.stats.sportstat.app.backendlessObjects.Player;
import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

import java.util.Iterator;

/**
 * Created by Padraic Cashin on 04/03/2016.
 */
public class RetrievePlayerData {

    public void retrieveAllPlayerData() {


        Backendless.Persistence.of(Player.class).find( new AsyncCallback<BackendlessCollection<Player>>(){
            @Override
            public void handleResponse( BackendlessCollection<Player> responsePlayer )
            {
                Iterator<Player> iterator = responsePlayer.getCurrentPage().iterator();

                while( iterator.hasNext() )
                {
                    Player player = iterator.next();
                    System.out.println( player.getPlayerName());
                }
            }
            @Override
            public void handleFault( BackendlessFault fault )
            {
                System.out.println("an error has occurred : " + fault.getCode() + ": " + fault.getMessage());
            }
        });
    }

}
