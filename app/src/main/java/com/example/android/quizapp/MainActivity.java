package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submitQuiz button is clicked.
     */
    public void submitQuiz(View view) {
        int score = 0;

        RadioButton questionOneCheckBox = (RadioButton) findViewById(R.id.oneC_radio_button);
        boolean ifQuestOneC = questionOneCheckBox.isChecked();
        if (ifQuestOneC)
        {score += 1;}

        RadioButton questionTwoCheckBox = (RadioButton) findViewById(R.id.twoA_radio_button);
        boolean ifQuestTwoA = questionTwoCheckBox.isChecked();
        if (ifQuestTwoA)
        {score += 1;}

        EditText qThreeText = (EditText) findViewById(R.id.question_three);
        String qThreeAnswer = qThreeText.getText().toString();
        if (qThreeAnswer.equals("PARADIGM SHIFT"))
        {score += 1;}

        String grade;

        if (score > 1)
        {
            grade = "Pass";
        }
            else
        {
            grade = "Fail";
        }

        CheckBox canDisplayGrade = findViewById(R.id.ok_to_share_checkbox);
        boolean displayGrade = canDisplayGrade.isChecked();

        if (displayGrade)
        {
            Toast.makeText(this, grade, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "FERPA Restricted", Toast.LENGTH_SHORT).show();
        }
    }
}
