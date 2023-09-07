package com.example.nameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fname=findViewById(R.id.fname);
        EditText lname=findViewById(R.id.lname);
        Button button=findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstName = fname.getText().toString();
                String lastName = lname.getText().toString();


                String fullName = firstName + " " + lastName;

                Toast.makeText(MainActivity.this, "Full Name:"+ fullName, Toast.LENGTH_SHORT).show();
            }
        });


    }
}