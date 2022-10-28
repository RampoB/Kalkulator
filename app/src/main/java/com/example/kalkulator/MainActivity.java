package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ang1, ang2;
    TextView hasilLuas, hasilKeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ang1 = (EditText) findViewById(R.id.angka1);
        ang2 = (EditText) findViewById(R.id.angka2);
        hasilLuas = (TextView) findViewById(R.id.luas);
        hasilKeliling = (TextView) findViewById(R.id.keliling);
    }

    public void LkPersegi(View view){
        int s1 = Integer.parseInt(ang1.getText().toString());
        int s2 = Integer.parseInt(ang2.getText().toString());
        Integer hsL = s1*s2;
        Integer hsK = 2*(s1+s2);
        hasilLuas.setText(hsL.toString());
        hasilKeliling.setText(hsK.toString());
    }

    public void LkSegitiga(View view){
        int a1 = Integer.parseInt(ang1.getText().toString());
        int t2 = Integer.parseInt(ang2.getText().toString());
        Integer hsLS = (a1*t2)/2;
        Integer hsKS = (a1*2)+t2;
        hasilLuas.setText(hsLS.toString());
        hasilKeliling.setText(hsKS.toString());
    }

    public void LkLingkaran(View view){
        double r1 = Double.parseDouble(ang1.getText().toString());
        double r2 = Double.parseDouble(ang1.getText().toString());
        Double hsLL = 3.14 * (r1*r1);
        Double hsKL = 2 * 3.14 * r1;
        hasilLuas.setText(hsLL.toString());
        hasilKeliling.setText(hsKL.toString());
    }
}