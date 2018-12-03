package com.liuzq.railitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RailItemView itemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemView = findViewById(R.id.rail_item_view);
        itemView
                .setLeftColor(getResources().getColor(android.R.color.black))
                .setLeftSize(10f)
                .setLeftText("换字")
                .isLineView(true)
                .setLineColor(getResources().getColor(R.color.red))
                .setLineParams(50, 10);

    }
}
