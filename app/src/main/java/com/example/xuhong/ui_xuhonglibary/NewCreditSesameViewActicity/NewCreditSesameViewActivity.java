package com.example.xuhong.ui_xuhonglibary.NewCreditSesameViewActicity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.xuhong.ui_xuhonglibary.BaseActivity;
import com.example.xuhong.ui_xuhonglibary.R;

import java.util.Random;

import io.netopen.hotbitmapgg.view.NewCreditSesameView;

public class NewCreditSesameViewActivity extends BaseActivity {


    private final int[] mColors = new int[] {
            0xFFFF80AB,
            0xFFFF4081,
            0xFFFF5177,
            0xFFFF7997
    };

    private RelativeLayout mLayout;

    private NewCreditSesameView newCreditSesameView;

    private Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_credit_sesame_view);
        initView();
    }

    private void initView() {


        mLayout = (RelativeLayout)findViewById(R.id.layout);
        ImageView mButton = (ImageView)findViewById(R.id.btn);

        newCreditSesameView = (NewCreditSesameView)findViewById(R.id.sesame_view);
        mLayout.setBackgroundColor(mColors[0]);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int i = random.nextInt(950);
                newCreditSesameView.setSesameValues(i);
                startColorChangeAnim();
            }
        });
    }



    public void startColorChangeAnim() {
        ObjectAnimator animator = ObjectAnimator.ofInt(mLayout, "backgroundColor", mColors);
        animator.setDuration(3000);
        animator.setEvaluator(new ArgbEvaluator());
        animator.start();
    }
}
