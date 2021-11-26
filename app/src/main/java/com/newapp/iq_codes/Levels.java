package com.newapp.iq_codes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
/***
 * Levels
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */
public class Levels extends AppCompatActivity {
    TextView name;
    ImageView highScore, logout;
    Button startGame;
    private String selectedTopicName = "";

    private FirebaseAuth mAuth;
    private GoogleSignInClient mGoogleSignInClient;
    private final static int RC_SIGN_IN = 123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        name = findViewById(R.id.name);
        startGame = findViewById(R.id.startLevelBtn);
        highScore = findViewById(R.id.highScore);
        logout = findViewById(R.id.logout);


        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if (signInAccount != null) {

            /***
             *   user Name Fetch from the selected google account
             */
            name.setText("Hi   " + signInAccount.getDisplayName() + " !");
        }


        highScore.setOnClickListener((view) -> {
            /***
             *  Go to score layOut(UI)
             */
            startActivity(new Intent(Levels.this, HighScore.class));
            finish();

        });


        //signOut
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id_new))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(Levels.this, gso);
        logout = findViewById(R.id.logout);
        mAuth = FirebaseAuth.getInstance();

        logout.setOnClickListener(new View.OnClickListener() {

            /***
             *  SignOut profile
             */
            @Override
            public void onClick(View v) {
                mGoogleSignInClient.signOut();
                mAuth.signOut();
                /***
                 *   when click logout image  go to logout ui
                 */
                Intent mainIntent = new Intent(Levels.this, Login.class);
                mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(mainIntent);
                finish();
            }
        });

        /***
         *  layOut casting
         */
        final LinearLayout NEWBIELayout = findViewById(R.id.NEWBIELayout);
        final LinearLayout ADVENTURERLayout = findViewById(R.id.ADVENTURERLayout);
        final LinearLayout EXPLORERLayout = findViewById(R.id.EXPLORERLayout);
        final LinearLayout SUPERSTARLayout = findViewById(R.id.SUPERSTARLayout);
        final LinearLayout CRUNKEDLayout = findViewById(R.id.CRUNKEDLayout);
        final LinearLayout SUPERUSERLayout = findViewById(R.id.SUPERUSERLayout);

        // button
        final Button startLevelBtn = findViewById(R.id.startLevelBtn);

        NEWBIELayout.setOnClickListener(new View.OnClickListener() {
            /***
             *  NEWBIE Layout level selected ,layout  edge turns blue color others normal
             */
            @Override
            public void onClick(View v) {
                /***
                 *   assign with selected topic name
                 */
                selectedTopicName = "NEWBIE";

                /***
                 *   selected layout
                 */
                NEWBIELayout.setBackgroundResource(R.drawable.round_back_white_stroke11);



                /***
                 *   deselected layout
                 */
                ADVENTURERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                EXPLORERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERSTARLayout.setBackgroundResource(R.drawable.round_back_white_10);
                CRUNKEDLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERUSERLayout.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });


        ADVENTURERLayout.setOnClickListener(new View.OnClickListener() {
            /***
             *  ADVENTURER Layout ClickEvent ,layout  edge turns blue color others normal
             */
            @Override
            public void onClick(View v) {
                /***
                 *   assign with selected topic name
                 */
                selectedTopicName = "ADVENTURER";

                /***
                 *   selected layout
                 */
                ADVENTURERLayout.setBackgroundResource(R.drawable.round_back_white_stroke11);


                /***
                 *   deselected layout
                 */
                NEWBIELayout.setBackgroundResource(R.drawable.round_back_white_10);
                EXPLORERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERSTARLayout.setBackgroundResource(R.drawable.round_back_white_10);
                CRUNKEDLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERUSERLayout.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });


        EXPLORERLayout.setOnClickListener(new View.OnClickListener() {
            /***
             * EXPLORER Layout ClickEvent ,layout  edge turns blue color others normal
             */
            @Override
            public void onClick(View v) {
                /***
                 *   assign with selected topic name
                 */
                selectedTopicName = "EXPLORER";

                /***
                 *   selected layout
                 */
                EXPLORERLayout.setBackgroundResource(R.drawable.round_back_white_stroke11);


                /***
                 *   deselected layout
                 */
                NEWBIELayout.setBackgroundResource(R.drawable.round_back_white_10);
                ADVENTURERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERSTARLayout.setBackgroundResource(R.drawable.round_back_white_10);
                CRUNKEDLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERUSERLayout.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });

        SUPERSTARLayout.setOnClickListener(new View.OnClickListener() {
            /***
             *  SUPERSTAR Layout ClickEvent ,layout  edge turns blue color others normal
             */
            @Override
            public void onClick(View v) {
                /***
                 *   assign with selected topic name
                 */
                selectedTopicName = "SUPERSTAR";

                /***
                 *   selected laout
                 */
                SUPERSTARLayout.setBackgroundResource(R.drawable.round_back_white_stroke11);


                /***
                 *   deSelected layout
                 */
                NEWBIELayout.setBackgroundResource(R.drawable.round_back_white_10);
                ADVENTURERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                EXPLORERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                CRUNKEDLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERUSERLayout.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });

        CRUNKEDLayout.setOnClickListener(new View.OnClickListener() {
            /***
             *  CRUNKED Layout ClickEvent ,layout  edge turns blue color others normal
             */
            @Override
            public void onClick(View v) {
                /***
                 *   assign with selected topic name
                 */
                selectedTopicName = "CRUNKED";

                /***
                 *   selected layout
                 */
                CRUNKEDLayout.setBackgroundResource(R.drawable.round_back_white_stroke11);

                /***
                 *   deselected layout
                 */
                NEWBIELayout.setBackgroundResource(R.drawable.round_back_white_10);
                ADVENTURERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                EXPLORERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERSTARLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERUSERLayout.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });


        SUPERUSERLayout.setOnClickListener(new View.OnClickListener() {
            /***
             *  SUPERUSER Layout ClickEvent  ,layout  edge turns blue color others normal
             */
            @Override
            public void onClick(View v) {
                /***
                 *   assign with selected topic name
                 */
                selectedTopicName = "SUPERUSER";

                /***
                 *   selected layout
                 */
                SUPERUSERLayout.setBackgroundResource(R.drawable.round_back_white_stroke11);

                /***
                 *   deselected layout
                 */
                NEWBIELayout.setBackgroundResource(R.drawable.round_back_white_10);
                ADVENTURERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                EXPLORERLayout.setBackgroundResource(R.drawable.round_back_white_10);
                SUPERSTARLayout.setBackgroundResource(R.drawable.round_back_white_10);
                CRUNKEDLayout.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(Levels.this, "Please Select Level", Toast.LENGTH_SHORT).show();
                } else {
                    /***
                     *  create an object of intent  to open quiz question screen
                     */
                    Intent intent = new Intent(Levels.this, Game.class);

                    /***
                     *  put user entered  name and selected  topic nam to intent for use in next activity
                     */
                    intent.putExtra("selectedLevel", selectedTopicName);
                    startActivity(intent);
                }
            }
        });


    }


}