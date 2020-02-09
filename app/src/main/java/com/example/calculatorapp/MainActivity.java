package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    Button B1;
    Button B2;
    Button B3;
    Button B4;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.text1);
        n2=findViewById(R.id.text2);
        B1=findViewById(R.id.button1);
        B2=findViewById(R.id.button2);
        B3=findViewById(R.id.button3);
        B4=findViewById(R.id.button4);
        res=findViewById(R.id.textview);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(n1.getText().toString());
                int number2=Integer.parseInt(n2.getText().toString());
                int add=number1+number2;
                res.setText(Integer.toString(add));



            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(n1.getText().toString());
                int number2=Integer.parseInt(n2.getText().toString());
                int sub=number1-number2;
                res.setText(Integer.toString(sub));

            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(n1.getText().toString());
                int number2=Integer.parseInt(n2.getText().toString());
                int mul=number1*number2;
                res.setText(Integer.toString(mul));

            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(n1.getText().toString());
                int number2=Integer.parseInt(n2.getText().toString());
                if(number2!=0){
                    int div = number1 / number2;
                    res.setText(Integer.toString(div));
                }
                else
                {
                    res.setText("Error");
                }

            }
        });





    }
}
