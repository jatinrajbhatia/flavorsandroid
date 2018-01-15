package com.example.jrb.testflavor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Constants.Type.FREE == Constants.type)
        {
            TextView tv=(TextView)findViewById(R.id.Textview);
            tv.setText("Free Version");
        }
        else if (Constants.Type.PAID == Constants.type)
        {
            TextView tv=(TextView)findViewById(R.id.Textview);
            tv.setText("Paid Version");
        }

    }
}
