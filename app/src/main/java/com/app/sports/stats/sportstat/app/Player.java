package com.app.sports.stats.sportstat.app;

import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;

/**
 * Created by Padraic Cashin on 25/02/2016.
 */
public class Player {

    private String playerName;

    public void setPlayerName( String playerName )
    {
        this.playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName;
    }
}
