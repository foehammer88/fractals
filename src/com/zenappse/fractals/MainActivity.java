package com.zenappse.fractals;

/**
 * Created by Mark on 7/29/13.
 */
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Random;
import java.lang.Math.*;

public class MainActivity extends Activity {

    Bitmap bitmap;
    Button button;
    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        image = (ImageView) findViewById(R.id.FractalView1);

        button = (Button) findViewById(R.id.buttonChangeParam);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Our window bounds for now, and our number of pixels
                double xmin = -1.5;
                double xmax = 1.5;
                double ymin = -1.5;
                double ymax = 1.5;

                int xpix = 200;
                int ypix = 200;

                // Create a random number generator and a value for parameter 'c'
                Random rand = new Random();
                double creal = .8*rand.nextDouble()-.4;
                double cimag = .8*rand.nextDouble()-.4;

                // Initiate colors, cutoff, various extras and begin our loop
                int[] colors = new int[xpix*ypix];
                double cutoff = 500000;
                int maxiters = 255;
                int pixel_count = 0;
                double x0, y0, zreal, zimag, ztmp, curnorm;
                for (int a = 1; a<=xpix; a++){
                    for (int b = 1; b<=ypix; b++){
                        x0 = ((xmax-xmin)/xpix)*a - xmax;
                        y0 = ((ymax-ymin)/ypix)*b - ymax;
                        zreal = x0;
                        zimag = y0;
                        curnorm = Math.sqrt(((zreal*zreal)+(zimag*zimag)));

                        int curcount = 1;
                        while( (curcount < maxiters) && (curnorm < cutoff) ){
                            ztmp = zreal;
                            zreal = zreal*zreal - zimag*zimag + creal;
                            zimag = 2*ztmp*zimag + cimag;

                            curnorm = Math.sqrt(((zreal*zreal)+(zimag*zimag)));
                            curcount++;
                        }
                        colors[pixel_count] = Color.rgb(curcount, 0, 0);
                        pixel_count++;
                    }
                }
                bitmap = Bitmap.createBitmap(colors, xpix, ypix, Bitmap.Config.ARGB_8888);
                image.setImageBitmap(bitmap);

                String str1 = new DecimalFormat("#.####").format(creal);
                String str2 = new DecimalFormat("#.####").format(cimag);

                TextView tv= (TextView) findViewById(R.id.currentParam);
                tv.setText("Current 'c' value: c = " + str1 + " + " + str2 + "*i");
            }

        });

    }

}
