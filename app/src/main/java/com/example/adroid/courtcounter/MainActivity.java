package com.example.adroid.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int score_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void add6(View view) {
        score = score + 6;
        updateScore(score, R.id.team_a_score);
    }

    public void add3(View view) {
        score = score + 3;
        updateScore(score, R.id.team_a_score);
    }

    private void updateScore(int score, int score_view) {
        TextView scoreView = findViewById(score_view);
        scoreView.setText(score+"");
    }

    public void add2(View view) {
        score = score + 2;
        updateScore(score, R.id.team_a_score);

    }

    public void add1(View view) {
        score = score + 1;
        updateScore(score, R.id.team_a_score);
    }

    public void reset(View view) {
        score = 0;
        score_team_b = 0;
        updateScore(score, R.id.team_a_score);
        updateScore(score_team_b, R.id.team_b_score);
    }

    public void add1_team_b(View view) {
        score_team_b++;
        updateScore(score_team_b, R.id.team_b_score);
    }

    public void add2_team_b(View view) {
        score_team_b = score_team_b + 2;
        updateScore(score_team_b, R.id.team_b_score);
    }

    public void add3_team_b(View view) {
        score_team_b = score_team_b + 3;
        updateScore(score_team_b, R.id.team_b_score);
    }

    public void add6_team_b(View view) {
        score_team_b = score_team_b + 6;
        updateScore(score_team_b, R.id.team_b_score);
    }
}
