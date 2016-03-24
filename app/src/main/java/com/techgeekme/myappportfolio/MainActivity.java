package com.techgeekme.myappportfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSpotify = (Button) findViewById(R.id.btn_spotify);
        Button btnScores = (Button) findViewById(R.id.btn_scores);
        Button btnLibrary = (Button) findViewById(R.id.btn_library);
        Button btnBuildItBigger = (Button) findViewById(R.id.btn_build);
        Button btnXYZ = (Button) findViewById(R.id.btn_xyz);
        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Spotify Streamer",Toast.LENGTH_SHORT).show();
            }
        });
        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Scores App",Toast.LENGTH_SHORT).show();
            }
        });
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Library App",Toast.LENGTH_SHORT).show();
            }
        });
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Build it Better",Toast.LENGTH_SHORT).show();
            }
        });
        btnXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"XYZ Reader",Toast.LENGTH_SHORT).show();
            }
        });
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Capstone: My Own App",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
