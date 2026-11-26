package com.demo.ffawareness;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView screen = new TextView(this);
        screen.setText(
            "FF PANEL\n\n" +
            "⚠️ SECURITY WARNING ⚠️\n\n" +
            "This is only an educational demo.\n\n" +
            "Fake game panels may contain malware.\n" +
            "Never install APKs from unknown sources.\n\n" +
            "Your account and personal data matter!"
        );

        screen.setTextSize(21);
        screen.setTextColor(Color.WHITE);
        screen.setGravity(Gravity.CENTER);
        screen.setPadding(30, 30, 30, 30);
        screen.setBackgroundColor(Color.rgb(25, 10, 10));

        setContentView(screen);
    }
}
