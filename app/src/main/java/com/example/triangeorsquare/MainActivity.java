package com.example.triangeorsquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Number number = new Number();

    public boolean notBoth(){
        if (number.isTriangle() && number.isSquare()){
            return false;
        }
        if(!(number.isTriangle() || number.isSquare())){
            return false;
        }
        return true;
    }


    public void testOnClick(View view){
        EditText userInput = (EditText) findViewById(R.id.number_InputET);

        int num = Integer.parseInt(userInput.getText().toString()); //Convert editText to an INT
        Log.i("Status", "num entered " + num);// testing to see if the number converted

        number.setNum(num); //sets user input as type object number.



        if(number.isTriangle() && number.isSquare()){
            Toast.makeText(this,"The number " + num +" is both a triangle number and square number",Toast.LENGTH_LONG).show();

        }

        if(!(number.isTriangle() || number.isSquare())){
            Toast.makeText(this,"The number "+ num + " is neither a triangle number nor square number",Toast.LENGTH_LONG).show();
        }

        if(notBoth()) {

            if (number.isSquare()) {
                Toast.makeText(this, "The number "+ num + " is a square number", Toast.LENGTH_LONG).show();
            }

            if (number.isTriangle()) {
                Toast.makeText(this, "The number " + num + " is a triangle number", Toast.LENGTH_LONG).show();
            }

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
