package com.androidfire.rom.mod;

// AndroidFire Open Source Project

import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
public class AFDetactor extends Activity {
	String Y = "GT-S5360";
	String A = "2.3.6";
	String B = android.os.Build.MODEL;
	String U = Build.VERSION.RELEASE;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if  (B.equals(Y))  {
	//It will Show When The Phone is GT-S5360
        
	} 
        else if (B != Y) {
		// It will show When the phone is not GT-S5360
	}
	       // if u add this two lines when someone Open App via other phone it will exit accept GT-S5360 
	       //Phone
	
	if (A.equals(U)) {
		// If the Statement is Correct According to Phone Then it will Launched This This Activity
		Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
		// change MPlatLogoAnim to ur Activity
	}
	else if (A!=U) {
		Toast.makeText(getApplicationContext(), "Hey Kanger" , Toast.LENGTH_LONG).show();	
		Toast.makeText(getApplicationContext(), "You want to Use" , Toast.LENGTH_LONG).show();	
		Toast.makeText(getApplicationContext(), "Other ROM's " , Toast.LENGTH_LONG).show();	
		Toast.makeText(getApplicationContext(), "Control Apps" , Toast.LENGTH_LONG).show();	
		Toast.makeText(getApplicationContext(), "in Other Device and" , Toast.LENGTH_LONG).show();	
		Toast.makeText(getApplicationContext(), "And Another Android Version" , Toast.LENGTH_LONG).show();	
	// If The Statement is False According to Your Phone it will close the App
                    finish();
                   
                    }
	}
}