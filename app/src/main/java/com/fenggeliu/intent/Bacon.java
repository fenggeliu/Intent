package com.fenggeliu.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle applesData = getIntent().getExtras();
        if(applesData == null) return;
        String appleMessage = applesData.getString("appleMessage");
        final TextView baconText = (TextView) findViewById(R.id.baconText);
        baconText.setText(appleMessage);
    }
}
