package com.example.colormyviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {

        int viewId = view.getId();

        switch (viewId) {
            case R.id.tvLabelUm:
                view.setBackgroundColor(Color.DKGRAY);
                return;
            case R.id.tvLabelDois:
                view.setBackgroundColor(Color.GRAY);
                return;
            case R.id.tvLabelTres:
                view.setBackgroundColor(Color.RED);
                return;
            case R.id.tvLabelQuatro:
                view.setBackgroundColor(Color.YELLOW);
                return;
            case R.id.tvLabelCinco:
                view.setBackgroundColor(Color.BLUE);
                return;
        }

    }

}