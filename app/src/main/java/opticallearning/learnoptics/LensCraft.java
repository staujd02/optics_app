package opticallearning.learnoptics;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.*;
import android.os.Bundle;

import org.w3c.dom.Text;

/**
 * Created by Joel on 6/27/2016.
 */

public class LensCraft extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lenscraft);
        setTitle("Lens Crafter");
        init();
    }

    @Override
    public void onBackPressed() {
        //your code when back button pressed
        startActivity(new Intent(LensCraft.this, MainActivity.class));
    }

    private void init() {
        //Create laser objects
        // - put into array

        //Create lens objects
        // - load in from .json


    }
}