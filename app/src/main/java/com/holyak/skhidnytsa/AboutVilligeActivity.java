package com.holyak.skhidnytsa;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutVilligeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_villige);

        TextView txtView = (TextView)  findViewById(R.id.text2);
        txtView.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
