package com.example.letsdonate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.example.letsdonate.R.color.Blue;

public class Analytics extends AppCompatActivity  {

    //private static final Object dataset = ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);


        BarChart chart = (BarChart) findViewById(R.id.barchart);

        BarDataSet barDataSet1=new BarDataSet(barEntries1(),"\nBooks");
        barDataSet1.setColor(Color.RED);
        BarDataSet barDataSet2=new BarDataSet(barEntries2(),"\tClothes");
        barDataSet2.setColor(Color.BLUE);
        BarDataSet barDataSet3=new BarDataSet(barEntries3(),"\tFood");
        barDataSet3.setColor(Color.MAGENTA);
        BarDataSet barDataSet4=new BarDataSet(barEntries4(),"\nStationery");
        barDataSet4.setColor(Color.GREEN);
        BarDataSet barDataSet5=new BarDataSet(barEntries5(),"\tMonetory");
        barDataSet5.setColor(Color.YELLOW);
        BarDataSet barDataSet6=new BarDataSet(barEntries6(),"\tUtensil");
        barDataSet6.setColor(Color.BLACK);



        BarData data=new BarData(barDataSet1,barDataSet2,barDataSet3,barDataSet4,barDataSet5,barDataSet6);
        chart.setData(data);
        String[] area=new String[]{"Central","East","NCR","North","NE","NW","South","SW","West"};
        XAxis axis=chart.getXAxis();
        axis.setValueFormatter(new IndexAxisValueFormatter(area));
        axis.setCenterAxisLabels(true);
        axis.setPosition(XAxis.XAxisPosition.BOTTOM);
        axis.setGranularity(1);
        axis.setGranularityEnabled(true);
        chart.setDragEnabled(true);
        chart.setVisibleXRangeMaximum(3);
        float barspace=0.02f;
        float groupspace=0.22f;
        data.setBarWidth(0.11f);
        chart.getXAxis().setAxisMinimum(0);
        chart.getXAxis().setAxisMaximum(0+chart.getBarData().getGroupWidth(groupspace,barspace)*9);
        chart.getAxisLeft().setAxisMinimum(0);
        chart.getDescription().setEnabled(false);
        chart.groupBars(0,groupspace,barspace);
        chart.invalidate();




    }
    private  ArrayList<BarEntry> barEntries1() {
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,2));
        barEntries.add(new BarEntry(2,7));
        barEntries.add(new BarEntry(3,7));
        barEntries.add(new BarEntry(4,3));
        barEntries.add(new BarEntry(5,4));
        barEntries.add(new BarEntry(6,3));
        barEntries.add(new BarEntry(7,6));
        barEntries.add(new BarEntry(6,15));
        barEntries.add(new BarEntry(7,18));
        return barEntries;



    }

    private  ArrayList<BarEntry> barEntries2() {
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,2));
        barEntries.add(new BarEntry(2,5));
        barEntries.add(new BarEntry(3,7));
        barEntries.add(new BarEntry(4,3));
        barEntries.add(new BarEntry(5,5));
        barEntries.add(new BarEntry(6,5));
        barEntries.add(new BarEntry(7,3));
        barEntries.add(new BarEntry(1,6));
        barEntries.add(new BarEntry(2,25));

        return barEntries;



    }
    private  ArrayList<BarEntry> barEntries3() {
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,2));
        barEntries.add(new BarEntry(2,4));
        barEntries.add(new BarEntry(3,7));
        barEntries.add(new BarEntry(4,2));
        barEntries.add(new BarEntry(5,5));
        barEntries.add(new BarEntry(6,4));
        barEntries.add(new BarEntry(7,4));
        barEntries.add(new BarEntry(1,1));
        barEntries.add(new BarEntry(2,18));

        return barEntries;



    }

    private  ArrayList<BarEntry> barEntries4() {
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,1));
        barEntries.add(new BarEntry(2,4));
        barEntries.add(new BarEntry(3,6));
        barEntries.add(new BarEntry(4,2));
        barEntries.add(new BarEntry(5,0));
        barEntries.add(new BarEntry(6,2));
        barEntries.add(new BarEntry(7,2));
        barEntries.add(new BarEntry(4,1));
        barEntries.add(new BarEntry(5,9));
        return barEntries;



    }

    private  ArrayList<BarEntry> barEntries5() {
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,0));
        barEntries.add(new BarEntry(2,3));
        barEntries.add(new BarEntry(3,4));
        barEntries.add(new BarEntry(4,1));
        barEntries.add(new BarEntry(5,3));
        barEntries.add(new BarEntry(6,4));
        barEntries.add(new BarEntry(7,1));
        barEntries.add(new BarEntry(4,2));
        barEntries.add(new BarEntry(5,15));
        return barEntries;



    }
    private  ArrayList<BarEntry> barEntries6() {
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,0));
        barEntries.add(new BarEntry(2,0));
        barEntries.add(new BarEntry(3,0));
        barEntries.add(new BarEntry(4,0));
        barEntries.add(new BarEntry(5,0));
        barEntries.add(new BarEntry(6,0));
        barEntries.add(new BarEntry(7,0));
        barEntries.add(new BarEntry(4,0));
        barEntries.add(new BarEntry(5,1));
        return barEntries;



    }


}
