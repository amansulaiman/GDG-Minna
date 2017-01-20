package gdgminna.blogspot.com;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class isaac extends ActionBarActivity {
    Vibrator mVibrator;

    int dot = 200; // Length of a Morse Code "dot" in milliseconds
    int dash = 500; // Length of a Morse Code "dash" in milliseconds
    int short_gap = 200; // Length of Gap Between dots/dashes
    int medium_gap = 500; // Length of Gap Between Letters
    int long_gap = 1000; // Length of Gap Between Words

    long[] pattern = { 0, // Start immediately
            dot, short_gap, dot, short_gap, dot, // s
            medium_gap, dash, short_gap, dash, short_gap, dash, // o
            medium_gap, dot, short_gap, dot, short_gap, dot, // s
            long_gap };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isaac);
        ImageView facebook=(ImageView)findViewById(R.id.imageisaac1);
        ImageView plus=(ImageView)findViewById(R.id.imageisaac2);
        ImageView tweet=(ImageView)findViewById(R.id.imageisaac3);
        ImageView link=(ImageView)findViewById(R.id.imageisaac4);
        mVibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVibrator.vibrate(100);
                String url = "https://www.facebook.com/isaac.marcus.12";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVibrator.vibrate(100);
                String url = "https://https://plus.google.com/+IsaacMarcusz";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        tweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVibrator.vibrate(100);
                String url = "";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVibrator.vibrate(100);
                String url = "http://ng.linkedin.com/pub/isaac-marcus/aa/65b/b87/en";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_isaac, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.About:
                // Code you want run when activity is clicked
                Intent mintent = new Intent(this, About.class);
                startActivity(mintent);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
