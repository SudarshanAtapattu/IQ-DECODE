package com.newapp.iq_codes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/***
 * Victory
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */
public class Victory extends AppCompatActivity {
    TextView getLevel, correctAnswer, incorrectAnswer, winnerName, tvTime;
    ImageView winLogo;
    DatabaseReference highScore;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);

        winLogo = findViewById(R.id.winLogo);
        winnerName = findViewById(R.id.winnerName);
        getLevel = findViewById(R.id.getLevel);
        correctAnswer = findViewById(R.id.correctAnswer);
        incorrectAnswer = findViewById(R.id.incorrectAnswer);
        tvTime = findViewById(R.id.tvTime);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewGame);

        final TextView won = findViewById(R.id.won);
        final String selectedTopicName = Game.getText;


        /***
         *  get values form the game correct question ,incorrect question and time
         */
        final int getCorrectAnswer = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswer = getIntent().getIntExtra("incorrect", 0);
        final String getTime = getIntent().getStringExtra("time");


        /***
         *  set values form the game correct question ,incorrect question and time to the victory UI
         */
        correctAnswer.setText(String.valueOf(getCorrectAnswer));
        incorrectAnswer.setText(String.valueOf(getIncorrectAnswer));
        getLevel.setText(String.valueOf(selectedTopicName));
        tvTime.setText(String.valueOf(getTime));

        /***
         *  get Reference from the firebase  Score
         */
        highScore = FirebaseDatabase.getInstance().getReference().child("Score");

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /***
                 *   showing  correct question ,incorrect question and time to the victory UI return to the level for get new level
                 */
                startActivity(new Intent(Victory.this, Levels.class)); //   back to level
                finish();
                insertLevelData();
            }
        });


        if (getIncorrectAnswer > 1) {
            /***
             *   player get  getIncorrectAnswer > 1  display  "You Lose ! Try again ! "
             */
            won.setText("You Lose ! Try again ! ");
            winLogo.setBackgroundResource(R.drawable.lost_thropy);
        } else {
            /***
             *   Congrats You win !!
             */
            won.setText("Congrats You win !!");
            winLogo.setBackgroundResource(R.drawable.thropycup);
        }

        /***
         *   Player name  fetch  from the google SignIn account
         */
        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if (signInAccount != null) {
            winnerName.setText(signInAccount.getDisplayName());
        }
    }

    @Override
    public void onBackPressed() {
        /***
         *   Player press back  go to levels
         */
        startActivity(new Intent(Victory.this, Levels.class)); // back to level
        finish();
    }


    private void insertLevelData() {
        /***
         *   insert data to the fireBase
         */
        String level = getLevel.getText().toString();
        String correct = correctAnswer.getText().toString();
        String incorrect = incorrectAnswer.getText().toString();
        String name = winnerName.getText().toString();
        String time = tvTime.getText().toString();
        Level_Model level_model = new Level_Model(level, correct, incorrect, name, time);
        highScore.push().setValue(level_model);

    }

}