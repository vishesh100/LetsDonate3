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
        setContentView(R.layout.activity_analytics);


        BarChart chart = (BarChart) findViewById(R.id.barchart1);
        BarChart chart2=findViewById(R.id.barchart2);
        BarChart chart3=findViewById(R.id.barchart3);
        BarChart chart4=findViewById(R.id.barchart4);
        BarChart chart5=findViewById(R.id.barchart5);
        BarChart chart6=findViewById(R.id.barchart6);


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

        //code for 2 GRAPH

        BarDataSet DataSet1=new BarDataSet(entries1(),"\n13-17");
       DataSet1.setColor(Color.RED);
        BarDataSet DataSet2=new BarDataSet(entries2(),"\t18-22");
        DataSet2.setColor(Color.BLUE);
        BarDataSet DataSet3=new BarDataSet(entries3(),"\t23-40");
        DataSet3.setColor(Color.MAGENTA);
        BarDataSet DataSet4=new BarDataSet(entries4(),"\n41-60");
        DataSet4.setColor(Color.GREEN);
        BarData data1=new BarData(DataSet1,DataSet2,DataSet3,DataSet4);
        chart2.setData(data1);
        XAxis axis2=chart2.getXAxis();
        axis2.setValueFormatter(new IndexAxisValueFormatter(area));
        axis2.setCenterAxisLabels(true);
        axis2.setPosition(XAxis.XAxisPosition.BOTTOM);
        axis2.setGranularity(1);
        axis2.setGranularityEnabled(true);
        chart2.setDragEnabled(true);
        chart2.setVisibleXRangeMaximum(3);

        float barspace2=0.0f;
        float groupspace2=0.6f;
        data.setBarWidth(0.12f);
        chart2.getXAxis().setAxisMinimum(0);
        chart2.getXAxis().setAxisMaximum(0+chart.getBarData().getGroupWidth(groupspace2,barspace2)*9);
        chart2.getAxisLeft().setAxisMinimum(0);
        chart2.getDescription().setEnabled(false);
        chart2.groupBars(0,groupspace2,barspace2);
        chart2.invalidate();

        //code for 3 graph

        BarDataSet Set1=new BarDataSet(entry1(),"\nPickup");
        Set1.setColor(Color.RED);
        BarDataSet Set2=new BarDataSet(entry2(),"\tDonation");
        Set2.setColor(Color.BLUE);
        BarDataSet Set3=new BarDataSet(entry3(),"\tTOtal");
        Set3.setColor(Color.MAGENTA);

        BarData data3=new BarData(Set1,Set2,Set3);
        chart3.setData(data1);
        XAxis axis3=chart3.getXAxis();
        axis3.setValueFormatter(new IndexAxisValueFormatter(area));
        axis3.setCenterAxisLabels(true);
        axis3.setPosition(XAxis.XAxisPosition.BOTTOM);
        axis3.setGranularity(1);
        axis3.setGranularityEnabled(true);
        chart3.setDragEnabled(true);
        chart3.setVisibleXRangeMaximum(3);

        float barspace3=0.04f;
        float groupspace3=0.7f;
        data.setBarWidth(0.06f);
        chart3.getXAxis().setAxisMinimum(0);
        chart3.getXAxis().setAxisMaximum(0+chart.getBarData().getGroupWidth(groupspace3,barspace3)*9);
        chart3.getAxisLeft().setAxisMinimum(0);
        chart3.getDescription().setEnabled(false);
        chart3.groupBars(0,groupspace3,barspace3);
        chart3.invalidate();




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
     private ArrayList<BarEntry> entries1()
     {
         ArrayList<BarEntry>   barEntries=new ArrayList<>();
         barEntries.add(new BarEntry(1,0));
         barEntries.add(new BarEntry(2,0));
         barEntries.add(new BarEntry(3,0));
         barEntries.add(new BarEntry(4,0));
         barEntries.add(new BarEntry(5,0));
         barEntries.add(new BarEntry(6,0));
         barEntries.add(new BarEntry(7,1));
         barEntries.add(new BarEntry(4,1));
         barEntries.add(new BarEntry(5,0));
         return barEntries;


     }

    private ArrayList<BarEntry> entries2()
    {
        ArrayList<BarEntry>   barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,1));
        barEntries.add(new BarEntry(2,5));
        barEntries.add(new BarEntry(3,9));
        barEntries.add(new BarEntry(4,3));
        barEntries.add(new BarEntry(5,4));
        barEntries.add(new BarEntry(6,5));
        barEntries.add(new BarEntry(7,7));
        barEntries.add(new BarEntry(4,20));
        barEntries.add(new BarEntry(5,24));
        return barEntries;


    }

    private ArrayList<BarEntry> entries3()
    {
        ArrayList<BarEntry>   barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,1));
        barEntries.add(new BarEntry(2,1));
        barEntries.add(new BarEntry(3,0));
        barEntries.add(new BarEntry(4,0));
        barEntries.add(new BarEntry(5,0));
        barEntries.add(new BarEntry(6,0));
        barEntries.add(new BarEntry(7,1));
        barEntries.add(new BarEntry(4,2));
        barEntries.add(new BarEntry(5,2));
        return barEntries;


    }

    private ArrayList<BarEntry> entries4()
    {
        ArrayList<BarEntry>   barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,0));
        barEntries.add(new BarEntry(2,1));
        barEntries.add(new BarEntry(3,0));
        barEntries.add(new BarEntry(4,0));
        barEntries.add(new BarEntry(5,2));
        barEntries.add(new BarEntry(6,0));
        barEntries.add(new BarEntry(7,0));
        barEntries.add(new BarEntry(4,2));
        barEntries.add(new BarEntry(5,4));
        return barEntries;


    }
    private ArrayList<BarEntry> entry1()
    {
        ArrayList<BarEntry>   barEntries1=new ArrayList<>();
        barEntries1.add(new BarEntry(1,0));
        barEntries1.add(new BarEntry(2,3));
        barEntries1.add(new BarEntry(3,1));
        barEntries1.add(new BarEntry(4,2));
        barEntries1.add(new BarEntry(5,2));
        barEntries1.add(new BarEntry(6,2));
        barEntries1.add(new BarEntry(7,3));
        barEntries1.add(new BarEntry(4,6));
        barEntries1.add(new BarEntry(5,5));
        return barEntries1;


    }

    private ArrayList<BarEntry> entry2()
    {
        ArrayList<BarEntry>   barEntries1=new ArrayList<>();
        barEntries1.add(new BarEntry(1,1));
        barEntries1.add(new BarEntry(2,2));
        barEntries1.add(new BarEntry(3,5));
        barEntries1.add(new BarEntry(4,0));
        barEntries1.add(new BarEntry(5,2));
        barEntries1.add(new BarEntry(6,1));
        barEntries1.add(new BarEntry(7,0));
        barEntries1.add(new BarEntry(4,4));
        barEntries1.add(new BarEntry(5,8));
        return barEntries1;


    }

    private ArrayList<BarEntry> entry3()
    {
        ArrayList<BarEntry>   barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,1));
        barEntries.add(new BarEntry(2,2));
        barEntries.add(new BarEntry(3,3));
        barEntries.add(new BarEntry(4,1));
        barEntries.add(new BarEntry(5,2));
        barEntries.add(new BarEntry(6,2));
        barEntries.add(new BarEntry(7,6));
        barEntries.add(new BarEntry(4,15));
        barEntries.add(new BarEntry(5,17));
        return barEntries;


    }



}
