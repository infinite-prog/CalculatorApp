package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText numbers;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        numbers = findViewById(R.id.numbers);
        output = findViewById(R.id.output);
    }

    double currentNumber = 0;
    String operation ="" ;

    public void onAdd(View view) {
        currentNumber = Double.parseDouble(numbers.getText().toString());
        operation = "+" ;
        numbers.setText("");
    }

    public void onSub(View view) {
        currentNumber = Double.parseDouble(numbers.getText().toString());
        operation = "-" ;
        numbers.setText("");
    }

    public void onMultiply(View view) {
        currentNumber = Double.parseDouble(numbers.getText().toString());
        operation = "*" ;
        numbers.setText("");
    }

    public void onDivide(View view) {
        currentNumber = Double.parseDouble(numbers.getText().toString());
        operation = "/" ;
        numbers.setText("");
    }

    public void onMod(View view) {
        currentNumber = Double.parseDouble(numbers.getText().toString());
        operation = "%" ;
        numbers.setText("");
    }

    public void onEqual(View view) {
        double secondNumber = Double.parseDouble(numbers.getText().toString());
        double result =0;

        if(operation.equals("+")){
            result = currentNumber+ secondNumber;
        }
        else if (operation.equals("-")) {
            result = currentNumber - secondNumber;
        }
        else if(operation.equals("*")){
            result = currentNumber * secondNumber;
        }
        else if(operation.equals("/")){
            result = currentNumber/secondNumber;
        }
        else if(operation.equals("%")){
            result = currentNumber%secondNumber;
        }

        output.setText(String.valueOf(result));
    }
}