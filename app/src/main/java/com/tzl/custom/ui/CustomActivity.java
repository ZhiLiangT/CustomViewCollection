package com.tzl.custom.ui;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.tzl.custom.BezierEvaluator;
import com.tzl.custom.R;
import com.tzl.custom.view.LoveLayout;

public class CustomActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mStartAnimationBt;
    private LoveLayout mAnimationContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        mAnimationContainer = (LoveLayout) findViewById(R.id.container);

        mStartAnimationBt = (Button) findViewById(R.id.start_animation);
        mStartAnimationBt.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        mAnimationContainer.addLove();
    }
}
