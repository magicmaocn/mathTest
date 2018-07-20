package com.example.android.mathtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQ1Answer(View view){
        CheckBox answerA = findViewById(R.id.q1_Checkbox1);
        CheckBox answerB = findViewById(R.id.q1_Checkbox2);
        CheckBox answerC = findViewById(R.id.q1_Checkbox3);
        CheckBox answerD = findViewById(R.id.q1_Checkbox4);
        if ( answerA.isChecked() && answerC.isChecked() && !answerB.isChecked() && !answerD.isChecked()){
            Toast.makeText(this,"You answer is correct.",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"You answer is wrong, the correct answer is A and C.",Toast.LENGTH_LONG).show();
        }
    }

    public void checkQ2Answer(View view){
        RadioButton radioButton = findViewById(R.id.q2_2);
        if ( radioButton.isChecked() ){
            Toast.makeText(this,"You answer is correct.",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"You answer is wrong, the correct answer is B.",Toast.LENGTH_LONG).show();
        }
    }

    public void checkQ3Answer(View view){
        int correctAnswer = 3 + 3;
        EditText input = findViewById(R.id.q3Input);
        String value = input.getText().toString();
        int number = Integer.parseInt(value);
        if ( number == correctAnswer ){
            Toast.makeText(this,"You answer is correct.",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"You answer is wrong, the correct answer is " + correctAnswer + ".",Toast.LENGTH_LONG).show();
        }
    }

    public void checkQ4Answer(View view){
        int correctAnswer = 4 + 4;
        EditText input = findViewById(R.id.q4Input);
        String value = input.getText().toString();
        int number = Integer.parseInt(value);
        if ( number == correctAnswer ){
            Toast.makeText(this,"You answer is correct.",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"You answer is wrong, the correct answer is " + correctAnswer + ".",Toast.LENGTH_LONG).show();
        }
    }

    public void checkQ5Answer(View view){
        int correctAnswer = 5 + 5;
        EditText input = findViewById(R.id.q5Input);
        String value = input.getText().toString();
        int number = Integer.parseInt(value);
        if ( number == correctAnswer ){
            Toast.makeText(this,"You answer is correct.",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"You answer is wrong, the correct answer is " + correctAnswer + ".",Toast.LENGTH_LONG).show();
        }
    }

    public void checkQ6Answer(View view){
        int correctAnswer = 6 + 6;
        EditText input = findViewById(R.id.q6Input);
        String value = input.getText().toString();
        int number = Integer.parseInt(value);
        if ( number == correctAnswer ){
            Toast.makeText(this,"You answer is correct.",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"You answer is wrong, the correct answer is " + correctAnswer + ".",Toast.LENGTH_LONG).show();
        }
    }
}
