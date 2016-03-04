package com.app.sports.stats.sportstat.app.client;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.app.sports.stats.sportstat.app.backendlessObjects.Player;
import com.app.sports.stats.sportstat.app.R;
import com.backendless.BackendlessCollection;

/**
 * Created by Padraic Cashin on 02/03/2016.
 */
public class RetrievePlayerList extends Activity {

    ListView listView ;
    private BackendlessCollection<Player> playerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerlist);

    }

}
