package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    int score=0;
    int scoreNew=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamA(View View) {
        score = score + 1;
        display(score);

    }

    public void addTwoForTeamA(View View) {
        score = score + 2;
        display(score);

    }

    public void addThreeForTeamA(View View) {
        score = score + 3;
        display(score);

    }

    public void addOneForTeamB(View View) {
        scoreNew = scoreNew+ 1;
        displayScore(scoreNew);

    }

    public void addTwoForTeamB(View View) {
        scoreNew = scoreNew + 2;
        displayScore(scoreNew);

    }

    public void addThreeForTeamB(View View) {
        scoreNew = scoreNew + 3;
        displayScore(scoreNew);

    }
    public void clearAll(View View) {
        score = 0;
        scoreNew=0;
        display(score);
        displayScore(scoreNew);

    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }
    private void displayScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + number);
    }
}