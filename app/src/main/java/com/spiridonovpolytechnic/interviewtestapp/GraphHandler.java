package com.spiridonovpolytechnic.interviewtestapp;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/**
 * Created by aleksandrspiridonov on 3/15/17.
 */

public class GraphHandler extends Handler
{
    /* phase offset for sine wave */
    private double mXOffset = 0.0;
    /* increment size for phase offset */
    private final double DX = Math.PI/60;
    /* milliseconds delay for animation */
    private final long DELAY = 1000/30;
    /* number of data points to use in graph */
    private final int N_DATA_POINTS = 100;
    /* current graph data */
    private GraphData2D mGraphData2D;




    /*
    CONSTRUCTOR
     */
    public GraphHandler(Looper looper)
    {
        super(looper);
    }


    /*
    method to generate the graph data
    (doesn't need modification)
     */
    private void generateData()
    {
        Log.v("GraphHandler","generateData");
        double x[], y[];
        x = new double[N_DATA_POINTS];
        y = new double[N_DATA_POINTS];

        for (int i = 0; i < N_DATA_POINTS; i++)
        {
            x[i] = 2*Math.PI / (N_DATA_POINTS-1) * i;

            y[i] = Math.sin(x[i]+ mXOffset);
        }

        mGraphData2D = new GraphData2D(x,y);
    }


}
