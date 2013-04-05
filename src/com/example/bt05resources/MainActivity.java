package com.example.bt05resources;


import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;


//################################################
// as far as the directories. Android looks for the specific directory first. e.g. layout-land or layout-port.  
// if it doesn't find those, it defaults to layout. 
// Android bounces the activity when you rotate your device and reloads the layout, so you can confire this programmatically, or 
// by using resources. It's either landscape or portrait. 
//################################################

//http://developer.android.com/guide/topics/resources/more-resources.html

// %%%%%%%%%%%%%% PHASE FINISHED 
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//################################################
		// RESOURCES
		//################################################
		Resources res = getResources();
		
		//################################################
		// RESOURCES:DIMENSIONS
		//################################################
		//referencing a dimension pogrammatically
		float fSize = res.getDimension(R.dimen.font_size);
		//alternatively
		float fSize2 = getResources().getDimension(R.dimen.font_size);
		
		//referencing a dimension inside another resource xml file
		//notice the @dimen
		//<TextView
		//android:layout_height="@dimen/textview_height"
		//android:layout_width="@dimen/textview_width"
		//android:textSize="@dimen/font_size"/>
		
		
		
		//################################################
		// RESOURCES:NUMBERS
		//################################################
		boolean bAnswer = res.getBoolean(R.bool.b_answer);
		int[] nSomes = getResources().getIntArray(R.array.n_ary_some);
		// "@bool/b_answer"
		// "@array/n_ary_some"
		
	
		
		
		//################################################
		// RESOURCES:STRINGS
		//################################################
		String[] strCurrs = getResources().getStringArray(R.array.currs);
		String strHello = getResources().getString(R.string.hello);
		//	"@string/hello"
		// "@array/currs"
		
		//alt-shift-A S to externalize a string
		//"silly string that I want externalized"

		
		//################################################
		// RESOURCES:COLORS
		//################################################
		int nOlive = getResources().getColor(R.color.olive);
		//	"@color/olive"


		//################################################
		// RESOURCES:DRAWABLE
		//################################################
		Drawable drwScorpion = getResources().getDrawable(R.drawable.scorpion);
		//	"@drawable/scorpion"
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}





