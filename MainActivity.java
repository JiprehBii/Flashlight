package com.jeffreh.app;

import android.app.*;
import android.os.*;
import android.view.View.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity {
	
	//Buttons
	protected Button scrnButton;
	
	protected Button ledButton;
	
	protected Button closeButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	
		//sets of Buttons
		scrnButton = (Button) findViewById(R.id.scrnButton);
		ledButton = (Button) findViewById(R.id.ledButton);
		closeButton = (Button) findViewById(R.id.closeButton);
		//end of Buttons
		
		//Open Screen Activity
		scrnButton.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View scrn) {
		Intent screen = new Intent(MainActivity.this, ScreenActivity.class);
		startActivity(screen);
	}
		});//End of Open Screen Button Activity
		
		//Open Led Activity
		ledButton.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View leds) {
		Intent led = new Intent(MainActivity.this, LedActivity.class);
		startActivity(led);
	}
		}); //End of Open Led Button Activity
		
		//Close Activity
		closeButton.setOnClickListener((new OnClickListener() {
	@Override
	public void onClick(View close) {
		android.os.Process.killProcess(android.os.Process.myPid());
		System.exit(1);
	}
		})); //End of Close Activity
	}
}
