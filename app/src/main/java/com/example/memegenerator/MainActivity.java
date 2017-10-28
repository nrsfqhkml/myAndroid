package com.example.memegenerator;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This get called by the Top Fragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom) {

        BottomPictureFragment bottomFragment = (BottomPictureFragment)getSupportFragmentManager().findFragmentById(R.id.fragment3);
        bottomFragment.setMemeText(top, bottom);

    }
}
