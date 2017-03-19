package com.spiridonovpolytechnic.interviewtestapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by aleksandrspiridonov on 3/14/17.
 */

public class GraphFragment extends Fragment
{
    /* Number of data points to initialize the XY data to */
    private final int N_DATA_POINTS = 100;

    /* mSeries holds the XY data for the graph */
    private LineGraphSeries<DataPoint> mSeries = null;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_graph, container, false);
        GraphView graph = (GraphView) view.findViewById(R.id.graph_screen1);

        /*
        Default initialization data...
        Actual displayed data should always represent the current
        state of data in the GraphHandler
         */

        DataPoint dataPoints[] = new DataPoint[N_DATA_POINTS];

        for (int i = 0; i < N_DATA_POINTS; i++)
        {
            double x, y;
            x = i;
            y = i;
            dataPoints[i] = new DataPoint(x,y);
        }

        mSeries = new LineGraphSeries<>(dataPoints);
        graph.addSeries(mSeries);


        return view;
    }




}
