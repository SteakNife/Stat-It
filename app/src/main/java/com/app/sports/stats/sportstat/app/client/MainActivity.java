package com.app.sports.stats.sportstat.app.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.app.sports.stats.sportstat.app.R;
import com.app.sports.stats.sportstat.app.backendlessUtil.BackendSettings;
import com.app.sports.stats.sportstat.app.service.RetrievePlayerDataTask;
import com.backendless.Backendless;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    List<String> playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etEmail = (EditText) findViewById(R.id.etEmail);
        EditText etUsername = (EditText)findViewById(R.id.etUsername);
        Button bLogout = (Button) findViewById(R.id.bLogout);
        Button bRetrieveAllPlayerData = (Button) findViewById(R.id.bRetrieveAllPlayerData);

        bLogout.setOnClickListener(this);
        bRetrieveAllPlayerData.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bLogout:

                startActivity(new Intent(this, Login.class));

                break;
        }

        switch (v.getId()) {
            case R.id.bRetrieveAllPlayerData:

                Backendless.initApp(this, BackendSettings.APP_ID, BackendSettings.SECRET_KEY, BackendSettings.VERSION);

                new RetrievePlayerDataTask(getApplicationContext()).execute("");

                break;
        }
    }
}
