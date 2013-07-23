package com.calculator;

import com.calculator.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;

public class Main extends Activity {
	EditText vFirstValue;
	EditText vSecondValue;
	TextView vResult;
	Button vCalculate;
	float vNum1 , vNum2, vOutPut;	
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        
        
        
        vFirstValue = (EditText) findViewById(R.id.EditText01);
        vFirstValue.setText("0");
        vFirstValue.setOnTouchListener(new View.OnTouchListener() {
			
			public boolean onTouch(View v, MotionEvent event) {
				vFirstValue.setText("");
				return false;
			}
		});
        
        vSecondValue = (EditText) findViewById(R.id.EditText02);
        vSecondValue.setText("0");
        vSecondValue.setOnTouchListener(new View.OnTouchListener() {
			
			public boolean onTouch(View v, MotionEvent event) {
				vSecondValue.setText("");
				return false;
			}
        });
         
		
        vResult = (TextView) findViewById(R.id.TextView01);
        vResult.setText("0.00");
        
        vCalculate = (Button) findViewById(R.id.Button01);

        //Adding listener to button
        vCalculate.setOnClickListener(new View.OnClickListener() {

    	public void onClick(View v) {
    		//Getting first & second values and passing to show result
    		showResult(vFirstValue.getText(), vSecondValue.getText());
    	}
   	});
 }

 //Showing multiply results
 protected void showResult(Editable vFirst, Editable vSecond) 
 {
	 vNum1 = Float.parseFloat(vFirst.toString());
	 vNum2 = Float.parseFloat(vSecond.toString());
	 vOutPut = vNum1 * vNum2;
	 vResult.setText(String.valueOf(vOutPut));
 }
 
}
