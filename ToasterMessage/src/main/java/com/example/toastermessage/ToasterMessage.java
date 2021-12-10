package com.example.toastermessage;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void  s(Context c , String msg){
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
    public static int Addition(int a, int b){
        return a+b;
    }
    public static int Subtraction(int a, int b){
        return a-b;
    }
    public static int Multiplication(int a, int b){
        return a*b;
    }
    public static int Division(int a, int b){
        return a/b;
    }
}
