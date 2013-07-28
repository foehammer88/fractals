package com.zenappse.fractals;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainActivity extends Activity {

    private Bitmap bitmap;
    private Canvas canvas;
    private float x, y, z;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        createGraph();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void createGraph() {
    	int[] colors = new int[10000];
    	for (int i = 0; i<10000; i++){
    		colors[i] = Color.RED;
    	}
        bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        x = 10;
        y = 10;
        canvas.drawColor(Color.WHITE);
        canvas.drawRGB(255, 0, 0);
    }

    public int getBitmapWidth() {
        if(bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    public int getBitmapHeight() {
        if(bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

}
