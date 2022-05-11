package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreForTeamA=0;
    int scoreForTeamB=0;
    int yellowCardTeamA=0;
    int redCardTeamA=0;
    int foulTeamA=0;
    int yellowCardTeamB=0;
    int redCardTeamB=0;
    int foulTeamB=0;
    /**
     * This method is called when the goal button is clicked for team a.
     */
    public void addOnePointToTeamA(View view) {
        scoreForTeamA=scoreForTeamA+1;
        displayForTeamA(scoreForTeamA);
    }
    /**
     * This method is called when the yellow card button is clicked for team a.
     */
    public void giveYellowCardToTeamA(View view) {
        yellowCardTeamA=yellowCardTeamA+1;
        displayForTeamAYellowCard(yellowCardTeamA);
    }
    /**
     * This method is called when the red card button is clicked for team a.
     */
    public void giveRedCardToTeamA(View view) {
        redCardTeamA=redCardTeamA+1;
        displayForTeamARedCard(redCardTeamA);
    }
    /**
     * This method is called when the foul button is clicked for team a.
     */
    public void addFoulToTeamA(View view) {
        foulTeamA=foulTeamA+1;
        displayForTeamAFoul(foulTeamA);
    }
    /**
     * This method is called when the the goal button is clicked for team b.
     */
    public void addOnePointForTeamB(View view) {
        scoreForTeamB=scoreForTeamB+1;
        displayForTeamB(scoreForTeamB);
    }
    /**
     * This method is called when the yellow card button is clicked for team b.
     */
    public void giveYellowCardToTeamB(View view) {
        yellowCardTeamB=yellowCardTeamB+1;
        displayForTeamBYellowCard(yellowCardTeamB);
    }
    /**
     * This method is called when the red card button is clicked for team b.
     */
    public void giveRedCardToTeamB(View view) {
        redCardTeamB=redCardTeamB+1;
        displayForTeamBRedCard(redCardTeamB);
    }
    /**
     * This method is called when the foul button is clicked for team b.
     */
    public void addFoulToTeamB(View view) {
        foulTeamB=foulTeamB+1;
        displayForTeamBFoul(foulTeamB);
    }
    /**
     *
     * this resets the score for both teams to 0.
     */
    public void resetScore(View view) {
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the yellow card for Team A.
     */
    public void displayForTeamAYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }/**
     * Displays the red card for Team A.
     */
    public void displayForTeamARedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the foul for Team A.
     */
    public void displayForTeamAFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }/**
     * Displays the yellow card for Team B.
     */
    public void displayForTeamBYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }/**
     * Displays the red card for Team B.
     */
    public void displayForTeamBRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the foul for Team B.
     */
    public void displayForTeamBFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
}
