package com.example.xuhong.ui_xuhonglibary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.xuhong.ui_xuhonglibary.BarChartActivity.BarChartActivity;
import com.example.xuhong.ui_xuhonglibary.LineChartActivity.DoubleLineCharActivity;
import com.example.xuhong.ui_xuhonglibary.LineChartActivity.LineChartActivity;
import com.example.xuhong.ui_xuhonglibary.NewCreditSesameViewActicity.NewCreditSesameViewActivity;
import com.example.xuhong.ui_xuhonglibary.NewCreditSesameViewActicity.OldCreditSesameViewActivity;
import com.example.xuhong.ui_xuhonglibary.RadarViewActivity.RadarViewActivity;
import com.example.xuhong.ui_xuhonglibary.RedDointActivity.RedDointActivity;
import com.example.xuhong.ui_xuhonglibary.RippleActivity.RippleActivity;
import com.example.xuhong.ui_xuhonglibary.SimplicityRedDointActivity.SimplicityRedDointActivity;
import com.example.xuhong.ui_xuhonglibary.SwipeRefreshAcitvity.SwipeFreshActivity;
import com.example.xuhong.ui_xuhonglibary.TwitterCoverListView.TwitterCoverListViewActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    private String[] data = {"线形图", "双重轴线形图", " 条形图", "仿小圆点", "简单化小圆点"
            , "雷达图，仿英雄联盟", "下拉图模糊", "谷歌自带的下拉刷新二次定义"
            , "类似雷达的搜索特性", "新版仿芝麻分信用", "旧版仿芝麻分信用"};


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            case 0:
                startActivity(new Intent(MainActivity.this, LineChartActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, DoubleLineCharActivity.class));
                break;
            case 2:
                startActivity(new Intent(this, BarChartActivity.class));
                break;
            case 3:
                startActivity(new Intent(this, RedDointActivity.class));
                break;
            case 4:
                startActivity(new Intent(this, SimplicityRedDointActivity.class));
                break;
            case 5:
                startActivity(new Intent(this, RadarViewActivity.class));
                break;
            case 6:
                startActivity(new Intent(this, TwitterCoverListViewActivity.class));
                break;
            case 7:
                startActivity(new Intent(this, SwipeFreshActivity.class));
                break;
            case 8:
                startActivity(new Intent(this, RippleActivity.class));
                break;
            case 9:
                startActivity(new Intent(this, NewCreditSesameViewActivity.class));
                break;
            case 10:
                startActivity(new Intent(this, OldCreditSesameViewActivity.class));
                break;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.mlistView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }
}
