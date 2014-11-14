package com.example.sayhello;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
  
    public void launchSkype(View view) {
         TextView v = (TextView) findViewById(R.id.textView1);
         v.setText("Launching Skype!!!");
         
         Uri skypeUri = Uri.parse("skype:echo123?call&video=true");
         Intent myIntent = new Intent(Intent.ACTION_VIEW, skypeUri);
         myIntent.setComponent(new ComponentName("com.skype.raider", "com.skype.raider.Main"));
         myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
         startActivity(myIntent); 
    }
    
    public void playSaavn(View view) {
        TextView v = (TextView) findViewById(R.id.textView1);
        v.setText("Playing Saavn!!!");
        
        Intent myIntent = new Intent(Intent.ACTION_VIEW);
        myIntent.setComponent(new ComponentName("com.saavn.android", "com.saavn.android.InitActivity"));
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(myIntent); 
   }
}
