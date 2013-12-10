package com.example.alertdialog;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button music = (Button) findViewById(R.id.button_music);
		music.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"My favorite music is ROCK", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button pet = (Button) findViewById(R.id.button_pet);
		pet.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{	
				Intent pet_intent = new Intent(MainActivity.this, ImageToastActivity.class);
				MainActivity.this.startActivity(pet_intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
				"This is my friend's cat", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
