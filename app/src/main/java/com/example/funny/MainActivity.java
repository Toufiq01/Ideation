package com.example.funny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick (View view){
//        TextView txtHello = findViewById(R.id.textManger);
//        EditText Name = findViewById(R.id.txtName);
//        txtHello.setText("Hello" + Name.getText().toString());
         TextView show = findViewById(R.id.textView);
         TextView show2 = findViewById(R.id.textView2);
         TextView show3 = findViewById(R.id.textView3);
         EditText firstName = findViewById(R.id.editTextTextPersonName4);
         EditText lastName = findViewById(R.id.editTextTextPersonName5);
         EditText email = findViewById(R.id.editTextTextEmailAddress);

         show.setText("Your First Name is :" + firstName.getText().toString());
         show2.setText("Your last Name is :" +lastName.getText().toString());
         show3.setText("Your email address is :" + email.getText().toString());

    }
}