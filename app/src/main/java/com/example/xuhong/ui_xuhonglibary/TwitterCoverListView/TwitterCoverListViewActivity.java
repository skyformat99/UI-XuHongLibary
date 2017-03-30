package com.example.xuhong.ui_xuhonglibary.TwitterCoverListView;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.xuhong.ui_xuhonglibary.R;

public class TwitterCoverListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_cover_list_view);
        TwitterCoverListView listView = (TwitterCoverListView) findViewById(R.id.layout_listview);
        listView.setHeaderImage(BitmapFactory.decodeResource(getResources(), R.drawable.img_header));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                new String[]{
                        "Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
                        "Item 6", "Item 7", "Item 8", "Item 9", "Item 10",
                        "Item 11", "Item 12", "Item 13", "Item 14", "Item 15",
                        "Item 16", "Item 17", "Item 18", "Item 19", "Item 20"
                }
        );
        listView.setAdapter(adapter);
    }
}
