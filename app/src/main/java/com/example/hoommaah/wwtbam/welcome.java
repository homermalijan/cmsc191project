package com.example.hoommaah.wwtbam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hoommaah on 5/13/17.
 */

public class welcome extends Activity{
    String username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

//        this.username = getIntent().getStringExtra(“name”);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        // get data via the key
        String value1 = extras.getString(Intent.EXTRA_TEXT);
        if (value1 != null) {
            this.username = value1;
            // do something with the data
        }
        TextView myAwesomeTextView = (TextView)findViewById(R.id.welcomeText);
        myAwesomeTextView.setText(this.username);
    }

    public void onButtonClick(View v){
        Intent i = new Intent(welcome.this, question.class);
        startActivity(i);
    }
}
