package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       EditText num1=findViewById(R.id.num1);
       EditText num2=findViewById(R.id.num2);

       Button add=findViewById(R.id.add);
        Button sum=findViewById(R.id.sum);
        Button mul=findViewById(R.id.mul);
        Button div=findViewById(R.id.div);

        TextView rez=findViewById(R.id.rez);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _num1,_num2;
                _num1=Double.parseDouble(num1.getText().toString().trim());
                _num2=Double.parseDouble(num2.getText().toString().trim());
               String _rez=String.valueOf(_num1+_num2);
               rez.setText(_rez);
            }
        });
       sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _num1,_num2;
                _num1=Double.parseDouble(num1.getText().toString().trim());
                _num2=Double.parseDouble(num2.getText().toString().trim());
                String _rez=String.valueOf(_num1-_num2);
                rez.setText(_rez);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _num1,_num2;
                _num1=Double.parseDouble(num1.getText().toString().trim());
                _num2=Double.parseDouble(num2.getText().toString().trim());
                String _rez=String.valueOf(_num1*_num2);
                rez.setText(_rez);
            }
        });
       div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _num1,_num2;
                _num1=Double.parseDouble(num1.getText().toString().trim());
                _num2=Double.parseDouble(num2.getText().toString().trim());

                if (_num1 != 0 &&_num2 != 0){
                    String _rez = String.valueOf(_num1 / _num2);
                    rez.setText(_rez);
                }
                else {
                    Toast.makeText(MainActivity.this," use count div",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}