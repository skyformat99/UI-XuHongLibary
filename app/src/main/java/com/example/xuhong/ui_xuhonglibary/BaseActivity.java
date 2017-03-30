package com.example.xuhong.ui_xuhonglibary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/*
 *  项目名：  UI-XuHongLibary 
 *  包名：    com.example.xuhong.ui_xuhonglibary
 *  文件名:   BaseActivity
 *  创建者:   XuHong
 *  创建时间:  2017/2/14 15:45
 *  描述：    BaseActivity
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //显示返回按钮
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //取消阴影
        getSupportActionBar().setElevation(0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //关闭当前Activity
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
