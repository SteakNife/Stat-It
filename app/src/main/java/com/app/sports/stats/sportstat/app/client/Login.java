package com.app.sports.stats.sportstat.app.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.app.sports.stats.sportstat.app.service.CreatePlayer;
import com.app.sports.stats.sportstat.app.R;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button bLogin;
    private EditText etUsername, etPassword;
    private TextView tvRegisterLink, tvCreatePlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);
        tvCreatePlayer = (TextView) findViewById(R.id.tvCreatePlayer);

        bLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);
        tvCreatePlayer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bLogin:

                break;
        }

        switch (v.getId()) {
            case R.id.tvRegisterLink:

                startActivity(new Intent(this, Register.class));

                break;
        }

        switch (v.getId()) {
            case R.id.tvCreatePlayer:

                startActivity(new Intent(this, CreatePlayer.class));

                break;
        }
    }
}