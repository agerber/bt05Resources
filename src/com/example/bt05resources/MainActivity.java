package com.example.bt05resources;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


//################################################
// as far as the directories. Android looks for the specific directory first. e.g. layout-land or layout-port.  
// if it doesn't find those, it defaults to layout. 
// Android bounces the activity when you rotate your device and reloads the layout, so you can confire this programmatically, or 
// by using resources. It's either landscape or portrait. 
//################################################

//http://developer.android.com/guide/topics/resources/more-resources.html

// %%%%%%%%%%%%%% PHASE 0
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}





