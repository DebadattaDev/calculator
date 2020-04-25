package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnMul,btnDiv,btnAdd,btnSub,btnEqual,btnClr,btnDot;
    EditText ed1;
    float f1,f2;
    boolean add,sub,mul,div;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnDot=findViewById(R.id.btnDot);
        btnClr=findViewById(R.id.btnClr);
        btnEqual=findViewById(R.id.btnEqual);

        ed1=findViewById(R.id.ed1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    f1 = Float.parseFloat(ed1.getText() + "");
                    add=true;
                    ed1.setText(null);

                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else {
                    f1 = Float.parseFloat(ed1.getText() + "");
                    sub = true;
                    ed1.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else {
                    f1 = Float.parseFloat(ed1.getText() + "");
                    mul = true;
                    ed1.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else {
                    f1 = Float.parseFloat(ed1.getText() + "");
                    div = true;
                    ed1.setText(null);
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2=Float.parseFloat(ed1.getText()+"");
                if(add==true) {
                    ed1.setText(f1 + f2 + "");
                    add = false;
                }
                    if(sub==true) {
                        ed1.setText(f1 - f2 + "");
                        sub = false;
                    }

                if(mul==true) {
                    ed1.setText(f1 * f2 + "");
                    mul = false;
                }

                if(div==true) {
                    ed1.setText(f1 / f2 + "");
                    div = false;
                }

            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");


            }
        });
    }
}
