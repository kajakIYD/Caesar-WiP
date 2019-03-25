package com.example.caesar_wip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Cryptography cryptoObject;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button encryptButton = findViewById(R.id.encryptBtn);
        final Button decryptButton = findViewById(R.id.decryptBtn);

        final EditText editText = findViewById(R.id.editText);

        editText.setText("Dupsko");

        encryptButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                cryptoObject = new Cryptography(editText.getText().toString());
                editText.setText(cryptoObject.encrypt());
            }
        });

        decryptButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                cryptoObject = new Cryptography(editText.getText().toString());
                editText.setText(cryptoObject.encrypt());
            }
        });

    }
}
