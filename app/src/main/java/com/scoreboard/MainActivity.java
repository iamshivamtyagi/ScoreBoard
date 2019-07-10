package com.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvScoreA;
    Button  butOneRun,butFourRun,butSixRun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScoreA = findViewById(R.id.tvScoreA);
        butOneRun = findViewById(R.id.butOneRun);
        butFourRun = findViewById(R.id.butFourRun);
        butSixRun = findViewById(R.id.butSixRun);

        butOneRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev_score = Integer.parseInt(tvScoreA.getText() + "");
                tvScoreA.setText(prev_score + 1 + "");

            }
        });

        butFourRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev_score = Integer.parseInt(tvScoreA.getText() + "");
                tvScoreA.setText(prev_score + 4 + "");
        }
        });

        butSixRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev_score = Integer.parseInt(tvScoreA.getText() + "");
                tvScoreA.setText(prev_score + 6 + "");
            }
        });
    }
}
