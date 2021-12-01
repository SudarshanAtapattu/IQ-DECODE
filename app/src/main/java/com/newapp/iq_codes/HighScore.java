package com.newapp.iq_codes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
/**
 * Score
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */
public class HighScore extends AppCompatActivity {

   ImageView backBtn;

   RecyclerView recyclerView;
   DatabaseReference dbRefer ;
   FetchAdapter fetchAdapter ;
   ArrayList<Level_Model> list ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        backBtn = findViewById(R.id.backBtn);



        backBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                /**
                 *  when back button click go to Level
                 */
                startActivity(new Intent(HighScore.this, Levels.class));
                finish();
            }
        });

        recyclerView = findViewById(R.id.userList);
        dbRefer = FirebaseDatabase.getInstance().getReference("Score");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        fetchAdapter = new FetchAdapter(this,list);
        recyclerView.setAdapter(fetchAdapter);

        dbRefer.addValueEventListener(new ValueEventListener() {

            /**
             *  get values form the fire base
             */
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                 Level_Model level_model = dataSnapshot.getValue(Level_Model.class);
                 list.add(level_model);
                }

                fetchAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}