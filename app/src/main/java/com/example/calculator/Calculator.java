package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    public void addFunction(View view){
        EditText mynum1 = (EditText) findViewById(R.id.num1);
        int intNum1 = Integer.parseInt(mynum1.getText().toString());

        EditText mynum2 = (EditText) findViewById(R.id.num2);
        int intNum2 = Integer.parseInt(mynum2.getText().toString());


        goToActivity2((intNum1 + intNum2));
    }

    public void subFunction(View view){
        EditText mynum1 = (EditText) findViewById(R.id.num1);
        int intNum1 = Integer.parseInt(mynum1.getText().toString());

        EditText mynum2 = (EditText) findViewById(R.id.num2);
        int intNum2 = Integer.parseInt(mynum2.getText().toString());

        goToActivity2((intNum1 - intNum2));
    }

    public void mulFunction(View view){
        EditText mynum1 = (EditText) findViewById(R.id.num1);
        int intNum1 = Integer.parseInt(mynum1.getText().toString());

        EditText mynum2 = (EditText) findViewById(R.id.num2);
        int intNum2 = Integer.parseInt(mynum2.getText().toString());

        goToActivity2((intNum1 * intNum2));
    }

    public void divFunction(View view){
        EditText mynum1 = (EditText) findViewById(R.id.num1);
        int intNum1 = Integer.parseInt(mynum1.getText().toString());

        EditText mynum2 = (EditText) findViewById(R.id.num2);
        int intNum2 = Integer.parseInt(mynum2.getText().toString());

        goToActivity2((intNum1 / intNum2));
    }

    public void goToActivity2(int s){
        String str = String.valueOf(s);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",str);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}