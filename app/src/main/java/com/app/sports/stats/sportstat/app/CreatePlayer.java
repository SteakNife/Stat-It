package com.app.sports.stats.sportstat.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;


/**
 * Created by epadcas on 25/02/2016.
 */


public class CreatePlayer extends AppCompatActivity implements View.OnClickListener {

        private EditText etPlayerName;
        private Button bSubmit;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.player_create);

            etPlayerName = (EditText) findViewById(R.id.etPlayerName);
            bSubmit = (Button) findViewById(R.id.bSubmit);

            bSubmit.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.bSubmit:

                    Player player = new Player(etPlayerName.getText().toString());
                    player.doSomething();


                    break;
            }
        }
}

