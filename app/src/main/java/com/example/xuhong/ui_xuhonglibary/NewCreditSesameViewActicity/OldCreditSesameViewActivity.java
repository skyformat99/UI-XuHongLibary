package com.example.xuhong.ui_xuhonglibary.NewCreditSesameViewActicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.xuhong.ui_xuhonglibary.BaseActivity;
import com.example.xuhong.ui_xuhonglibary.R;

import java.util.Random;

import io.netopen.hotbitmapgg.view.OldCreditSesameView;

public class OldCreditSesameViewActivity extends BaseActivity {


    private OldCreditSesameView oldCreditSesameView;

    private Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_credit_sesame_view);


        oldCreditSesameView = (OldCreditSesameView) findViewById(R.id.sesame_view);
        ImageView mButton = (ImageView)findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int i = random.nextInt(950);
                oldCreditSesameView.setSesameValues(i);
            }
        });
    }
}
