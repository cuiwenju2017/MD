package com.example.md;

import android.app.Activity;
import android.content.Intent;;
import android.os.Bundle;;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView lv;
    private Integer[] img = {R.color.red, R.color.pink, R.color.purple, R.color.deep_purple, R.color.indigo, R.color.blue, R.color.light_blue, R.color.cyan,
            R.color.teal, R.color.green, R.color.light_green, R.color.lime, R.color.yellow, R.color.amber, R.color.orange, R.color.deep_orangr, R.color.brown,
            R.color.grey, R.color.blue_grey};
    private String[] title = {"红色/Red", "粉色/Pink", "紫色/purple", "深紫/Deep Purple", "靛蓝/Indigo", "蓝色/Blue", "亮蓝/Light Blue", "青色/Cyan",
            "鸭绿/Teal", "绿色/Green", "亮绿/Light Green", "酸橙/Lime", "黄色/Yello", "琥珀/Amber", "橙色/Orange", "暗橙/Deep Orange", "棕色/Brown",
            "灰色/grey", "蓝灰/Blue Grey"};
    private String[] colorValue = {"#F44336", "#E91E63", "#8E24AA", "#6A37B7", "#3F51B5", "#2196F3", "#03A9F4", "#00BCD4", "#009688", "#4CAF50",
            "#8BC34A", "#CDDC39", "#FFEB3B", "#FFB300", "#FF9800", "#FF5722", "#795548", "#9E9E9E", "#607D8B"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取组件
        lv = findViewById(R.id.lv);
        //生成适配器
        SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.item_lv, new String[]{"img", "title", "colorValue"},
                new int[]{R.id.iv_bg, R.id.tv_title, R.id.tv_colorValue});
        lv.setAdapter(adapter);
        //获取监听
        lv.setOnItemClickListener(this);
    }

    //遍历数据
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < img.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("img", img[i]);
            map.put("title", title[i]);
            map.put("colorValue", colorValue[i]);
            list.add(map);
        }
        return list;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (i == 0) {
            startActivity(new Intent(this, Red.class));
        }
        if (i == 1) {
            startActivity(new Intent(this, Pink.class));
        }
        if (i == 2) {
            startActivity(new Intent(this, Purple.class));
        }
        if (i == 3) {
            startActivity(new Intent(this, DeepPurple.class));
        }
        if (i == 4) {
            startActivity(new Intent(this, Indigo.class));
        }
        if (i == 5) {
            startActivity(new Intent(this, Blue.class));
        }
        if (i == 6) {
            startActivity(new Intent(this, LightBlue.class));
        }
        if (i == 7) {
            startActivity(new Intent(this, Cyan.class));
        }
        if (i == 8) {
            startActivity(new Intent(this, Teal.class));
        }
        if (i == 9) {
            startActivity(new Intent(this, Green.class));
        }
        if (i == 10) {
            startActivity(new Intent(this, LightGreen.class));
        }
        if (i == 11) {
            startActivity(new Intent(this, Lime.class));
        }
        if (i == 12) {
            startActivity(new Intent(this, Yellow.class));
        }
        if (i == 13) {
            startActivity(new Intent(this, Amber.class));
        }
        if (i == 14) {
            startActivity(new Intent(this, Orange.class));
        }
        if (i == 15) {
            startActivity(new Intent(this, DeepOrange.class));
        }
        if (i == 16) {
            startActivity(new Intent(this, Brown.class));
        }
        if (i == 17) {
            startActivity(new Intent(this, Grey.class));
        }
        if (i == 18) {
            startActivity(new Intent(this, BlueGrey.class));
        }
    }
}
