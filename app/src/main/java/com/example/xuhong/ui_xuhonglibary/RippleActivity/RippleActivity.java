package com.example.xuhong.ui_xuhonglibary.RippleActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.xuhong.ui_xuhonglibary.BaseActivity;
import com.example.xuhong.ui_xuhonglibary.R;
import com.skyfishjy.library.RippleBackground;

public class RippleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple);

        final RippleBackground rippleBackground=(RippleBackground)findViewById(R.id.content);

        rippleBackground.startRippleAnimation();
        ImageView imageView=(ImageView)findViewById(R.id.centerImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rippleBackground.stopRippleAnimation();

            }
        });
    }
}
