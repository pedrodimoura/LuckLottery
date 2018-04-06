package com.github.pedrodimoura.lotteryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.pedrodimoura.lucklottery.LuckyLottery;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] luckyNumbers = LuckyLottery.instance().showMeLuckyNumbers(this);

        StringBuilder sb = new StringBuilder();

        for (int luckyNumber : luckyNumbers) {
            sb.append(String.valueOf(luckyNumber));
            sb.append(" ");
        }

        TextView textView = findViewById(R.id.text_view);
        textView.setText(sb.toString());

    }
}
