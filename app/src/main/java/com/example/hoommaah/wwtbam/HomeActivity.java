package com.example.hoommaah.wwtbam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onButtonClick(View v){
        final EditText edit =  (EditText) findViewById(R.id.inputName);
        String name = edit.getText().toString();

        Intent i = new Intent(HomeActivity.this, welcome.class);
        i.putExtra(android.content.Intent.EXTRA_TEXT, name);
        startActivity(i);

    }

}
