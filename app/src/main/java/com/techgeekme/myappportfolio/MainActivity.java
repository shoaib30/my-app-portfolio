package com.techgeekme.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
                Toast.makeText(getApplicationContext(),R.string.strSpotify,Toast.LENGTH_SHORT).show();
            }
        });
        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.strScores,Toast.LENGTH_SHORT).show();
            }
        });
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.strLibrary,Toast.LENGTH_SHORT).show();
            }
        });
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.strBuild,Toast.LENGTH_SHORT).show();
            }
        });
        btnXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.strXyz,Toast.LENGTH_SHORT).show();
            }
        });
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.strCapstone,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
