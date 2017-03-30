package com.example.xuhong.ui_xuhonglibary.SimplicityRedDointActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.xuhong.ui_xuhonglibary.BaseActivity;
import com.example.xuhong.ui_xuhonglibary.R;

import q.rorbin.badgeview.Badge;
import q.rorbin.badgeview.QBadgeView;


public class SimplicityRedDointActivity extends BaseActivity {

    private ImageView imageview;

    private TextView tv_show;

    private Badge badge;

    private EditText et_number;

    //允许开启精准模式
    private Switch swicth_exact;

    //允许开启允许拖动模式
    private Switch swicth_drag;

    private Switch swicth_open;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplicity_red_doint);
        initView();
        initListener();
    }


    //监听状态
    private void initListener() {

        swicth_exact.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isCheck) {
                badge.setExactMode(isCheck);
            }
        });
        swicth_drag.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isCheck) {
                badge.setOnDragStateChangedListener(isCheck ?
                        new Badge.OnDragStateChangedListener() {
                            @Override
                            public void onDragStateChanged(int dragState, Badge badge, View targetView) {
                                switch (dragState) {
                                    case STATE_START:
                                        tv_show.setText("开始动画");
                                        break;
                                    case STATE_DRAGGING:
                                        tv_show.setText("拖动在范围内，松开手失败消除！");
                                        break;
                                    case STATE_DRAGGING_OUT_OF_RANGE:
                                        tv_show.setText("拖动在范围外，放开手成功消除！");
                                        break;
                                    case STATE_SUCCEED:
                                        tv_show.setText("消除小圆点动作成功！");
                                        break;
                                    case STATE_CANCELED:
                                        tv_show.setText("消除小圆点动作失败！");
                                        break;
                                }
                            }
                        }: null);
            }
        });


        et_number.addTextChangedListener(new MyTextWatcher());
        swicth_open.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                badge.hide(!b);
            }
        });

    }


    private void initView() {

        imageview = (ImageView) findViewById(R.id.imageview_qq);
        et_number = (EditText) findViewById(R.id.et_number);
        badge = new QBadgeView(this).bindTarget(imageview).setBadgeNumber(100).setBadgeTextSize(20f, true).setGravityOffset(3, 0, true);
        imageview = (ImageView) findViewById(R.id.imageview);
        tv_show = (TextView) findViewById(R.id.tv_show);
        swicth_exact = (Switch) findViewById(R.id.swicth_exact);
        swicth_drag= (Switch) findViewById(R.id.swicth_drag);
        swicth_open= (Switch) findViewById(R.id.swicth_open);


    }
    class MyTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s==null)return;
            int num = TextUtils.isEmpty(s) ? 0 : Integer.parseInt(s.toString());
            badge.setBadgeNumber(num);
        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    }

}


