package com.godhand.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    static {
        System.loadLibrary("godhand");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("God Hand Android Port - Executando Nativamente!");
        tv.setTextSize(20);
        tv.setPadding(40, 40, 40, 40);
        setContentView(tv);
    }
}
