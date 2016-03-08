package com.app.sports.stats.sportstat.app.service;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.app.sports.stats.sportstat.app.backendlessObjects.Player;
import com.app.sports.stats.sportstat.app.client.PlayerListActivity;
import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Padraic Cashin on 07/03/2016.
 */
public class RetrievePlayerDataTask extends AsyncTask {

    private static ArrayList<String> infoPlayerList = new ArrayList<String>();
    PlayerListActivity playerListActivity;
    Context context;

    public RetrievePlayerDataTask(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override
    protected Object doInBackground(Object[] params) {

        BackendlessCollection<Player> result = Backendless.Persistence.of( Player.class ).find();
        Iterator<Player> iterator = result.getCurrentPage().iterator();

        while (iterator.hasNext()) {
            Player player = iterator.next();
            String playerName = player.getPlayerName();
            infoPlayerList.add(playerName);
        }

        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        System.out.println("Starting playerListActivity");
        Intent intent = new Intent(context,PlayerListActivity.class);
        intent.putStringArrayListExtra("playersList",infoPlayerList);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
