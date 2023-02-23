package com.example.day4email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {

        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"soselia.aleksandre@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Aleksandre");
        email.putExtra(Intent.EXTRA_TEXT, "Soselia");
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :")); // no permission needed for mail
    }
}