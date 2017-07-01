package com.example.android.mariahcareyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * This app is a quiz app that keeps count of your score
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    /**
     * Calculates score
     *
     * @return score
     */
    private int increaseScore() {
        score = score + 1;
        return score;
    }

    /**
     * Ends the game, checks score, and calculates it
     */
    public void showScore(View view) {

        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

        if (score == 10) {
            // Congratulations message
            Toast.makeText(this, "10/10! \nCongratulations!", Toast.LENGTH_SHORT).show();
        } else {
            //Fail message
            Toast.makeText(this, score + "/10 \nBetter Luck Next Time!", Toast.LENGTH_SHORT).show();
        }
        Button endButton = (Button) findViewById(R.id.end_button);
        endButton.setEnabled(false);
    }

    //Question 1 Edit Text
    public void question1() {
        EditText butterflyEditText = (EditText) findViewById(R.id.question_text_1);
        if (butterflyEditText.getText().toString().equalsIgnoreCase("butterfly")){
            increaseScore();
        }
    }

    //Question 2 Radio buttons
    public void question2 (){
        RadioButton thankGodIFoundYouRadioButton = (RadioButton) findViewById(R.id.question_2_answer);
        if (thankGodIFoundYouRadioButton.isChecked()) {
            increaseScore();
        }
    }

    //Question 3 Checkboxes
    public void question3 (){
        // Option A Vision of Love is correct
        CheckBox visionOfLoveCheckBox = (CheckBox) findViewById(R.id.question_3_vision);
        if (visionOfLoveCheckBox.isChecked()) {
            increaseScore();
        }

        // Option B We Belong Together is correct
        CheckBox weBelongTogetherCheckBox = (CheckBox) findViewById(R.id.question_3_belong_together);
        if (weBelongTogetherCheckBox.isChecked()) {
            increaseScore();
        }

        // Option C One Sweet Day is correct
        CheckBox oneSweetDayCheckBox = (CheckBox) findViewById(R.id.question_3_sweet_day);
        if (oneSweetDayCheckBox.isChecked()) {
            increaseScore();
        }

        // Option D Fly like a Bird is correct
        CheckBox flyLikeABirdCheckBox = (CheckBox) findViewById(R.id.question_3_fly_bird);
        if (flyLikeABirdCheckBox.isChecked()) {
            increaseScore();
        }
    }

    //Question 4 Radio buttons
    public void question4 (){
        RadioButton heroRadioButton = (RadioButton) findViewById(R.id.question_4_answer);
        if (heroRadioButton.isChecked()) {
            increaseScore();
        }
    }

    //Question 5 Edit Text
    public void question5() {
        EditText visionOfLoveEditText = (EditText) findViewById(R.id.question_text_5);
        if (visionOfLoveEditText.getText().toString().equalsIgnoreCase("Vision of Love")){
            increaseScore();
        }
    }

    //Question 6 Radio buttons
    public void question6 (){
        RadioButton honeyRadioButton = (RadioButton) findViewById(R.id.question_6_answer);
        if (honeyRadioButton.isChecked()) {
            increaseScore();
        }
    }
    //Question 7 Edit Text
    public void question7() {
        EditText justCallMyNameEditText = (EditText) findViewById(R.id.question_text_7);
        if (justCallMyNameEditText.getText().toString().equalsIgnoreCase("I'll Be There")){
            increaseScore();
        }
    }

}
