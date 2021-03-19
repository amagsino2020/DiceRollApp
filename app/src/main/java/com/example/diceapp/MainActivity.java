package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnRoll;
    private int one = 0;
    private int two = 0;
    private int three = 0;
    private int four = 0;
    private int five = 0;
    private int six = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRoll = (Button) findViewById(R.id.btnRoll);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rotateDice();
            }
        });
    }

    private void rotateDice() {

        int rollNumber = (int) (Math.random() * 6 + 1);
        ImageView diceImage = findViewById(R.id.imgDice);
        TextView mResultText = findViewById(R.id.result_text);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        diceImage.startAnimation(anim);

        switch (rollNumber) {
            case 1:
                diceImage.setImageResource(R.drawable.ic_dice_one);
                mResultText.setText("One");
                Toast.makeText(this, "one", Toast.LENGTH_SHORT).show();
                one++;
                TextView txt = (TextView) findViewById(R.id.one);
                txt.setText("1: " + one);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.ic_dice_two);
                mResultText.setText("Two");
                Toast.makeText(this, "two", Toast.LENGTH_SHORT).show();
                two++;
                TextView txt1 = (TextView) findViewById(R.id.two);
                txt1.setText("2: " + two);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.ic_dice_three);
                mResultText.setText("Three");
                Toast.makeText(this, "three", Toast.LENGTH_SHORT).show();
                three++;
                TextView txt2 = (TextView) findViewById(R.id.three);
                txt2.setText("3: " + three);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.ic_dice_four);
                mResultText.setText("Four");
                Toast.makeText(this, "four", Toast.LENGTH_SHORT).show();
                four++;
                TextView txt3 = (TextView) findViewById(R.id.four);
                txt3.setText("4: " + four);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.ic_dice_five);
                mResultText.setText("Five");
                Toast.makeText(this, "five", Toast.LENGTH_SHORT).show();
                five++;
                TextView txt4 = (TextView) findViewById(R.id.five);
                txt4.setText("5: " + five);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.ic_dice_six);
                mResultText.setText("Six");
                Toast.makeText(this, "six", Toast.LENGTH_SHORT).show();
                six++;
                TextView txt5 = (TextView) findViewById(R.id.six);
                txt5.setText("6: " + six);
                break;
        }
    }
}

