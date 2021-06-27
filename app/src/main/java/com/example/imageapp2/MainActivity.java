package com.example.imageapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private Button btn;
    private Drawable draw,draw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);
        btn = (Button) findViewById(R.id.button);
        draw = ResourcesCompat.getDrawable(getResources(), R.drawable.filter_draft, null);
        draw1 = ResourcesCompat.getDrawable(getResources(), R.drawable.filter_draft1, null);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(img.getDrawable().getConstantState().equals(draw.getConstantState())){
                    img.setImageDrawable(draw1);
                }
                else
                    img.setImageDrawable(draw);
            }
        });
    }
}