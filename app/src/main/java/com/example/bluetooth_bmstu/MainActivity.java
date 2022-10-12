package com.example.bluetooth_bmstu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    private boolean isImageScaled = false;
    private static ImageView imgview;
    private static Button btn;
    private int current_image;
    int image = R.drawable.bmstuofficialskhema;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick1();
        buttonclick2();
        buttonclick3();
        buttonclick4();
    }

    public void buttonclick1()
    {
        imgview=(ImageView) findViewById(R.id.imageView);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        if (!isImageScaled) imgview.animate().scaleX(1.25f).scaleY(1.25f);
                    }
                }
        );
    }

    public void buttonclick2()
    {
        imgview=(ImageView) findViewById(R.id.imageView);
        btn=(Button) findViewById(R.id.button5);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        if (!isImageScaled) imgview.animate().scaleX(0.8f).scaleY(0.8f);
                    }
                }
        );
    }
    public void buttonclick3()
    {
        imgview=(ImageView) findViewById(R.id.imageView);
        btn=(Button) findViewById(R.id.button2);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        imgview.animate().rotation(1);
                        imgview=(ImageView) findViewById(R.id.imageView);
                    }
                }
        );
    }
    public void buttonclick4()
    {
        imgview=(ImageView) findViewById(R.id.imageView);
        btn=(Button) findViewById(R.id.button4);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        imgview.animate().rotation(-1);
                        imgview=(ImageView) findViewById(R.id.imageView);
                    }
                }
        );
    }
}
