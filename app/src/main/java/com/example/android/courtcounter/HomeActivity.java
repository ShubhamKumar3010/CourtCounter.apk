package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    int a=0;
    int b=0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePointer(View view) {
        a += 3;
        displayForTeamA(a);
    }

    public void twoPointer(View view) {
        a += 2;
        displayForTeamA(a);
    }

    public void freeThrow(View view) {
        a += 1;
        displayForTeamA(a);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePointer_B(View view) {
        b += 3;
        displayForTeamB(b);
    }

    public void twoPointer_B(View view) {
        b += 2;
        displayForTeamB(b);
    }

    public void freeThrow_B(View view) {
        b += 1;
        displayForTeamB(b);
    }

    public void reset(View view) {
        a=0;
        b=0;
        displayForTeamA(a);
        displayForTeamB(b);
    }
}
