package com.example.deliveryonlinecourses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course2);

        // HTML
        TextView textView = (TextView) findViewById(R.id.header);
        ImageView imageView = (ImageView) findViewById(R.id.html1);
        TextView textView1 = (TextView) findViewById(R.id.html_body);

        String name = getIntent().getStringExtra("header");
        int imageRes = getIntent().getExtras().getInt("html1");
        String name1 = getIntent().getStringExtra("html_body");

        textView.setText(name);
        imageView.setImageResource(imageRes);
        textView1.setText(name1);

        // CSS
        TextView textView2 = (TextView) findViewById(R.id.header1);
        ImageView imageView1 = (ImageView) findViewById(R.id.css1);
        TextView textView3 = (TextView) findViewById(R.id.css_body);

        String name2 = getIntent().getStringExtra("header1");
        int image = getIntent().getExtras().getInt("css1");
        String name3 = getIntent().getStringExtra("css_body");

        textView2.setText(name2);
        imageView1.setImageResource(image);
        textView3.setText(name3);

        // JAVASCRIPT
        TextView textView4 = (TextView) findViewById(R.id.header2);
        ImageView imageView2 = (ImageView) findViewById(R.id.js1);
        TextView textView5 = (TextView) findViewById(R.id.js_body);

        String name4 = getIntent().getStringExtra("header2");
        int image2 = getIntent().getExtras().getInt("js1");
        String name5= getIntent().getStringExtra("js_body");

        textView4.setText(name4);
        imageView2.setImageResource(image2);
        textView5.setText(name5);

        // FUNDAMENTALS OF ANDROID DEVELOPMENT
        TextView textView6 = (TextView) findViewById(R.id.header3);
        ImageView imageView3 = (ImageView) findViewById(R.id.app1);
        TextView textView7 = (TextView) findViewById(R.id.app_body);

        String name6 = getIntent().getStringExtra("header3");
        int image3 = getIntent().getExtras().getInt("app1");
        String name7= getIntent().getStringExtra("app_body");

        textView6.setText(name6);
        imageView3.setImageResource(image3);
        textView7.setText(name7);

        // DESIGNING ADAPTIVE APPLICATIONS
        TextView textView8 = (TextView) findViewById(R.id.header4);
        ImageView imageView4 = (ImageView) findViewById(R.id.adaptive1);
        TextView textView9 = (TextView) findViewById(R.id.adaptive_body);

        String name8 = getIntent().getStringExtra("header4");
        int image4 = getIntent().getExtras().getInt("adaptive1");
        String name9= getIntent().getStringExtra("adaptive_body");

        textView8.setText(name8);
        imageView4.setImageResource(image4);
        textView9.setText(name9);

        // CROSS-PLATFORM APPS WITH FLUTTER
        TextView textView10 = (TextView) findViewById(R.id.header5);
        ImageView imageView5 = (ImageView) findViewById(R.id.flutter1);
        TextView textView11 = (TextView) findViewById(R.id.flutter_body);

        String name10 = getIntent().getStringExtra("header5");
        int image5 = getIntent().getExtras().getInt("flutter1");
        String name11= getIntent().getStringExtra("flutter_body");

        textView10.setText(name10);
        imageView5.setImageResource(image5);
        textView11.setText(name11);

        // EXPLORATORY DATA ANALYSIS
        TextView textView12 = (TextView) findViewById(R.id.header6);
        ImageView imageView6 = (ImageView) findViewById(R.id.analysis1);
        TextView textView13 = (TextView) findViewById(R.id.analysis_body);

        String name12 = getIntent().getStringExtra("header6");
        int image6 = getIntent().getExtras().getInt("analysis1");
        String name13= getIntent().getStringExtra("analysis_body");

        textView12.setText(name12);
        imageView6.setImageResource(image6);
        textView13.setText(name13);

        // STATISTICAL INFERENCE
        TextView textView14 = (TextView) findViewById(R.id.header7);
        ImageView imageView7 = (ImageView) findViewById(R.id.statistical1);
        TextView textView15 = (TextView) findViewById(R.id.statistical_body);

        String name14 = getIntent().getStringExtra("header7");
        int image7 = getIntent().getExtras().getInt("statistical1");
        String name15= getIntent().getStringExtra("statistical_body");

        textView14.setText(name14);
        imageView7.setImageResource(image7);
        textView15.setText(name15);

        // INTRODUCTION TO MACHINE LEARNING
        TextView textView16 = (TextView) findViewById(R.id.header8);
        ImageView imageView8 = (ImageView) findViewById(R.id.machine1);
        TextView textView17 = (TextView) findViewById(R.id.machine_body);

        String name16 = getIntent().getStringExtra("header8");
        int image8 = getIntent().getExtras().getInt("machine1");
        String name17 = getIntent().getStringExtra("machine_body");

        textView16.setText(name16);
        imageView8.setImageResource(image8);
        textView17.setText(name17);
    }
}