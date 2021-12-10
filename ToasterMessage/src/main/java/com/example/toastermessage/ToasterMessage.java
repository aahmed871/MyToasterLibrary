package com.example.toastermessage;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void  s(Context c , String msg){
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
    public double Addition(double a, double b){
        return a+b;
    }
    public double Subtraction(double a, double b){
        return a-b;
    }
    public double Multiplication(double a, double b){
        return a*b;
    }
    public double Division(double a, double b){
        return a/b;
    }
}
