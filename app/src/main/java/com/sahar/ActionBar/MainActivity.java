package com.sahar.ActionBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText= findViewById(R.id.message);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      switch (item.getItemId()){
          case R.id.setting:
             myText.setText(getString(R.string.action_setting));
             return true;
          case R.id.itemA:
              myText.setText(getString(R.string.action_itemA));
              return true;
          case R.id.itemB:
              myText.setText(getString(R.string.action_itemB));
              return true;
          case R.id.app_bar_search:
              myText.setText(getString(R.string.action_search));
              return true;
          case R.id.home:
              myText.setText(getString(R.string.action_home));
              return true;
      }
      return true;

    }
}
