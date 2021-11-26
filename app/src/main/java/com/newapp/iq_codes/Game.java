package com.newapp.iq_codes;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/***
 * Game
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */

public class Game extends AppCompatActivity {


    public static String getText = "";
    private TextView questions;
    private TextView question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13, question14, question15;
    private TextView clue1, clue2, clue3, clue4, clue5;
    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextBtn;

    //time
    private static final long START_TIME_IN_MILLIS = 240000; //starting time 240000 -> 4 Minutes
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    TextView timer;

    private List<GameQuestionList> questionLists;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView selectedTopicName = findViewById(R.id.selectedTopicName);

        timer = findViewById(R.id.timer);

        /***
         * cast  timer TextView
         */
        questions = findViewById(R.id.questions);

        /***
         * cast  clue TextView
         */
        clue1 = findViewById(R.id.clue1);
        clue2 = findViewById(R.id.clue2);
        clue3 = findViewById(R.id.clue3);
        clue4 = findViewById(R.id.clue4);
        clue5 = findViewById(R.id.clue5);

        /***
         * cast  question TextView
         */
        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);
        question4 = findViewById(R.id.question4);
        question5 = findViewById(R.id.question5);
        question6 = findViewById(R.id.question6);
        question7 = findViewById(R.id.question7);
        question8 = findViewById(R.id.question8);
        question9 = findViewById(R.id.question9);
        question10 = findViewById(R.id.question10);
        question11 = findViewById(R.id.question11);
        question12 = findViewById(R.id.question12);
        question13 = findViewById(R.id.question13);
        question14 = findViewById(R.id.question14);
        question15 = findViewById(R.id.question15);

        /***
         *  cast option Button
         */
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        nextBtn = findViewById(R.id.nextBtn);

        /***
         *  get topicSelectedTopic name from  Level Activity via Intent
         */
        final String getSelectedTopicName = getIntent().getStringExtra("selectedLevel");
        getText = getSelectedTopicName;

        /***
         * set name to topic name
         */
        selectedTopicName.setText(getSelectedTopicName);

        startTime(); // game timer
        /***
         * set current question to text view along with option from array list
         */
        questionLists = GameQuestionBank.getQuestions(getSelectedTopicName);
        questions.setText((currentQuestionPosition + 1) + "/" + questionLists.size());
        question1.setText(questionLists.get(0).getQuestion1());
        question2.setText(questionLists.get(0).getQuestion2());
        question3.setText(questionLists.get(0).getQuestion3());
        question4.setText(questionLists.get(0).getQuestion4());
        question5.setText(questionLists.get(0).getQuestion5());
        question6.setText(questionLists.get(0).getQuestion6());
        question7.setText(questionLists.get(0).getQuestion7());
        question8.setText(questionLists.get(0).getQuestion8());
        question9.setText(questionLists.get(0).getQuestion9());
        question10.setText(questionLists.get(0).getQuestion10());
        question11.setText(questionLists.get(0).getQuestion11());
        question12.setText(questionLists.get(0).getQuestion12());
        question13.setText(questionLists.get(0).getQuestion13());
        question14.setText(questionLists.get(0).getQuestion14());
        question15.setText(questionLists.get(0).getQuestion15());

        clue1.setText(questionLists.get(0).getClue1());
        clue2.setText(questionLists.get(0).getClue2());
        clue3.setText(questionLists.get(0).getClue3());
        clue4.setText(questionLists.get(0).getClue4());
        clue5.setText(questionLists.get(0).getClue5());


        option1.setText(questionLists.get(0).getOption1());
        option2.setText(questionLists.get(0).getOption2());
        option3.setText(questionLists.get(0).getOption3());
        option4.setText(questionLists.get(0).getOption4());


        Collections.shuffle(questionLists, new Random(System.nanoTime())); // random 




        option1.setOnClickListener(new View.OnClickListener() {
            /***
             *  check if player has not  attempted this question yet
             */
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option1.getText().toString();
                    /***
                     * change selected AppCompatButton background color and text color
                     */
                    option1.setBackgroundResource(R.drawable.stroke_wrong_red);
                    option1.setTextColor(Color.WHITE);

                    /***
                     * revelAnswer answer
                     */
                    revelAnswer();

                    /***
                     * assign player answer values to userSelectedOption in GameQuestionList class
                     */
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            /***
             *  check if player has not  attempted this question yet
             */
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option2.getText().toString();
                    /***
                     * change selected AppCompatButton background color and text color
                     */
                    option2.setBackgroundResource(R.drawable.stroke_wrong_red);
                    option2.setTextColor(Color.WHITE);

                    /***
                     * revelAnswer answer
                     */
                    revelAnswer();

                    /***
                     * assign player answer values to userSelectedOption in GameQuestionList class
                     */
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            /***
             *  check if player has not  attempted this question yet
             */
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option3.getText().toString();
                    /***
                     * change selected AppCompatButton background color and text color
                     */

                    option3.setBackgroundResource(R.drawable.stroke_wrong_red);
                    option3.setTextColor(Color.WHITE);
                    /***
                     * revelAnswer answer
                     */
                    revelAnswer();

                    /***
                     * assign player answer values to userSelectedOption in GameQuestionList class
                     */
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            /***
             *  check if player has not  attempted this question yet
             */
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option4.getText().toString();
                    /***
                     * change selected AppCompatButton background color and text color
                     */
                    option4.setBackgroundResource(R.drawable.stroke_wrong_red);
                    option4.setTextColor(Color.WHITE);
                    /***
                     * revelAnswer answer
                     */
                    revelAnswer();

                    /***
                     * assign player answer values to userSelectedOption in GameQuestionList class
                     */
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /***
                 * check if user has not selected any option yet
                 */
                if (selectedOptionByUser.isEmpty()) {


                    Toast.makeText(Game.this, "Please select an option", Toast.LENGTH_SHORT).show();
                } else {
                    changeNextQuestion();
                }

            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /***
                 * back button to  go to levels 7 stop time
                 */
                stopTime();
                startActivity(new Intent(Game.this, Levels.class));
                finish();
            }
        });
        updateCountdownText();
    }


    private void startTime() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            /***
             * count down interval 1000 = 1Second
             */
            @Override
            public void onTick(long millisUntilFinished) {
                /***
                 * timer count down start 04:00 -> 00:00
                 * player has 4 mints to complete the level
                 */
                mTimeLeftInMillis = millisUntilFinished;
                updateCountdownText();
            }

            @Override
            public void onFinish() {

                /***
                 * timer cancel &  00 : 00
                 */
                mCountDownTimer.cancel();
                mTimeLeftInMillis = 0;
                updateCountdownText();

            }
        }.start();
    }


    private void stopTime() {
        /***
         *  stop timer
         */
        mCountDownTimer.cancel();
    }

    private void updateCountdownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        /***
         *  set timer as 00 : 00 format
         */
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timer.setText(timeLeftFormatted);

        if (seconds == 00 && minutes == 00) {  // 1 second game ->
            /***
             * if timer value get 00:00 game over and  correct answer,incorrect answer and  put
             * for the Victory Intent
             *
             *
             */

            Toast.makeText(Game.this, "Time is over", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Game.this, Victory.class);
            intent.putExtra("correct", getCorrectAnswer()); // correct -> victory
            intent.putExtra("incorrect", getInCorrectAnswer()); // incorrect -> victory

            intent.putExtra("time", timer.getText()); // time -> victory
            startActivity(intent);
            finish();
        }
    }

    private void changeNextQuestion() {
        /***
         * change question
         */
        currentQuestionPosition++;
        if ((currentQuestionPosition + 1) == questionLists.size()) {
            /***
             *   final question change name submit code
             */
            nextBtn.setText("Submit Code");
        }
        if (currentQuestionPosition < questionLists.size()) {
            selectedOptionByUser = "";
            /***
             * set background text  #1F6888 and  background  round_back_white_10
             */
            option1.setBackgroundResource(R.drawable.round_back_white_10);
            option1.setTextColor(Color.parseColor("#1F6888"));

            option2.setBackgroundResource(R.drawable.round_back_white_10);
            option2.setTextColor(Color.parseColor("#1F6888"));

            option3.setBackgroundResource(R.drawable.round_back_white_10);
            option3.setTextColor(Color.parseColor("#1F6888"));

            option4.setBackgroundResource(R.drawable.round_back_white_10);
            option4.setTextColor(Color.parseColor("#1F6888"));

            /***
             * set current question to textView along  with  options from  GameQuestionLists ArrayList
             */
            questions.setText((currentQuestionPosition + 1) + "/" + questionLists.size());
            question1.setText(questionLists.get(currentQuestionPosition).getQuestion1());
            question2.setText(questionLists.get(currentQuestionPosition).getQuestion2());
            question3.setText(questionLists.get(currentQuestionPosition).getQuestion3());
            question4.setText(questionLists.get(currentQuestionPosition).getQuestion4());
            question5.setText(questionLists.get(currentQuestionPosition).getQuestion5());
            question6.setText(questionLists.get(currentQuestionPosition).getQuestion6());
            question7.setText(questionLists.get(currentQuestionPosition).getQuestion7());
            question8.setText(questionLists.get(currentQuestionPosition).getQuestion8());
            question9.setText(questionLists.get(currentQuestionPosition).getQuestion9());
            question10.setText(questionLists.get(currentQuestionPosition).getQuestion10());
            question11.setText(questionLists.get(currentQuestionPosition).getQuestion11());
            question12.setText(questionLists.get(currentQuestionPosition).getQuestion12());
            question13.setText(questionLists.get(currentQuestionPosition).getQuestion13());
            question14.setText(questionLists.get(currentQuestionPosition).getQuestion14());
            question15.setText(questionLists.get(currentQuestionPosition).getQuestion15());

            /***
             * set values clue
             */
            clue1.setText(questionLists.get(currentQuestionPosition).getClue1());
            clue2.setText(questionLists.get(currentQuestionPosition).getClue2());
            clue3.setText(questionLists.get(currentQuestionPosition).getClue3());
            clue4.setText(questionLists.get(currentQuestionPosition).getClue4());
            clue5.setText(questionLists.get(currentQuestionPosition).getClue5());

            /***
             * set values answers
             */
            option1.setText(questionLists.get(currentQuestionPosition).getOption1());
            option2.setText(questionLists.get(currentQuestionPosition).getOption2());
            option3.setText(questionLists.get(currentQuestionPosition).getOption3());
            option4.setText(questionLists.get(currentQuestionPosition).getOption4());


        } else {
            /***
             *  pass values to the victory(incorrect ,correct, time)
             */
            Intent intent = new Intent(Game.this, Victory.class);
            intent.putExtra("correct", getCorrectAnswer()); // correct -> victory
            intent.putExtra("incorrect", getInCorrectAnswer()); // incorrect -> victory
            intent.putExtra("time", timer.getText()); // time -> victory


            startActivity(intent);
            finish();
        }

    }

    private int getCorrectAnswer() {
        /***
         *  calculate correct answer from the questionList
         */
        int correctAnswer = 0;
        for (int i = 0; i < questionLists.size(); i++) {
            final String getUserCorrectAnswer = questionLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionLists.get(i).getAnswer();
            if (getUserCorrectAnswer.equals(getAnswer)) {
                correctAnswer++;
            }

        }
        return correctAnswer;
    }

    private int getInCorrectAnswer() {
        /***
         *  calculate incorrect answer from the questionList
         */
        int correctAnswer = 0;
        for (int i = 0; i < questionLists.size(); i++) {
            final String getUserCorrectAnswer = questionLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionLists.get(i).getAnswer();
            if (!getUserCorrectAnswer.equals(getAnswer)) {
                correctAnswer++;
            }

        }
        return correctAnswer;
    }

    @Override
    public void onBackPressed() {
        /***
         * when back press  stop time and go to Levels
         */
        stopTime();
        startActivity(new Intent(Game.this, Levels.class));
        finish();
    }

    private void revelAnswer() {
        /***
         * set correct answers  green colors and  texts  are white color
         */
        final String getAnswer = questionLists.get(currentQuestionPosition).getAnswer();
        if (option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.stroke_correct_greeen);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.stroke_correct_greeen);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.stroke_correct_greeen);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.stroke_correct_greeen);
            option4.setTextColor(Color.WHITE);
        }
    }




}