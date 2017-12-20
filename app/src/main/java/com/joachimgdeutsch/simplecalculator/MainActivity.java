package com.joachimgdeutsch.simplecalculator;

/*
  Dieses Beispiel basiert auf
                 Programming Knowledge, Android Studio Tutorial for Beginners
                 https://www.youtube.com/playlist?list=PLS1QulWo1RIbb1cYyzZpLFCKvdYV_yJ-E
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAdd(View v) {

        EditText n1 = (EditText)findViewById(R.id.editText);
        EditText n2 = (EditText)findViewById(R.id.editText2);
        TextView eg = (TextView)findViewById(R.id.Ergebnis);

        int Zahleins = Integer.parseInt(n1.getText().toString());
        int Zahlzwei = Integer.parseInt(n2.getText().toString());

        int R_e_s_u_l_t = Zahleins + Zahlzwei;

        eg.setText(Integer.toString(R_e_s_u_l_t));
    }

    public void onClickMul(View v) {

        EditText n1 = (EditText)findViewById(R.id.editText);
        EditText n2 = (EditText)findViewById(R.id.editText2);
        TextView eg = (TextView)findViewById(R.id.Ergebnis);

        int Zahleins = Integer.parseInt(n1.getText().toString());
        int Zahlzwei = Integer.parseInt(n2.getText().toString());

        int R_e_s_u_l_t = Zahleins * Zahlzwei;

        eg.setText(Integer.toString(R_e_s_u_l_t));
    }
}
