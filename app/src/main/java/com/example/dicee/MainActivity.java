package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton=(Button)findViewById(R.id.rollButton);

        ImageView launcherDice=(ImageView)findViewById(R.id.diceLauncher);
        final ImageView diceLeft=(ImageView)findViewById(R.id.diceLeft);
        final ImageView diceRight=(ImageView) findViewById(R.id.diceRight);

        final int[] diceArray={R.drawable.dice_one,R.drawable.dice_two,R.drawable.dice_three,R.drawable.dice_four,R.drawable.dice_five,R.drawable.dice_six};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dicee","I [clicked");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);

                Log.d("dicee","the number pressed is "+number);
                diceLeft.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                diceRight.setImageResource(diceArray[number]);

            }
        });
    }
}
