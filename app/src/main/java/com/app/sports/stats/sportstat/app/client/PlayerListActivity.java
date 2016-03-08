package com.app.sports.stats.sportstat.app.client;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.app.sports.stats.sportstat.app.R;
import java.util.ArrayList;

/**
 * Created by Padraic Cashin on 02/03/2016.
 */
public class PlayerListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        ArrayList<String> playersList = intent.getStringArrayListExtra("playersList");

        String [] values = new String[playersList.size()];
        values = playersList.toArray(values);

        // use your custom layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.activity_playerlist, R.id.label, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
    }
}


