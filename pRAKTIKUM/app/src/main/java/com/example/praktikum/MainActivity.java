package com.example.praktikum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

TextView textview;
Button btn;
EditText tb,bb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button_hitung);
        textview = (TextView) findViewById(R.id.text);
        tb = (EditText) findViewById(R.id.edit_height);
        bb = (EditText) findViewById(R.id.edit_weight);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nilaitinggi = tb.getText().toString();
                String nilaiberat = bb.getText().toString();

                double valuetinggi = 0, valueberat = 0;

                if(!"".equals(nilaitinggi) && !"".equals(nilaiberat)){
                    valuetinggi = Double.parseDouble(nilaitinggi);
                    valueberat = Double.parseDouble(nilaiberat);
                }else if("".equals(nilaitinggi)){
                    valuetinggi = 0;
                }else if("".equals(nilaiberat)){
                    valueberat = 0;
                }

                double hasil = valueberat/((valuetinggi/100)*(valuetinggi/100));

                textview = (TextView) findViewById(R.id.text);

                double var1=18.5,var2=24.9,var3=29.9,var4=34.9,var5 = 39.9,var6=40;

                if(hasil < var1){
                    textview.setText("Under Weight"+" Hasil Perhitungan : "+hasil);
                }else if(hasil >= var1 && hasil <= var2){
                    textview.setText("Normal Weight"+" Hasil Perhitungan : "+hasil);
                }else if(hasil > var2 && hasil <= var3){
                    textview.setText("Over Weight"+" Hasil Perhitungan : "+hasil);
                }else if(hasil > var3 && hasil <= var4){
                    textview.setText("Obesity 1"+" Hasil Perhitungan : "+hasil);
                }else if(hasil > var4 && hasil <= var5){
                    textview.setText("Obesity 2"+" Hasil Perhitungan : "+hasil);
                }else if(hasil > var5){
                    textview.setText("Obesity 3"+" Hasil Perhitungan : "+hasil);
                }
            }
        });
    }

    public void showname(View view){
        TextView text1,text2;
        String t;

        text1 = (TextView) findViewById(R.id.inputnama);
        t = text1.getText().toString();

        text2 = (TextView) findViewById(R.id.text);
        text2.setText(t);
    }
}
