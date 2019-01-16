package com.liuzq.railitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.liuzq.uikit.RailItemView;

public class MainActivity extends AppCompatActivity implements RailItemView.OnItemClickListener {

    RailItemView itemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemView = findViewById(R.id.rail_item_view);
        itemView
                .setLeftColor(getResources().getColor(android.R.color.black))
                .setLeftSize(15f)
                .setLeftText("换字")
                .isLineView(true)
                .setLineColor(getResources().getColor(R.color.red))
                .setLineParams(50, 10)
                .setListener(this);

    }

    @Override
    public void onItemClick() {
        Toast.makeText(this, "来呀！互相伤害呀。。。", Toast.LENGTH_SHORT).show();
    }
}
