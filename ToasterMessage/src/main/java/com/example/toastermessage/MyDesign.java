package com.example.toastermessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyDesign extends AppCompatActivity {

    private TextView txtCal;
    EditText editVal1,editVal2;
    int firstNum,secondNum;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_design);

        editVal1 = findViewById(R.id.editTextNum1);
        editVal2 = findViewById(R.id.editTextNum2);

    }
    public void AddValues(View view){
        firstNum = Integer.parseInt(editVal1.getText().toString());
        secondNum = Integer.parseInt(editVal2.getText().toString());

        result = ToasterMessage.Addition(firstNum,secondNum);
        ToasterMessage.s(getApplication(),"My Result : "+result);
    }
    public void SubValues(View view){
        firstNum = Integer.parseInt(editVal1.getText().toString());
        secondNum = Integer.parseInt(editVal2.getText().toString());

        result = ToasterMessage.Subtraction(firstNum,secondNum);
        ToasterMessage.s(getApplication(),"My Result : "+result);
    }
    public void MulValues(View view){
        firstNum = Integer.parseInt(editVal1.getText().toString());
        secondNum = Integer.parseInt(editVal2.getText().toString());

        result = ToasterMessage.Multiplication(firstNum,secondNum);
        ToasterMessage.s(getApplication(),"My Result : "+result);
    }
    public void DivValues(View view){
        firstNum = Integer.parseInt(editVal1.getText().toString());
        secondNum = Integer.parseInt(editVal2.getText().toString());

        result = ToasterMessage.Division(firstNum,secondNum);
        ToasterMessage.s(getApplication(),"My Result : "+result);
    }
}