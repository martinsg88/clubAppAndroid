package com.clubproject.martinsg88.clubprojectandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupButton();
    }

    protected void setupButton(){

        final Button login_button = (Button) findViewById(R.id.login_button);

        login_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent club_list_intent = new Intent(Login.this, ClubList.class);
                startActivity(club_list_intent);
            }
        });
    }
}
