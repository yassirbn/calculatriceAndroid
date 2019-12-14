package com.isimm.examapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button btnAdd;
    private TextView resultSmme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting value from input

        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        btnAdd = (Button) findViewById(R.id.btnAdd) ;
        resultSmme = (TextView) findViewById(R.id.resultText) ;

        btnAdd.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int number1 = Integer.parseInt(num1.getText().toString()) ;
                int number2 = Integer.parseInt(num2.getText().toString()) ;
                int sum = number1 + number2 ;

                resultSmme.setText("Result is :" + String.valueOf(sum));

            }
        });

    }
}
