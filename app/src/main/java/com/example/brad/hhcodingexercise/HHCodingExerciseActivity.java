package com.example.brad.hhcodingexercise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class HHCodingExerciseActivity extends Activity {

    private final static int UPPER_LIMIT = 400;
    private Secret mSecret;
    private boolean[] mPrimes;
    private boolean additive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhcoding_exercise);

        additive = true;
        mSecret = new Secret();
        mPrimes = mSecret.findPrimes(UPPER_LIMIT);

        for (int i = 2; i <= UPPER_LIMIT; i++) {
            if (mPrimes[i]) {
                int xPlusY = mSecret.secret1(i);
                int x = mSecret.secret1(i - 1);
                int y = mSecret.secret1(i - (i - 1));  // Parameter will always equal 1, but wanted to calculate it to keep the notation consistent

                if (xPlusY != (x + y)) {
                    additive = false;
                    Toast.makeText(HHCodingExerciseActivity.this, "secret1 is not additive.", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }

        if (additive) {
            Toast.makeText(HHCodingExerciseActivity.this, "secret1 is additive.", Toast.LENGTH_SHORT).show();
        }

        for (int i = 2; i <= UPPER_LIMIT; i++) {
            if (mPrimes[i]) {
                int xPlusY = mSecret.secret2(i);
                int x = mSecret.secret2(i - 1);
                int y = mSecret.secret2(i - (i - 1));  // Parameter will always equal 1, but wanted to calculate it to keep the notation consistent

                if (xPlusY != (x + y)) {
                    additive = false;
                    Toast.makeText(HHCodingExerciseActivity.this, "secret2 is not additive.", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }

        if (additive) {
            Toast.makeText(HHCodingExerciseActivity.this, "secret2 is additive.", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hhcoding_exercise, menu);
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
}
