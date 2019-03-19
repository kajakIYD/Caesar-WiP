package com.example.caesar_wip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Cryptography cryptoObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button encryptButton = findViewById(R.id.encryptBtn);
        final Button decryptButton = findViewById(R.id.decryptBtn);

        encryptButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        decryptButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });

    }
}
