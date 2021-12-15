package com.example.toastermessage;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {
    Context c;
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

    public static void startActivity(Context context){
        context.startActivity(new Intent(context,MyDesign.class));
    }

}
