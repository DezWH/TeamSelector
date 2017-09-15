package com.dez.teamselector;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Define varable result
TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get reference to widget - the  Button, EditText and show_search_text Text view
        Button selectRandomTeamButton = (Button) findViewById(R.id.select_random_team_search_button);
        final EditText Team1 = (EditText) findViewById(R.id.editText);
        final EditText Team2 = (EditText) findViewById(R.id.editText2);

        //save in my variable results which is a text view
        result = (TextView) findViewById(R.id.results);
        //final TextView confirmTeam1 = (TextView) findViewById(R.id.teams_name_1);
        selectRandomTeamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Read the text in the EditText Box

                String searchStringTeamName1 = Team1.getText().toString();
                String searchStringTeamName2 = Team2.getText().toString();

                //SelectRandomTeam.setVisibility(View.GONE);

                //Generate a random number between 0 and 1. or in other worsds
                int random = new Random().nextInt(2);

                if (random == 0) {
                    //Show Team I
                   // Team1.setVisibility(View.VISIBLE);

                result.setText(searchStringTeamName1);

                } else {
                    //Show Team 2
                 //Team2.setVisibility(View.VISIBLE);

                    result.setText(searchStringTeamName2);
                }

            }
        });  //end of event handler

    } // end of onCreate
}
