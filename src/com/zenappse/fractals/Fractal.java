package com.zenappse.fractals;

/**
 * Created by Mark on 8/2/13.
 */
public class Fractal {

    // Our plotting bounds, and our image dimensions in pixels
    double[] xlims, ylims;
    int width, height;

    // The Fractal's current colormap
    ColorMap colorMap = new ColorMap();

    public Fractal(ColorMap cm){

        xlims = new double[] {-1.5, 1.5};
        ylims = new double[] {-1.5, 1.5};

        width = 250; height = 250;

        colorMap = cm;

        // More coming soon ...
    }

    public void refreshFractal(){

    }

}
