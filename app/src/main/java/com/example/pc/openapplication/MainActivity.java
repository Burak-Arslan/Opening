package com.example.pc.openapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout lnrRocket, lnrSpace;
    Button btnAbone;
    Animation updown, downUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init() {

        lnrRocket = (LinearLayout) findViewById(R.id.lnrRocket);
        lnrSpace = (LinearLayout) findViewById(R.id.lnrSpace);
        btnAbone = (Button) findViewById(R.id.btnAbone);
        updown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.updown);
        downUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.downtoup);
        lnrSpace.setAnimation(updown);
        lnrRocket.setAnimation(downUp);
    }
}
