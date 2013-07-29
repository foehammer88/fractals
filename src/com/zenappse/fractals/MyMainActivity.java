package com.zenappse.fractals;

/**
 * Created by Mark on 7/29/13.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Random;

public class MyMainActivity extends Activity {

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

        button = (Button) findViewById(R.id.buttonChangeColors);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Random rand = new Random();
                int thisImage = rand.nextInt(10);
                if(thisImage==0){ image.setImageResource(R.drawable.z2_mandelbrot_bone); }
                else if (thisImage==1) { image.setImageResource(R.drawable.z2_mandelbrot_bone_inv); }
                else if (thisImage==2) { image.setImageResource(R.drawable.z2_mandelbrot_copper); }
                else if (thisImage==3) { image.setImageResource(R.drawable.z2_mandelbrot_hot); }
                else if (thisImage==4) { image.setImageResource(R.drawable.z2_mandelbrot_hsv); }
                else if (thisImage==5) { image.setImageResource(R.drawable.z2_mandelbrot_hsv_inv); }
                else if (thisImage==6) { image.setImageResource(R.drawable.z2_mandelbrot_jet); }
                else if (thisImage==7) { image.setImageResource(R.drawable.z2_mandelbrot_jet_inv); }
                else if (thisImage==8) { image.setImageResource(R.drawable.z2_mandelbrot_spring_inv); }
                else if (thisImage==9) { image.setImageResource(R.drawable.z2_mandelbrot_winter); }
            }

        });

    }

}
