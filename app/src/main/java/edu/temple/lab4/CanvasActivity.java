package edu.temple.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        final String colors [] = {"Choose A Color","Red","Green","Blue", "Yellow", "Purple", "Gray", "Orange", "Brown", "Pink", "Teal" };
        Intent intent = getIntent();
        String text = intent.getStringExtra(PaletteActivity.Extra_String);
        System.out.println("c text ="+text);
        ConstraintLayout background = findViewById(R.id.colorChange);

        if (text.equals("Red")) {
                    background.setBackgroundColor(Color.RED);
                } else if (text.equals("Green")) {
                    background.setBackgroundColor(Color.GREEN);
                } else if (text.equals("Blue")) {
                    background.setBackgroundColor(Color.BLUE);
                } else if (text.equals("Yellow")) {
                    background.setBackgroundColor(Color.YELLOW);
                } else if (text.equals("Purple")) {
                    background.setBackgroundColor(Color.parseColor("Purple"));
                }else if(text.equals("Gray")) {
                    background.setBackgroundColor(Color.GRAY);
                }else if(text.equals("Orange")) {
                    background.setBackgroundColor(Color.rgb(255, 165, 0));
                }else if(text.equals("Brown")) {
                    background.setBackgroundColor(Color.rgb(139, 69, 19));
                } else if(text.equals("Pink")) {
                    background.setBackgroundColor(Color.rgb(255,105,180));
                }else if(text.equals("Teal")){
                    background.setBackgroundColor(Color.parseColor("Teal"));
                }
    }
}
