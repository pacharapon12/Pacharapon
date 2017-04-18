package com.ziloliz.pacharapon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);



        Button ppbutton = (Button) findViewById(R.id.loginbutton);
        final EditText mUsername = (EditText) findViewById(R.id.editText2);
        final EditText mPassword = (EditText) findViewById(R.id.editText);
        final TextView t = (TextView) findViewById(R.id.campon);


        ppbutton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (  mUsername.getText().toString().equals("admin") && mPassword.getText().toString().equals("password")) {


                            Intent Success;
                            Success = new Intent(LoginPage.this, Success.class);
                            startActivity(Success);



                }
                else{
                //sdfsdfsdf
                    t.setText("WRONG");



                }
            }
        });


        Button loginBtt = (Button) findViewById(R.id.button2);
        loginBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webActivity;
                webActivity = new Intent(LoginPage.this,WebViewActivity.class);
                startActivity(webActivity);
            }
        });




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }














}
