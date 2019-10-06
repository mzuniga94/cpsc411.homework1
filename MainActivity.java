package com.csuf.cpsc411.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeRoot = new RelativeLayout(this);

        // Create the first row with columns of numbers.
        GridLayout numberGrid = new GridLayout(this);

        for(int i = 1; i < 12; i++) {
            TextView tv = new TextView(this);
            tv.setText("" + i);
            tv.setWidth(90);
            tv.setHeight(75);
            tv.setBackgroundColor(Color.LTGRAY);
            tv.setTextAlignment(tv.TEXT_ALIGNMENT_CENTER);

            GridLayout.Spec rowSpec = GridLayout.spec(i-1);
            GridLayout.Spec colSpec = GridLayout.spec(0);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
            tv.setLayoutParams(params);

            numberGrid.addView(tv);
        }
        relativeRoot.addView(numberGrid);

        // Create column 1, row 0
        GridLayout helloGrid = new GridLayout(this);
        TextView tv = new TextView(this);
        helloGrid.setColumnCount(1);
        helloGrid.setRowCount(1);
        tv.setText("Rules void hello1(int hour)");
        tv.setHeight(90);
        tv.setWidth(1000);
        tv.setGravity(Gravity.CENTER);
        tv.setTextAlignment(helloGrid.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        GridLayout.Spec rowSpec = GridLayout.spec(0, GridLayout.FILL);
        GridLayout.Spec colSpec = GridLayout.spec(0, GridLayout.FILL);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 90;
        tv.setLayoutParams(params);
        helloGrid.addView(tv);
        relativeRoot.addView(helloGrid);

        // Create "properties" column 1, row 1
        GridLayout propertiesGrid = new GridLayout(this);
        propertiesGrid.setColumnCount(1);
        propertiesGrid.setRowCount(9);
        TextView propertiesText = new TextView(this);
        propertiesText.setText("properties");
        propertiesText.setHeight(100);
        propertiesText.setWidth(300);

        // Set the GridLayout specs
        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams propertiesParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        propertiesParams.leftMargin = 100;
        propertiesParams.topMargin = 100;
        propertiesText.setLayoutParams(propertiesParams);
        propertiesGrid.addView(propertiesText);

        // Col 1, Row 4
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setHeight(90);
        tv.setWidth(200);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(propertiesGrid.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams ruleParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        ruleParams.leftMargin = 90;
        tv.setLayoutParams(ruleParams);
        propertiesGrid.addView(tv);

        // Col 1, Row 3
        tv = new TextView(this);
        tv.setText("");
        tv.setHeight(90);
        tv.setWidth(200);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(propertiesGrid.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(2);
        colSpec = GridLayout.spec(0);
        ruleParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        ruleParams.leftMargin = 90;
        tv.setLayoutParams(ruleParams);
        propertiesGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        tv.setHeight(90);
        tv.setWidth(200);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(propertiesGrid.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(3);
        colSpec = GridLayout.spec(0);
        ruleParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        ruleParams.leftMargin = 90;
        tv.setLayoutParams(ruleParams);
        propertiesGrid.addView(tv);

        // Col 1, Row 5
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setHeight(75);
        tv.setWidth(200);
        tv.setTextAlignment(propertiesGrid.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(4);
        colSpec = GridLayout.spec(0);
        ruleParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        ruleParams.leftMargin = 90;
        tv.setLayoutParams(ruleParams);
        propertiesGrid.addView(tv);

        // Col 1, Row 6-11
        for(int i = 1; i < 5; i++) {
            tv = new TextView(this);
            tv.setText("R" + (i * 10));
            tv.setHeight(75);
            tv.setWidth(300);
            tv.setGravity(Gravity.CENTER);
            tv.setTextAlignment(propertiesGrid.TEXT_ALIGNMENT_TEXT_START);
            tv.setTypeface(Typeface.DEFAULT_BOLD);
            rowSpec = GridLayout.spec(4+i);
            colSpec = GridLayout.spec(0);
            ruleParams = new GridLayout.LayoutParams(rowSpec, colSpec);
            ruleParams.leftMargin = 90;
            tv.setLayoutParams(ruleParams);
            propertiesGrid.addView(tv);
        }

        relativeRoot.addView(propertiesGrid);

        // Create "names/category" column 2, row 1
        GridLayout categoriesGrid = new GridLayout(this);
        categoriesGrid.setColumnCount(2);
        categoriesGrid.setRowCount(2);
        TextView namesText = new TextView(this);
        namesText.setText("name");
        namesText.setHeight(50);
        namesText.setWidth(400);
        namesText.setGravity(Gravity.CENTER);

        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams namesParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        namesParams.leftMargin = 200;
        namesParams.topMargin = 100;
        namesText.setLayoutParams(namesParams);
        categoriesGrid.addView(namesText);

        TextView categoryText = new TextView(this);
        categoryText.setText("category");
        categoryText.setHeight(50);
        categoryText.setWidth(400);
        categoryText.setGravity(Gravity.CENTER);

        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(0);
        namesParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        namesParams.leftMargin = 200;
        namesParams.topMargin = -50;

        categoryText.setLayoutParams(namesParams);
        categoriesGrid.addView(categoryText);

        TextView dayHourText = new TextView(this);
        dayHourText.setText("Day Hour Classification");
        dayHourText.setHeight(50);
        dayHourText.setWidth(400);
        dayHourText.setGravity(Gravity.CENTER);
        dayHourText.setTextAlignment(categoriesGrid.TEXT_ALIGNMENT_TEXT_START);

        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(1);
        namesParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        namesParams.topMargin = 100;
        dayHourText.setLayoutParams(namesParams);
        categoriesGrid.addView(dayHourText);

        TextView dayTimeText = new TextView(this);
        dayTimeText.setText("Day and Time");
        dayTimeText.setHeight(50);
        dayTimeText.setWidth(400);
        dayTimeText.setGravity(Gravity.CENTER);
        dayTimeText.setTextAlignment(categoriesGrid.TEXT_ALIGNMENT_TEXT_START);

        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(1);
        namesParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        namesParams.topMargin = 150;
        dayTimeText.setLayoutParams(namesParams);
        categoriesGrid.addView(dayTimeText);

        relativeRoot.addView(categoriesGrid);

        GridLayout tealGrid = new GridLayout(this);
        tealGrid.setRowCount(2);
        tealGrid.setColumnCount(2);

        TextView tealText1 = new TextView(this);
        tealText1.setText("C1");
        tealText1.setHeight(50);
        tealText1.setWidth(300);
        tealText1.setGravity(Gravity.CENTER);
        tealText1.setBackgroundColor(Color.CYAN);
        tealText1.setTextAlignment(categoriesGrid.TEXT_ALIGNMENT_CENTER);
        tealText1.setTypeface(Typeface.DEFAULT_BOLD);

        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams tealGridParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        tealGridParams.topMargin = 200;
        tealGridParams.leftMargin = 275;

        tealText1.setLayoutParams(tealGridParams);
        tealGrid.addView(tealText1);

        tealText1 = new TextView(this);
        tealText1.setText("min <= hour && hour <= max");
        tealText1.setHeight(60);
        tealText1.setWidth(300);
        tealText1.setGravity(Gravity.CENTER);
        tealText1.setBackgroundColor(Color.CYAN);
        tealText1.setTextAlignment(categoriesGrid.TEXT_ALIGNMENT_CENTER);
        tealText1.setTextSize(9);

        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(0);
        tealGridParams = new GridLayout.LayoutParams(rowSpec, colSpec);

        tealGridParams.leftMargin = 275;

        tealText1.setLayoutParams(tealGridParams);
        tealGrid.addView(tealText1);

        tealText1 = new TextView(this);
        tealText1.setText("A1");
        tealText1.setHeight(50);
        tealText1.setWidth(500);
        tealText1.setGravity(Gravity.CENTER);
        tealText1.setBackgroundColor(Color.CYAN);
        tealText1.setTextAlignment(tealGrid.TEXT_ALIGNMENT_CENTER);
        tealText1.setTypeface(Typeface.DEFAULT_BOLD);

        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(1);
        tealGridParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        tealGridParams.topMargin = 200;
        //tealGridParams.leftMargin = 275;
        tealText1.setLayoutParams(tealGridParams);
        tealGrid.addView(tealText1);

        tealText1 = new TextView(this);
        tealText1.setText("System.out.println(greeting + \", World!\"");
        tealText1.setHeight(60);
        tealText1.setWidth(500);
        tealText1.setGravity(Gravity.CENTER);
        tealText1.setBackgroundColor(Color.CYAN);
        tealText1.setTextAlignment(categoriesGrid.TEXT_ALIGNMENT_CENTER);
        tealText1.setTextSize(9);

        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(1);
        tealGridParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        //tealGridParams.topMargin = 200;
        //tealGridParams.leftMargin = 275;
        tealText1.setLayoutParams(tealGridParams);
        tealGrid.addView(tealText1);

        relativeRoot.addView(tealGrid);

        // From To Grid
        GridLayout bottomRightGrid = new GridLayout(this);
        bottomRightGrid.setRowCount(6);
        bottomRightGrid.setColumnCount(3);

        tv = new TextView(this);
        tv.setText("int min \t int max");
        tv.setHeight(50);
        tv.setWidth(150);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(categoriesGrid.TEXT_ALIGNMENT_CENTER);

        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams botRightParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        botRightParams.leftMargin = 440;
        botRightParams.topMargin = 300;

        bottomRightGrid.setLayoutParams(botRightParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setHeight(50);
        tv.setWidth(150);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(categoriesGrid.TEXT_ALIGNMENT_CENTER);

        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams intMaxParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        intMaxParams.leftMargin = 150;

        tv.setLayoutParams(intMaxParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setHeight(50);
        tv.setWidth(500);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_CENTER);

        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(1);
        botRightParams = new GridLayout.LayoutParams(rowSpec, colSpec);
        botRightParams.topMargin = 300;
        botRightParams.leftMargin = 290;

        bottomRightGrid.setLayoutParams(botRightParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setWidth(150);
        tv.setHeight(100);
        tv.setGravity(Gravity.CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_START);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(0);
        botRightParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(botRightParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(2);
        colSpec = GridLayout.spec(0);
        botRightParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(botRightParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(3);
        colSpec = GridLayout.spec(0);
        botRightParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(botRightParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(4);
        colSpec = GridLayout.spec(0);
        botRightParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(botRightParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(5);
        colSpec = GridLayout.spec(0);
        botRightParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(botRightParams);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = -150;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(2);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = -150;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setWidth(150);
        tv.setHeight(100);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(3);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = -150;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(4);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = -150;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setWidth(150);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(bottomRightGrid.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        rowSpec = GridLayout.spec(5);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = -150;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setWidth(500);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 0;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setWidth(500);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(2);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 0;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setWidth(500);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(3);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 0;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setWidth(500);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(4);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 0;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setWidth(500);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec = GridLayout.spec(5);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 0;
        tv.setLayoutParams(params);
        bottomRightGrid.addView(tv);


        relativeRoot.addView(bottomRightGrid);

        setContentView(relativeRoot);
    }
}
