package com.example.lab4broadcaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Create UI objects
    Button sendButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise UI objects (widgets)
        sendButton = (Button) findViewById(R.id.sendBtn);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBroadcast();
            }
        });
    }

    private void sendBroadcast()
    {
        Intent intent = new Intent();
        intent.setAction("com.example.lab4broadcaster");
        intent.putExtra("Life_form", "_DROID_");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }
}