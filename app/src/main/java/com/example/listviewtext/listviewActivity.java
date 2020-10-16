package com.example.listviewtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listviewActivity extends AppCompatActivity {
//     定义要显示的数据
    private String[]  datas= {"backpink", "lisa","jisoo","jienne","rose"};
    private ArrayAdapter<String> adapter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.firstlistview);
//      初始化适配器
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,datas);
        listView.setAdapter(adapter);
    }
}