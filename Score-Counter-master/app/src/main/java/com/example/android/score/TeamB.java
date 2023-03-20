package com.example.android.score;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TeamB extends AppCompatActivity {

    int counter, counter2, counter3 = 0;
    private TextView textView, textView2, textView3, textView4, textView5;
    private Button button1, button2, button3, button4, button5, button6, button7, button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teamb);

        textView = findViewById(R.id.rrun);
        textView2 = findViewById(R.id.target);
        textView3 = findViewById(R.id.extrun);
        textView4 = findViewById(R.id.balls);

        textView5 = findViewById(R.id.count);
        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        button4 = findViewById(R.id.button5);
        button5 = findViewById(R.id.button6);
        button6 = findViewById(R.id.button10);
        button7 = findViewById(R.id.button11);
        button8 = findViewById(R.id.button9);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {

            String value = bundle.getString("tag");
            textView2.setText(value);

        }


    }


    public void plusone(View view) {
        counter3++;
        textView4.setText(Integer.toString(counter3));
        textView4.setText("Balls : " + counter3);
        if (counter3 >= 6) {
            counter3 = 0;
            Toast.makeText(this, "OVER", Toast.LENGTH_LONG).show();
        }
        counter++;
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        textView5.setText(textView5.getText() + "1 ");

    }

    public void plustwo(View view) {
        counter3++;
        textView4.setText(Integer.toString(counter3));
        textView4.setText("Balls : " + counter3);
        if (counter3 >= 6) {
            counter3 = 0;
            Toast.makeText(this, "OVER", Toast.LENGTH_LONG).show();
        }

        counter = counter + 2;
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        textView5.setText(textView5.getText() + "2 ");

    }

    public void plusthree(View view) {
        counter3++;
        textView4.setText(Integer.toString(counter3));
        textView4.setText("Balls : " + counter3);
        if (counter3 >= 6) {
            counter3 = 0;
            Toast.makeText(this, "OVER", Toast.LENGTH_LONG).show();
        }

        counter = counter + 3;
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        textView5.setText(textView5.getText() + "3 ");

    }

    public void plusfour(View view) {
        counter3++;
        textView4.setText(Integer.toString(counter3));
        textView4.setText("Balls : " + counter3);
        if (counter3 >= 6) {
            counter3 = 0;
            Toast.makeText(this, "OVER", Toast.LENGTH_LONG).show();
        }

        counter = counter + 4;
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        textView5.setText(textView5.getText() + "4 ");

    }

    public void plussix(View view) {
        counter3++;
        textView4.setText(Integer.toString(counter3));
        textView4.setText("Balls : " + counter3);
        if (counter3 >= 6) {
            counter3 = 0;
            Toast.makeText(this, "OVER", Toast.LENGTH_LONG).show();
        }

        counter = counter + 6;
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        textView5.setText(textView5.getText() + "6 ");

    }

    public void reset(View view) {

        counter = 0;
        counter2 = 0;
        counter3 = 0;
        textView3.setText((Integer.toString(counter2, counter)));
        textView3.setText("Extra : " + counter2);
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        textView4.setText(Integer.toString(counter3));
        textView4.setText("Balls : " + counter3);
        textView5.setText("");

    }

    public void over(View view) {
        textView5.setText("");

    }

    public void plusextraone(View view) {


        counter = counter + 1;
        counter2 = counter2 + 1;
        textView3.setText((Integer.toString(counter2, counter)));
        textView3.setText("Extra : " + counter2);
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        textView5.setText(textView5.getText() + "wd ");

    }

    public void noball(View view) {


        counter = counter + 1;
        counter2 = counter2 + 1;
        textView3.setText((Integer.toString(counter2, counter)));
        textView3.setText("Extra : " + counter2);
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        Toast.makeText(this, "FreeHit", Toast.LENGTH_LONG).show();
        textView5.setText(textView5.getText() + "nb ");


    }


    public void minusone(View view) {

        counter--;
        counter2--;
        counter3--;
        textView3.setText(Integer.toString(counter2));
        textView3.setText("Extra : " + counter2);
        textView4.setText(Integer.toString(counter3));
        textView4.setText("Balls : " + counter3);
        textView.setText(Integer.toString(counter));
        textView.setText("Run : " + counter);
        if (counter < 1) {
            counter = 1;
            Toast.makeText(this, "Runs cant be NEGATIVE", Toast.LENGTH_LONG).show();
        }
        if (counter2 < 1) {
            counter2 = 1;
        }
        if (counter3 < 1) {
            counter3 = 1;
        }
    }

    public void settarget(View view) {

        counter = counter + 1;
        textView2.setText("Target :" + counter);
    }

    public void nulls(View view) {

        counter3 = counter3 + 1;
        textView4.setText("Balls : " + counter3);
        if (counter3 >= 6) {
            counter3 = 0;
            Toast.makeText(this, "OVER", Toast.LENGTH_LONG).show();

        }
        textView5.setText(textView5.getText() + "0 ");


    }
}

