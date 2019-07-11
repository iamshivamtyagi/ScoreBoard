package com.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean A=false,B=false;
    TextView tvScore;
    Button  butReset,butOneRunA,butFourRunA,butSixRunA,butOneRunB,butFourRunB,butSixRunB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butReset = findViewById(R.id.butReset);
        butOneRunB = findViewById(R.id.butOneRunB);
        butFourRunB = findViewById(R.id.butFourRunB);
        butSixRunB = findViewById(R.id.butSixRunB);
        butOneRunA = findViewById(R.id.butOneRunA);
        butFourRunA = findViewById(R.id.butFourRunA);
        butSixRunA = findViewById(R.id.butSixRunA);

        butOneRunA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A=true;
                onClickOneRun();
                A=false;
            }
        });

        butFourRunA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = true;
                onClickFourRun();
                A = false;
        }
        });

        butSixRunA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = true;
                onClickSixRun();
                A = false;
            }
        });
        butOneRunB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B = true;
                onClickOneRun();
                B = false;
            }
        });

        butFourRunB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B = true;
                onClickFourRun();
                B = false;
            }
        });

        butSixRunB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B = true;
                onClickSixRun();
                B =false;
            }
        });

        butReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickReset();
            }
        });
    }
    private void onClickSixRun(){
        if(A){
            tvScore = findViewById(R.id.tvScoreA);
        }
        if(B){
            tvScore = findViewById(R.id.tvScoreB);
        }
        int prev_score = Integer.parseInt(tvScore.getText() + "");
        tvScore.setText(prev_score + 6 + "");
    }
    private void onClickFourRun(){
        if(A){
            tvScore = findViewById(R.id.tvScoreA);
        }
        if(B){
            tvScore = findViewById(R.id.tvScoreB);
        }
        int prev_score = Integer.parseInt(tvScore.getText() + "");
        tvScore.setText(prev_score + 4 + "");
    }
    private void onClickOneRun(){
        if(A){
            tvScore = findViewById(R.id.tvScoreA);
        }
        if(B){
            tvScore = findViewById(R.id.tvScoreB);
        }
        int prev_score = Integer.parseInt(tvScore.getText() + "");
        tvScore.setText(prev_score + 1 + "");
    }


    public void onClickReset() {
        tvScore = findViewById(R.id.tvScoreA);
        tvScore.setText("0");
        tvScore = findViewById(R.id.tvScoreB);
        tvScore.setText("0");
    }
}
