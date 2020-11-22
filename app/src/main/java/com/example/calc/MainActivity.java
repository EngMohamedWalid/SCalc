package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Object fiendViewByid;
        TextView tvRes = (TextView) (fiendViewByid = (R.id.tv_rez));
        TextView ed_num_1 = (TextView) (fiendViewByid = (R.id.ed_num_1));
        TextView ed_num_2 = (TextView) (fiendViewByid = (R.id.ed_num_2));

        TextView bt_plus = (TextView) (fiendViewByid = (R.id.bt_plus));
        TextView bt_multy = (TextView) (fiendViewByid = (R.id.bt_multy));
        TextView bt_minc = (TextView) (fiendViewByid = (R.id.bt_minc));
        TextView bt_div = (TextView) (fiendViewByid = (R.id.bt_div));

        bt_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Object integer;
                int num1 = Integer.parseInt(ed_num_1.getText().toString());

                int num2 = Integer.parseInt(ed_num_2.getText().toString());
                int res = num1 + num2;

                int rez;
                tvRes.setText(rez);
            }
        });

        bt_minc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(ed_num_1.getText().toString());

                int num2 = Integer.parseInt(ed_num_2.getText().toString());
                int res = num1 - num2;

                int rez;
                tvRes.setText(rez);

            }
        });

        bt_multy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(ed_num_1.getText().toString());

                int num2 = Integer.parseInt(ed_num_2.getText().toString());
                int res = num1 * num2;

                int rez;
                tvRes.setText(rez);

            }
        });

        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(ed_num_1.getText().toString());

                int num2 = Integer.parseInt(ed_num_2.getText().toString());
                int res = num1 / num2;

                int rez;
                tvRes.setText(rez);

            }
        });
    }
}