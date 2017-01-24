package com.example.ekam1.workshop2starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Once the activity is created, let's assign some code to the button when it is clicked
        // If red, then alt-enter to import package to namespace
        // Recall Context.findViewByID - returns a view
        // It expects an argument - an identifier from the R static class
        Button a2_button = (Button) findViewById(R.id.a2_button);
        // Add an onClickListener to the button by assigning a so-called "anonymous subclass" of OnClickListener
        // We will override the OnClickListener's onClick() method inside the constructor call
        // Notice that here we will pass the newly instantiated OnClickListener to the setOnClickListener method instead of storing the ref
        // At the same time we override the onClick method -> this is a common pattern you see in Java "in the wild"
        a2_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Typically the pattern is to call a method in our Activity.
                // for today, let's just do the work in here...
                // Let's get the button to start SecondActivity (for result)
                // we need to create an Intent
                Intent a2intent = new Intent("com.seneca.lab2b.ekam1");
                // startActivityForResult expects both an intent and a request code so that you can match up the reply with your original request
                startActivityForResult(a2intent, 1);
            }
        });

        Button a3_button = (Button) findViewById(R.id.a3_button);


    }
}
