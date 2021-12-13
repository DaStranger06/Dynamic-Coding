package com.siamsoft.lmem_dynamic_coding_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout linLayout = new LinearLayout(this);


        // specifying vertical orientation
        linLayout.setOrientation(LinearLayout.VERTICAL);

        // creating LayoutParams
        LinearLayout.LayoutParams linLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        // set Layout as a root element of the screen
        setContentView(linLayout, linLayoutParam);


        // add Linear Layout

        LinearLayout.LayoutParams lpView = new
                LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        TextView tv = new TextView(this);
        tv.setText("TextView");

        tv.setLayoutParams(lpView);
        linLayout.addView(tv);


        // add edit text
        EditText etx = new EditText(this);

        etx.setText("Android ");
        etx.setMinLines(2);
        etx.setMaxLines(5);
        linLayout.addView(etx);

        // add button with match parent

        LinearLayout.LayoutParams btn = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        Button btnn = new Button(this);
        btnn.setText("Abc");
        linLayout.addView(btnn, btn);


        //Add button with left Margin.
        LinearLayout.LayoutParams lm = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lm.leftMargin = 50;
        Button btn1 = new Button(this);
        btn1.setText("lm = 50");
        linLayout.addView(btn1, lm);


        // Add button with center position

        LinearLayout.LayoutParams cp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        cp.gravity = Gravity.CENTER;

        Button btn3 = new Button(this);
        btn3.setText("NNNN");
        linLayout.addView(btn3, cp);

        //CheckBox


        for (int i = 1; i <= 5; i++) {
            CheckBox cb = new CheckBox(this);
            cb.setId(i + 10);
            cb.setText("N "+i);
            linLayout.addView(cb);


        }

        // Radio button


//        RadioButton [] rb = new RadioButton[5];
//        RadioGroup rg = new RadioGroup(this);
///*        rg.setOrientation(RadioGroup.VERTICAL);*/
//        for(int i=1; i<=5; i++)
//        {
//            rb[i] = new RadioButton(this);
//            rb[i].setText("Radio Button" + i);
//            rb[i].setId(i);
//            rg.addView(rb[i]);
//
//        }
//
//        linLayout.addView(rg);

        //Toggle Button

        ToggleButton tb = new ToggleButton(this);
        tb.setTextOn("TB on - ON");
        tb.setTextOff("TB - Off");
        tb.setTextColor(Color.BLUE);
        tb.setChecked(true);
        tb.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        linLayout.addView(tb);

        //Add Image

        final ImageButton imgbt = new ImageButton(this);
        imgbt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        imgbt.setImageResource(R.mipmap.ic_launcher);
        linLayout.addView(imgbt);

        //add switch button

        final Switch sw = new Switch(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        linLayoutParam.setMargins(30,30, 30, 30);
        sw.setLayoutParams(lp);
        sw.setText("OKKKK");
        linLayout.addView(sw);

    }
}