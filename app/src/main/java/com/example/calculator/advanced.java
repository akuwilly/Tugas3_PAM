package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.math.*;

public class advanced extends AppCompatActivity {

    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,
            pointButton,equalButton,plusButton,minusButton,multiplyButton,
            divideButton,plusminusButton,clearButton,bskpButton,
            lnButton,logButton,sqrtButton,xyButton,x2Button,cosButton,tanButton,sinButton,percentButton;


    TextView operationTextView,resultTextView;

    String process;
    String operationHistory="";

    Double result=0.0;

    Boolean isClickSymbol = false;
    Boolean isClickSpecialSymbol = false;
    Integer counterClickSymbol=0;
    Integer equalCounter=0;
    Integer isMinus=0;
    Integer i =0;
    Integer minusCounter=0;
    Boolean isPlusMinusClicked=false;
    String testowy;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean("isClickSymbol",isClickSymbol);
        outState.putBoolean("isClickSpecialSymbol",isClickSpecialSymbol);
        outState.putString("process",process);
        outState.putString("operationHistory",operationHistory);
        outState.putDouble("result",result);
        outState.putInt("counterClickSymbol",counterClickSymbol);
        outState.putInt("equalCounter",equalCounter);
        outState.putInt("isMinus",isMinus);
        outState.putInt("i",i);
        outState.putInt("minusCounter",minusCounter);
        outState.putBoolean("isPlusMinusClicked",isPlusMinusClicked);
        outState.putString("testowy",resultTextView.getText().toString());

        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        isClickSymbol = savedInstanceState.getBoolean("isClickSymbol");
        isClickSpecialSymbol = savedInstanceState.getBoolean("isClickSpecialSymbol");
        process = savedInstanceState.getString("process");
        operationHistory = savedInstanceState.getString("operationHistory");
        result = savedInstanceState.getDouble("result");
        counterClickSymbol = savedInstanceState.getInt("counterClickSymbol");
        equalCounter = savedInstanceState.getInt("equalCounter");
        isMinus = savedInstanceState.getInt("isMinus");
        i = savedInstanceState.getInt("i");
        minusCounter = savedInstanceState.getInt("minusCounter");
        isPlusMinusClicked = savedInstanceState.getBoolean("isPlusMinusClicked");
        operationTextView.setText(operationHistory);
        resultTextView.setText(savedInstanceState.getString("testowy"));


        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);

        pointButton = findViewById(R.id.pointButton);
        equalButton = findViewById(R.id.equalButton);
        plusButton  = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        plusminusButton = findViewById(R.id.plusminusButton);
        clearButton = findViewById(R.id.clearButton);
        bskpButton = findViewById(R.id.bskpButton);

        lnButton = findViewById(R.id.ln);
        logButton = findViewById(R.id.log);
        sqrtButton = findViewById(R.id.sqrt);
        xyButton = findViewById(R.id.xy);
        x2Button = findViewById(R.id.x2);
        cosButton = findViewById(R.id.cos);
        tanButton = findViewById(R.id.tan);
        sinButton = findViewById(R.id.sin);
        percentButton = findViewById(R.id.percent);




        operationTextView = findViewById(R.id.operationTextView);
        resultTextView = findViewById(R.id.resultTextView);


        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove();
                if (isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "0" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("0");
                    isClickSymbol=false;
                }


            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();

                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "1" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("1");
                    isClickSymbol=false;
                }

            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "2" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("2");
                    isClickSymbol=false;
                }

            }
        });


        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "3" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("3");
                    isClickSymbol=false;

                }

            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "4" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("4");
                    isClickSymbol=false;
                }


            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "5" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("5");
                    isClickSymbol=false;
                }

            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "6" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("6");
                    isClickSymbol=false;
                }

            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "7" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("7");
                    isClickSymbol=false;
                }

            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "8" );
                }else{
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("8");
                    isClickSymbol=false;
                }

            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeZero();
                remove();
                if(isClickSymbol.equals(false)){
                    process = resultTextView.getText().toString();
                    resultTextView.setText(process+ "9" );
                }else {
                    resultTextView.setText("");
                    process="";
                    resultTextView.setText("9");
                    isClickSymbol=false;
                }

            }
        });

        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = resultTextView.getText().toString();
                if(process.indexOf('.')==-1 && !process.isEmpty())
                    resultTextView.setText(process+ "." );
                else if(process.isEmpty()){
                    Toast.makeText(advanced.this,"Najpierw wprowadź liczbę",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(advanced.this,"Możesz użyć tylko raz tego znaku dla jednej liczby",Toast.LENGTH_SHORT).show();
                }


            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("+");

            }

        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("-");
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("*");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("/");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationTextView.setText("");
                resultTextView.setText("");
                operationHistory="";
                counterClickSymbol=0;
                result=0.0;
                equalCounter=0;
                i = 0;
                minusCounter=0;
                isMinus=0;
                isClickSpecialSymbol=false;
            }
        });

        bskpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText("");
                if(equalCounter==2||isClickSpecialSymbol){
                    resultTextView.setText("");
                    operationTextView.setText("");
                    operationHistory="";
                    counterClickSymbol=0;
                    result=0.0;
                    equalCounter=0;
                    i=0;
                    minusCounter=0;
                    isMinus=0;
                    isClickSpecialSymbol=false;
                }
            }
        });

        plusminusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(!resultTextView.getText().toString().isEmpty()) {

                    if (resultTextView.getText().toString().equals("0")||resultTextView.getText().toString().equals("0.0")) {
                        Toast.makeText(advanced.this, "Zero nie moze byc ujemne", Toast.LENGTH_SHORT).show();
                    }else if(isClickSymbol!=true){
                        String temp = resultTextView.getText().toString();
                        if (temp.charAt(0) == '-') {
                            temp = temp.substring(1);
                            process = temp;

                        } else {
                            char minus = '-';
                            process = minus + temp;
                        }
                        resultTextView.setText(process);


                        // if(counterClickSymbol%2==0 && isClickSymbol==true ){
                        // operationTextView.setText(process);
                        //operationHistory=process;
                        // result = Double.parseDouble(process);
                        // isPlusMinusClicked=true;

                        // }

                    }


                }else {
                    Toast.makeText(advanced.this,"Najpierw wprowadź liczbę",Toast.LENGTH_SHORT).show();
                }

            }
        });

        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().isEmpty()) {

                    double radians = Math.toRadians(Double.parseDouble(resultTextView.getText().toString()));
                    operationTextView.setText("sin("+resultTextView.getText().toString()+")");
                    result = Math.sin(radians);
                    result=doubleToBigDecimal(result);
                    resultTextView.setText(result.toString());
                    isClickSpecialSymbol=true;


                }
                if(result.isNaN()||result.isInfinite()){
                    Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                    resultTextView.setText("");
                    operationHistory = "";
                    operationTextView.setText("");
                    counterClickSymbol=0;
                    result=0.0;
                    equalCounter=0;
                    i = 0;
                    minusCounter=0;
                    isMinus=0;
                    isClickSpecialSymbol=false;
                }

            }
        });

        cosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().isEmpty()) {
                    double radians = Math.toRadians(Double.parseDouble(resultTextView.getText().toString()));
                    operationTextView.setText("cos("+resultTextView.getText().toString()+")");
                    result = Math.cos(radians);
                    result=doubleToBigDecimal(result);
                    resultTextView.setText(result.toString());
                    isClickSpecialSymbol = true;

                }
                if(result.isNaN()||result.isInfinite()){
                    Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                    resultTextView.setText("");
                    operationHistory = "";
                    operationTextView.setText("");
                    counterClickSymbol=0;
                    result=0.0;
                    equalCounter=0;
                    i = 0;
                    minusCounter=0;
                    isMinus=0;
                    isClickSpecialSymbol=false;
                }

            }
        });

        tanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().isEmpty()) {

                    if(resultTextView.getText().toString().equals("90")||resultTextView.getText().toString().equals("90.0")){
                        Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                    }else {
                        double radians = Math.toRadians(Double.parseDouble(resultTextView.getText().toString()));
                        operationTextView.setText("tan(" + resultTextView.getText().toString() + ")");
                        result = Math.tan(radians);
                        result=doubleToBigDecimal(result);
                        resultTextView.setText(result.toString());
                        isClickSpecialSymbol = true;
                    }
                    if(result.isNaN()||result.isInfinite()){
                        Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                        resultTextView.setText("");
                        operationHistory = "";
                        operationTextView.setText("");
                        counterClickSymbol=0;
                        result=0.0;
                        equalCounter=0;
                        i = 0;
                        minusCounter=0;
                        isMinus=0;
                        isClickSpecialSymbol=false;
                    }
                }
            }
        });

        lnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().isEmpty()) {
                    if(resultTextView.getText().toString().equals("0")||resultTextView.getText().toString().equals("0.0")){
                        Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                    }else {
                        operationTextView.setText("ln(" + resultTextView.getText().toString() + ")");
                        result = Math.log(Double.parseDouble(resultTextView.getText().toString()));
                        result=doubleToBigDecimal(result);
                        resultTextView.setText(result.toString());
                        isClickSpecialSymbol = true;
                    }
                    if(result.isNaN()||result.isInfinite()){
                        Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                        resultTextView.setText("");
                        operationHistory = "";
                        operationTextView.setText("");
                        counterClickSymbol=0;
                        result=0.0;
                        equalCounter=0;
                        i = 0;
                        minusCounter=0;
                        isMinus=0;
                        isClickSpecialSymbol=false;
                    }
                }
            }
        });


        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!resultTextView.getText().toString().isEmpty()) {
                    if(resultTextView.getText().toString().equals("0")||resultTextView.getText().toString().equals("0.0")){
                        Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                    }else {
                        operationTextView.setText("log(" + resultTextView.getText().toString() + ")");
                        result = Math.log10(Double.parseDouble(resultTextView.getText().toString()));
                        result=doubleToBigDecimal(result);
                        resultTextView.setText(result.toString());
                        isClickSpecialSymbol = true;
                    }
                }
                if(result.isNaN()||result.isInfinite()){
                    Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                    resultTextView.setText("");
                    operationHistory = "";
                    operationTextView.setText("");
                    counterClickSymbol=0;
                    result=0.0;
                    equalCounter=0;
                    i = 0;
                    minusCounter=0;
                    isMinus=0;
                    isClickSpecialSymbol=false;
                }

            }
        });

        sqrtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().isEmpty()) {
                    operationTextView.setText("√("+resultTextView.getText().toString()+")");
                    result = Math.sqrt(Double.parseDouble(resultTextView.getText().toString()));
                    result=doubleToBigDecimal(result);
                    resultTextView.setText(result.toString());
                    isClickSpecialSymbol = true;
                }
                if(result.isNaN()||result.isInfinite()){
                    Toast.makeText(advanced.this, "Nieprawidłowe dane wejściowe ", Toast.LENGTH_SHORT).show();
                    resultTextView.setText("");
                    operationHistory = "";
                    operationTextView.setText("");
                    counterClickSymbol=0;
                    result=0.0;
                    equalCounter=0;
                    i = 0;
                    minusCounter=0;
                    isMinus=0;
                    isClickSpecialSymbol=false;
                }
            }
        });

        x2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().isEmpty()) {
                    operationTextView.setText("sqr("+resultTextView.getText().toString()+")");
                    result = Math.pow(Double.parseDouble(resultTextView.getText().toString()),2);
                    result=doubleToBigDecimal(result);
                    resultTextView.setText(result.toString());
                    isClickSpecialSymbol = true;
                }

            }
        });



        xyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display("^");

            }
        });

        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().isEmpty()) {
                    operationTextView.setText(resultTextView.getText().toString()+"%=");
                    result = Double.parseDouble(resultTextView.getText().toString())*0.01;
                    result=doubleToBigDecimal(result);
                    resultTextView.setText(result.toString());
                    isClickSpecialSymbol = true;
                }
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {


                if(!resultTextView.getText().toString().isEmpty()){
                    if(resultTextView.getText().toString().charAt(resultTextView.getText().toString().length()-1)=='.'){
                        String temp = resultTextView.getText().toString().substring(0,resultTextView.getText().toString().length()-1);
                        resultTextView.setText(temp);
                    }
                }

                if(operationTextView.getText().toString().indexOf("=")>-1&&equalCounter>1){


                    String[] splitted = operationHistory.split("[-+*/=^]");
                    String[] test = operationHistory.split("[*/=^]");
                    String temp = operationHistory.replaceAll("\\d", "");
                    String temp2 = temp.replace(".", "");
                    splitted[splitted.length-2] = resultTextView.getText().toString();
                    char sign;
                    int testowy=0;
                    int flag=0;
                    for(int x=0;x<test.length;x++){
                        if(test[x].indexOf("-")!=-1&&test.length>1){
                            testowy++;
                        }
                    }

                    if(test[test.length-1].indexOf("-")!=-1&&test.length>1){
                        testowy++;
                    }

                    if(splitted.length>2&&operationHistory.charAt(0)=='-' && testowy!=1&&test.length>1) {
                        sign = temp2.charAt(temp2.length() - 3);
                        flag = 1;
                    }else if (testowy==2&&test.length>1){
                        sign = temp2.charAt(temp2.length() - 3);
                        flag = 1;
                    }
                    else
                        sign = temp2.charAt(temp2.length() - 2);

                    switch (sign) {
                        case '+':
                            if(flag==1) {
                                result = Double.parseDouble(splitted[splitted.length - 2]) + Double.parseDouble(test[test.length - 1]);
                            }
                            else
                                result = Double.parseDouble(splitted[splitted.length - 2]) + Double.parseDouble(splitted[splitted.length - 1]);
                            result=doubleToBigDecimal(result);
                            break;
                        case '-':
                            if(flag==1) {
                                result = Double.parseDouble(splitted[splitted.length - 2]) - Double.parseDouble(test[test.length - 1]);
                            }
                            else
                                result = Double.parseDouble(splitted[splitted.length - 2]) - Double.parseDouble(splitted[splitted.length - 1]);
                            result=doubleToBigDecimal(result);
                            break;
                        case '*':
                            if(flag==1) {
                                result = Double.parseDouble(splitted[splitted.length - 2]) * Double.parseDouble(test[test.length - 1]);
                            }
                            else
                                result = Double.parseDouble(splitted[splitted.length - 2]) * Double.parseDouble(splitted[splitted.length - 1]);
                            result=doubleToBigDecimal(result);
                            break;
                        case '/':
                            if(Double.parseDouble(splitted[splitted.length - 1])==0){
                                Toast.makeText(advanced.this,"Nie mozna dzielic przez zero",Toast.LENGTH_SHORT).show();
                                resultTextView.setText("Nie mozna dzielic przez zero");

                            }else {
                                if(flag==1) {
                                    result = Double.parseDouble(splitted[splitted.length - 2]) / Double.parseDouble(test[test.length - 1]);
                                }
                                else
                                    result = Double.parseDouble(splitted[splitted.length - 2]) / Double.parseDouble(splitted[splitted.length - 1]);
                                result=doubleToBigDecimal(result);
                            }
                            break;
                        case'^':
                            if(flag==1) {
                                result = Math.pow(Double.parseDouble(splitted[splitted.length - 2]),Double.parseDouble(test[test.length - 1])) ;
                            }
                            else
                                result = Math.pow( Double.parseDouble(splitted[splitted.length - 2]) ,Double.parseDouble(splitted[splitted.length - 1]));
                            result=doubleToBigDecimal(result);
                            break;

                    }
                    if(flag==1){
                        operationTextView.setText( splitted[splitted.length-2]+sign+test[test.length - 1]+"=");
                        flag=0;
                    }else
                        operationTextView.setText( splitted[splitted.length-2]+sign+splitted[splitted.length - 1]+"=");
                    resultTextView.setText(result.toString());

                }


                if(resultTextView.getText().toString().isEmpty())
                    Toast.makeText(advanced.this,"Najpierw wprowadź liczbę",Toast.LENGTH_SHORT).show();
                else{

                    if(     operationTextView.getText().toString().indexOf("-") == -1 &&
                            operationTextView.getText().toString().indexOf("+")==-1 &&
                            operationTextView.getText().toString().indexOf("*")==-1 &&
                            operationTextView.getText().toString().indexOf("^")==-1 &&
                            operationTextView.getText().toString().indexOf("/")==-1 ||

                            operationTextView.getText().toString().charAt(0) == '-' &&
                                    operationTextView.getText().toString().indexOf("-",1) == -1 &&
                                    operationTextView.getText().toString().indexOf("+")==-1 &&
                                    operationTextView.getText().toString().indexOf("*")==-1 &&
                                    operationTextView.getText().toString().indexOf("/")==-1 &&
                                    operationTextView.getText().toString().indexOf("^")==-1
                    ){

                        operationHistory = resultTextView.getText().toString() + "=";
                        operationTextView.setText(operationHistory);
                        equalCounter=1;
                    }else {

                        if (counterClickSymbol == 1) {
                            operationHistory += resultTextView.getText().toString() + "=";
                            operationTextView.setText(operationHistory);
                            String[] splitted = operationHistory.split("[-+*/=^]");
                            String temp = operationHistory.replaceAll("\\d", "");
                            String temp2 = temp.replace(".", "");

                            char sign;
                            char minus = '-';

                            if(splitted.length==4){
                                splitted[splitted.length - 1] = minus + splitted[splitted.length - 1];
                                splitted[splitted.length - 2] = minus + splitted[splitted.length - 3];
                                sign = temp2.charAt(temp2.length() - 3);
                            } else if (operationTextView.getText().toString().charAt(0) == '-') {
                                splitted[splitted.length - 2] = minus + splitted[splitted.length - 2];
                                sign = temp2.charAt(temp2.length() - 2);
                            }else if (splitted[1].equals("")) {
                                splitted[splitted.length - 1] = minus + splitted[splitted.length - 1];
                                splitted[splitted.length - 2] = splitted[splitted.length - 3];
                                sign = temp2.charAt(temp2.length() - 3);
                            }else {
                                sign = temp2.charAt(temp2.length() - 2);
                            }

                            switch (sign) {
                                case '+':
                                    result = Double.parseDouble(splitted[splitted.length - 2]) + Double.parseDouble(splitted[splitted.length - 1]);
                                    result=doubleToBigDecimal(result);
                                    break;
                                case '-':
                                    result = Double.parseDouble(splitted[splitted.length - 2]) - Double.parseDouble(splitted[splitted.length - 1]);
                                    result=doubleToBigDecimal(result);
                                    break;
                                case '*':
                                    result = Double.parseDouble(splitted[splitted.length - 2]) * Double.parseDouble(splitted[splitted.length - 1]);
                                    result=doubleToBigDecimal(result);
                                    break;
                                case '/':
                                    if(Double.parseDouble(splitted[splitted.length - 1])==0){
                                        Toast.makeText(advanced.this,"Nie mozna dzielic przez zero",Toast.LENGTH_SHORT).show();
                                        result=null;
                                    }else {
                                        result = Double.parseDouble(splitted[splitted.length - 2]) / Double.parseDouble(splitted[splitted.length - 1]);
                                        result=doubleToBigDecimal(result);
                                    }
                                    break;
                                case '^':
                                    result = Math.pow(Double.parseDouble(splitted[splitted.length - 2]),Double.parseDouble(splitted[splitted.length - 1]));
                                    result=doubleToBigDecimal(result);
                                    break;
                            }
                            if(result==null) {
                                resultTextView.setText("");
                                operationHistory = "";
                                operationTextView.setText("");
                                counterClickSymbol=0;
                                result=0.0;
                                equalCounter=0;
                                i = 0;
                                minusCounter=0;
                                isMinus=0;
                            }
                            else {
                                resultTextView.setText(result.toString());
                                isClickSymbol = true;
                                counterClickSymbol++;
                                equalCounter = 2;
                            }
                        } else if (counterClickSymbol > 1 && equalCounter!=2) {

                            operationHistory += resultTextView.getText().toString() + '=';
                            operationTextView.setText(operationHistory);
                            //counterClickSymbol=0;
                            String[] splitted = operationHistory.split("[-+*/=^]");
                            ArrayList<String> splittedFinal = new ArrayList<String>();

                            for(;i<=splitted.length-1;i++){
                                if(splitted[i].equals("")){
                                    splittedFinal.add("-"+splitted[i+1]);
                                    isMinus=1;
                                    i++;
                                    minusCounter++;
                                }else {
                                    splittedFinal.add(splitted[i]);

                                }

                            }
                            String temp = operationHistory.replaceAll("\\d", "");
                            String temp2 = temp.replace(".", "");

                            char sign;
                            if(isMinus==1 && operationHistory.charAt(0)!='-'){
                                sign = temp2.charAt(temp2.length() - 3);
                                isMinus=0;
                            }else if(minusCounter>=2){
                                sign = temp2.charAt(temp2.length() - 3);
                            } else {
                                sign = temp2.charAt(temp2.length() - 2);
                            }

                            switch (sign) {
                                case '+':
                                    result += Double.parseDouble(splittedFinal.get(splittedFinal.size()-1));
                                    result=doubleToBigDecimal(result);
                                    break;
                                case '-':
                                    result -= Double.parseDouble(splittedFinal.get(splittedFinal.size()-1));
                                    result=doubleToBigDecimal(result);
                                    break;
                                case '*':
                                    result *= Double.parseDouble(splittedFinal.get(splittedFinal.size()-1));
                                    result=doubleToBigDecimal(result);
                                    break;
                                case '/':
                                    if(Double.parseDouble(splittedFinal.get(splittedFinal.size()-1))==0 ) {
                                        Toast.makeText(advanced.this, "Nie mozna dzielic przez zero", Toast.LENGTH_SHORT).show();
                                        result = null;
                                    }else {
                                        result /= Double.parseDouble(splittedFinal.get(splittedFinal.size() - 1));
                                        result=doubleToBigDecimal(result);
                                    }
                                    break;
                                case '^':
                                    result=Math.pow(result,Double.parseDouble(splittedFinal.get(splittedFinal.size()-1)));
                                    result=doubleToBigDecimal(result);
                                    break;

                            }

                            if(result==null) {
                                resultTextView.setText("");
                                operationHistory = "";
                                operationTextView.setText("");
                                counterClickSymbol=0;
                                result=0.0;
                                equalCounter=0;
                                i = 0;
                                minusCounter=0;
                                isMinus=0;
                            }else{
                                resultTextView.setText(result.toString());
                                isClickSymbol = true;
                                counterClickSymbol++;
                                equalCounter=2;
                                i=0;
                                isMinus=0;
                                minusCounter=0;

                            }

                        }


                    }

                }

                if(result.isInfinite()){
                    Toast.makeText(advanced.this,"Za duża liczba",Toast.LENGTH_SHORT).show();
                    resultTextView.setText("");
                    operationHistory = "";
                    operationTextView.setText("");
                    counterClickSymbol=0;
                    result=0.0;
                    equalCounter=0;
                    i = 0;
                    minusCounter=0;
                    isMinus=0;
                    isClickSpecialSymbol=false;
                }
            }
        });

    }

    private void display(String mark){



        if(resultTextView.getText().toString().isEmpty()) {
            Toast.makeText(advanced.this,"Najpierw wprowadź liczbę",Toast.LENGTH_SHORT).show();
        }else {

            if(resultTextView.getText().toString().charAt(resultTextView.getText().toString().length()-1)=='.'){
                String temp = resultTextView.getText().toString().substring(0,resultTextView.getText().toString().length()-1);
                resultTextView.setText(temp);
            }

            if(equalCounter==2) {
                operationTextView.setText(resultTextView.getText().toString() + mark);
                operationHistory = operationTextView.getText().toString();
                equalCounter = 3;
            }else {


                if (isClickSymbol&&isPlusMinusClicked==false) {
                    operationHistory = operationHistory.substring(0, operationHistory.length() - 1) + mark;
                    operationTextView.setText(operationHistory);
                } else if (counterClickSymbol == 0) {
                    if (equalCounter == 1) {
                        operationHistory = resultTextView.getText().toString() + mark;
                        equalCounter++;
                    } else
                        operationHistory += resultTextView.getText().toString() + mark;

                    operationTextView.setText(operationHistory);
                    isClickSymbol = true;
                    counterClickSymbol++;

                } else if (counterClickSymbol == 1) {
                    operationHistory += resultTextView.getText().toString() + mark;
                    operationTextView.setText(operationHistory);
                    String[] splitted = operationHistory.split("[-+*/=^]");
                    String temp = operationHistory.replaceAll("\\d", "");
                    String temp2 = temp.replace(".", "");
                    char sign;
                    char minus = '-';

                    if(splitted.length==4){
                        splitted[splitted.length - 1] = minus + splitted[splitted.length - 1];
                        splitted[splitted.length - 2] = minus + splitted[splitted.length - 3];
                        sign = temp2.charAt(temp2.length() - 3);
                    } else if (operationTextView.getText().toString().charAt(0) == '-') {
                        splitted[splitted.length - 2] = minus + splitted[splitted.length - 2];
                        sign = temp2.charAt(temp2.length() - 2);
                    }else if (splitted[1].equals("")) {
                        splitted[splitted.length - 1] = minus + splitted[splitted.length - 1];
                        splitted[splitted.length - 2] = splitted[splitted.length - 3];
                        sign = temp2.charAt(temp2.length() - 3);
                    }else {
                        sign = temp2.charAt(temp2.length() - 2);
                    }


                    switch (sign) {
                        case '+':
                            result = Double.parseDouble(splitted[splitted.length - 2]) + Double.parseDouble(splitted[splitted.length - 1]);
                            result=doubleToBigDecimal(result);
                            break;
                        case '-':
                            result = Double.parseDouble(splitted[splitted.length - 2]) - Double.parseDouble(splitted[splitted.length - 1]);
                            result=doubleToBigDecimal(result);
                            break;
                        case '*':
                            result = Double.parseDouble(splitted[splitted.length - 2]) * Double.parseDouble(splitted[splitted.length - 1]);
                            result=doubleToBigDecimal(result);
                            break;
                        case '/':
                            if (Double.parseDouble(splitted[splitted.length - 1]) == 0) {
                                Toast.makeText(advanced.this, "Nie mozna dzielic przez zero", Toast.LENGTH_SHORT).show();
                                result=null;
                            } else {
                                result = Double.parseDouble(splitted[splitted.length - 2]) / Double.parseDouble(splitted[splitted.length - 1]);
                                result=doubleToBigDecimal(result);
                            }
                            break;
                        case '=':
                            operationTextView.setText(resultTextView.getText().toString() + mark);
                            result = Double.parseDouble(resultTextView.getText().toString());
                            result=doubleToBigDecimal(result);
                            counterClickSymbol = 0;
                            break;
                        case'^':
                            result=Math.pow(Double.parseDouble(splitted[splitted.length - 2]),Double.parseDouble(splitted[splitted.length - 1]));
                            result=doubleToBigDecimal(result);
                            break;
                    }

                    if(result==null) {
                        resultTextView.setText("");
                        operationHistory = "";
                        operationTextView.setText("");
                        counterClickSymbol = 0;
                        result = 0.0;
                        equalCounter = 0;
                        i = 0;
                        minusCounter = 0;
                        isMinus = 0;
                    }else{
                        resultTextView.setText(result.toString());
                        isClickSymbol = true;
                        counterClickSymbol++;
                    }

                } else if (counterClickSymbol > 1) {

                    operationHistory += resultTextView.getText().toString() + mark;
                    operationTextView.setText(operationHistory);
                    String[] splitted = operationHistory.split("[-+*/=^]");
                    ArrayList<String> splittedFinal = new ArrayList<String>();



                    for(;i<=splitted.length-1;i++){
                        if(splitted[i].equals("")){
                            splittedFinal.add("-"+splitted[i+1]);
                            isMinus=1;
                            i++;

                        }else {
                            splittedFinal.add(splitted[i]);
                        }

                    }
                    String temp = operationHistory.replaceAll("\\d", "");
                    String temp2 = temp.replace(".", "");

                    char sign;
                    if(isMinus==1 && operationHistory.charAt(0)!='-'){
                        sign = temp2.charAt(temp2.length() - 3);
                        isMinus=0;
                    }else {
                        sign = temp2.charAt(temp2.length() - 2);
                    }

                    switch (sign) {
                        case '+':
                            result += Double.parseDouble(splittedFinal.get(splittedFinal.size()-1));
                            result=doubleToBigDecimal(result);
                            break;
                        case '-':
                            result -= Double.parseDouble(splittedFinal.get(splittedFinal.size()-1));
                            result=doubleToBigDecimal(result);
                            break;
                        case '*':
                            result *= Double.parseDouble(splittedFinal.get(splittedFinal.size()-1));
                            result=doubleToBigDecimal(result);
                            break;
                        case '/':
                            if(Double.parseDouble(splittedFinal.get(splittedFinal.size()-1))==0 ) {
                                Toast.makeText(advanced.this, "Nie mozna dzielic przez zero", Toast.LENGTH_SHORT).show();
                                result = null;
                            }else {
                                result /= Double.parseDouble(splittedFinal.get(splittedFinal.size() - 1));
                                result = doubleToBigDecimal(result);
                            }
                            break;
                        case '^':
                            result = Math.pow(result,Double.parseDouble(splittedFinal.get(splittedFinal.size()-1)));
                            result=doubleToBigDecimal(result);
                    }

                    if(result==null) {
                        resultTextView.setText("");
                        operationHistory = "";
                        operationTextView.setText("");
                        counterClickSymbol = 0;
                        result = 0.0;
                        equalCounter = 0;
                        i = 0;
                        minusCounter = 0;
                        isMinus = 0;
                    }else{
                        resultTextView.setText(result.toString());
                        isClickSymbol = true;
                        counterClickSymbol++;
                        isMinus=0;
                    }
                }
            }
        }
        isPlusMinusClicked=false;

        if(result.isInfinite()){
            Toast.makeText(advanced.this,"Za duża liczba",Toast.LENGTH_SHORT).show();
            resultTextView.setText("");
            operationHistory = "";
            operationTextView.setText("");
            counterClickSymbol=0;
            result=0.0;
            equalCounter=0;
            i = 0;
            minusCounter=0;
            isMinus=0;
            isClickSpecialSymbol=false;
        }


    }

    private void removeZero(){
        if(resultTextView.getText().toString().equals("0")||equalCounter.equals(1))
            resultTextView.setText("");

        if(!operationTextView.getText().toString().isEmpty()) {
            if (operationTextView.getText().toString().charAt(operationTextView.getText().toString().length() - 1) == '=') {
                operationTextView.setText("");
                operationHistory="";
                counterClickSymbol=0;
            }
        }

        equalCounter=0;
    }
    private double doubleToBigDecimal(double num){
        //BigDecimal b = new BigDecimal(num,MathContext.DECIMAL64);
        //BigDecimal numBigDecimal = new BigDecimal(num).setScale(6,BigDecimal.ROUND_HALF_UP);
        //return numBigDecimal.doubleValue();
        return num;
    }
    private void remove(){

        if(isClickSpecialSymbol.equals(true)){
            operationTextView.setText("");
            operationHistory="";
            resultTextView.setText("");
            isClickSpecialSymbol=false;
        }
    }
}