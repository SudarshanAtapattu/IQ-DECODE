package com.newapp.iq_codes;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

/***
 * Login
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 * @apiNote using  google Authentication for google API via the firebase
 */
public class Login extends AppCompatActivity {

    private GoogleSignInClient mGoogleSignInClient;


    private final static int RC_SIGN_IN = 123;
    /**
     * RC_SIGN in is the request code that assign for starting the new activity.
     * this can be any number. When the user is done with the subsequent activity and returns,
     * the system calls  activity's onActivityResult() method
     */

    private FirebaseAuth mAuth;

    TextView ipShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        createRequest();

        findViewById(R.id.google_sign).setOnClickListener(new View.OnClickListener() {
            /***
             *  onclick sign to google account
             */
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        IP_Load();

    }


    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            /***
             * if user there is already user inside the firebase user....
             */
            Intent intent = new Intent(getApplicationContext(), Levels.class);
            startActivity(intent);
        }
    }


     //[START configure_signIn]
    /***
     *  Request only the user's ID token, which can be used to identify the
     *  securely to IQ-DECODE backend. This will contain the user's basic
     *  profile (name, profile picture URL, etc) so  should not need to
     *  make an additional call to personalize  application.
     */
    private void createRequest() {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id_new))
                .requestEmail()
                .build();
        // [END configure_signIn]
        /***
         *Build GoogleAPIClient with the Google Sign-In API and the above options.
         */
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

    }


    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
        /***
         *method sign in
         */
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /***
         *    Check which request  responding to
         */
        if (requestCode == RC_SIGN_IN) {

            //[START get_id_token]
            /***
             *
             *  This task is always completed immediately, there is no need to attach an
             *  asynchronous listener.
             */
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account);
            } catch (ApiException e) {
                Toast.makeText(Login.this, "select an account", Toast.LENGTH_SHORT).show();
            }
            // [END get_id_token]

        }

    }


    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        mAuth.signInWithCredential(credential)
                /***
                 *   Auth check  &  get selected account and  go to  levels intent
                 */
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            /***
                             *  Sign in success,update UI with the signed - in user's information
                             */
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent intent = new Intent(getApplicationContext(), Levels.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(Login.this, "sorry No internet connection", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }
    private  void IP_Load(){
        /***
         *     wifi IP address and set  to the text
         */
        ipShow = (TextView) findViewById(R.id.tvIP);
        WifiManager wifiManager = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        ipShow.setText("Player IP Address "+Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress()));
    }

}