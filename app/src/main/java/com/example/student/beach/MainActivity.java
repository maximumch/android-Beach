package com.example.student.beach;

import android.graphics.Paint;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView price = findViewById(R.id.price);
        price.setPaintFlags(
                price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG
        );



    }

    public void orderTrip(View view) {
        Snackbar.make(findViewById(R.id.linear),"Ваше путешествие заказано", Snackbar.LENGTH_SHORT).show();


    }
}
