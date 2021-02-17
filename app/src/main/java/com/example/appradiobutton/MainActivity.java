package com.example.appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    RadioButton rb1, rb2;
    TextView textView;
    Button button;

    @SuppressLint("DefaultLocale")
    public void calc(View view) {
        String input1 = et1.getText().toString();
        String input2 = et2.getText().toString();
        int resultado = 0;

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        if (rb1.isChecked()) {
            resultado = num1 + num2;
        } else if (rb2.isChecked()) {
            resultado = num1 - num2;
        }


        textView.setText(String.format("%s%d", getResources().getText(R.string.result), resultado));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
    }
}