package com.example.deliveryonlinecourses;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(view -> {
            // HTML INFO
            Intent intent = new Intent(MainActivity.this, CourseActivity2.class);
            intent.putExtra("header", "HTML (HyperText Markup Language)");
            intent.putExtra("html1", R.drawable.html);
            intent.putExtra("html_body", "HTML is the standard markup language for creating web pages. It describes the structure" +
                    "of the web page and it consists of a series of elements. HTML tells the browser how to display the content. HTML elements " +
                    "label pieces of content.");
            // CSS INFO
            intent.putExtra("header1", "CSS (Cascading Style Sheet)");
            intent.putExtra("css1", R.drawable.css);
            intent.putExtra("css_body", "CSS is the language for describing the presentation of web pages " +
                    "including colors, layouts and fonts. It allows one to adapt the presentation of different types of devices " +
                    "such as large screens, small screens or printers.");
            // JAVASCRIPT INFO
            intent.putExtra("header2", "JavaScript");
            intent.putExtra("js1", R.drawable.js);
            intent.putExtra("js_body", "JavaScript is a programming language, and like most programming languages, it has some basic " +
                    "constructs that we’ll look at. A program in JavaScript is like a sequence of steps. Similar to how we give directions to a stranger, " +
                    "a computer needs detailed instructions, defined as steps, to accomplish any simple or complex action.");
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            // FUNDAMENTALS OF ANDROID DEVELOPMENT
            Intent intent = new Intent (MainActivity.this, CourseActivity2.class);
            intent.putExtra("header3", "Fundamentals of android development");
            intent.putExtra("app1", R.drawable.app);
            intent.putExtra("app_body", "In the Android Developer Fundamentals course, you learn basic Android " +
                    "programming concepts and build a variety of apps, using the Java programming language. You start with Hello " +
                    "World and work your way up to apps that schedule jobs, update settings, and use Android Architecture Components.");

            // DESIGNING ADAPTIVE APPLICATIONS
            intent.putExtra("header4", "Designing adaptive applications");
            intent.putExtra("adaptive1", R.drawable.adaptive);
            intent.putExtra("adaptive_body", "Designing an adaptive system to meet its quality constraints in the face of " +
                    "environmental uncertainties can be a challenging task. In a cloud environment, a designer has to consider and evaluate " +
                    "different control points, that is, those variables that affect the quality of the software system.");

            // CROSS-PLATFORM APPS WITH FLUTTER
            intent.putExtra("header5", "Cross-platform apps with flutter");
            intent.putExtra("flutter1", R.drawable.flutter);
            intent.putExtra("flutter_body", "Flutter is an open-source UI software development kit created by Google which is used " +
                    "to develop native like apps for Android, iOS, Linux, Mac, Windows, Google Fuchsia, and the web from a single codebase. " +
                    "Its modern stratagem allows a business to get functional apps with cost and time efficiency. Flutter fulfills all the requirements " +
                    "which is why more and more development companies are using Flutter for their mobile application needs and it’s exponentially increasing");

            startActivity(intent);

        });
        button3.setOnClickListener(view -> {
            // EXPLORATORY DATA ANALYSIS
            Intent intent = new Intent (MainActivity.this, CourseActivity2.class);
            intent.putExtra("header6", "Exploratory data analysis");
            intent.putExtra("analysis1", R.drawable.analysis);
            intent.putExtra("analysis_body", "Exploratory data analysis (EDA) is used by data scientists to analyze and investigate data sets " +
                    "and summarize their main characteristics, often employing data visualization methods. It helps determine how best to manipulate data " +
                    "sources to get the answers you need, making it easier for data scientists to discover patterns, spot anomalies, test a hypothesis, " +
                    "or check assumptions");

            // STATISTICAL INFERENCE
            intent.putExtra("header7", "Statistical inference");
            intent.putExtra("statistical1", R.drawable.statistical);
            intent.putExtra("statistical_body", "Statistical inference refers to the process of drawing conclusions from the model estimation. " +
                    "Statistical inference consists in the use of statistics to draw conclusions about some unknown aspect of a population based on a random " +
                    "sample from that population");

            // MACHINE LEARNING
            intent.putExtra("header8", "Introduction to machine learning");
            intent.putExtra("machine1", R.drawable.machine);
            intent.putExtra("machine_body", "Machine learning is a branch of artificial intelligence (AI) and computer science which " +
                    "focuses on the use of data and algorithms to imitate the way that humans learn, gradually improving its accuracy");

            startActivity(intent);
        });
    }
}