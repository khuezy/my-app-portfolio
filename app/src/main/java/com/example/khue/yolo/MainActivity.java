package com.example.khue.yolo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button spotifyStreamer, scoresApp, libraryApp, buildItBigger, xyzReader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamer = (Button) findViewById(R.id.b_spotify_streamer);
        scoresApp = (Button) findViewById(R.id.b_scores_app);
        libraryApp = (Button) findViewById(R.id.b_library_app);
        buildItBigger = (Button) findViewById(R.id.b_build_it_bigger);
        xyzReader = (Button) findViewById(R.id.b_xyz_reader);



    }

    public void buttonOnClickHandler(View v) {
        Toast toast;
        String text;
        switch (v.getId()) {
            case R.id.b_spotify_streamer:
                text = "Spotify App!";
                break;
            case R.id.b_scores_app:
                text = "Scores App!";
                break;
            case R.id.b_library_app:
                text = "Library App!";
                break;
            case R.id.b_build_it_bigger:
                text = "Build It Bigger!";
                break;
            case R.id.b_xyz_reader:
                text = "XYZ Reader!";
                break;
            default:
                text = "UNKNOWN APP!";
                break;
        }
        toast = Toast.makeText(this, text, Toast.LENGTH_LONG);

        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
