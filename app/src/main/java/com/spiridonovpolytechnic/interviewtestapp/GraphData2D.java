package com.spiridonovpolytechnic.interviewtestapp;

import com.jjoe64.graphview.series.DataPoint;

import java.util.ArrayList;

/**
 * Created by aleksandrspiridonov on 3/1/17.
 */


    /*
    "IMPLEMENTS PARCELABLE"
    REMOVE FOR TEST
     */
public class GraphData2D
{
    private ArrayList<Double> mX;
    private ArrayList<Double> mY;

    public GraphData2D(ArrayList<Double> mX, ArrayList<Double> mY)
    {
        this.mX = mX;
        this.mY = mY;
    }

    public GraphData2D(double[] mX, double[] mY)
    {
        this.mX = new ArrayList<Double>();
        this.mY = new ArrayList<Double>();
        for (int i = 0; i < mX.length; i++)
        {
            this.mX.add(mX[i]);
            this.mY.add(mY[i]);
        }

    }

    public DataPoint[] getDataPoints()
    {
        DataPoint[] dataPoints = new DataPoint[mX.size()];
        for (int i = 0; i<mX.size(); i++)
        {
            dataPoints[i] = new DataPoint(mX.get(i), mY.get(i));
        }
        return dataPoints;
    }

    public ArrayList<Double> getX()
    {
        return mX;
    }

    public ArrayList<Double> getY()
    {
        return mY;
    }

}
