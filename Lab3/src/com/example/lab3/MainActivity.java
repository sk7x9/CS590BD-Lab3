package com.example.lab3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	String url;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 Button button = (Button) findViewById(R.id.button1);

	       Button button1 = (Button) findViewById(R.id.button2);

	       Button button2 = (Button) findViewById(R.id.button3);

	       Button button3 = (Button) findViewById(R.id.button4);


	        button.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		  EditText et = (EditText) findViewById(R.id.editText1);
	        	   		EditText et1 = (EditText) findViewById(R.id.editText2);
	        	   		String theText = et.getText().toString();
	        	   		String theText1 = et1.getText().toString();
	        		url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseCreate/"+theText+"/"+theText1;

	            	//Toast.makeText(getBaseContext(), theText, Toast.LENGTH_SHORT).show();
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });

	       button1.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		  EditText et = (EditText) findViewById(R.id.editText1);
	        	   		EditText et1 = (EditText) findViewById(R.id.editText2);
	        	   		String theText = et.getText().toString();
	        	   		String theText1 = et1.getText().toString();
	        		url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseInsert/"+theText+"/-home-cloudera-sk7x9.txt/"+theText1;

	            	//Toast.makeText(getBaseContext(), theText, Toast.LENGTH_SHORT).show();
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });

	       button2.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		  EditText et = (EditText) findViewById(R.id.editText3);
	        	   		//EditText et1 = (EditText) findViewById(R.id.editText2);
	        	   		String theText = et.getText().toString();
	        	   		//String theText1 = et1.getText().toString();
	        		url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseRetrieveAll/"+theText;

	            	//Toast.makeText(getBaseContext(), theText, Toast.LENGTH_SHORT).show();
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });

	       button3.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		  EditText et = (EditText) findViewById(R.id.editText3);
	        	   		//EditText et1 = (EditText) findViewById(R.id.editText2);
	        	   		String theText = et.getText().toString();
	        	   		//String theText1 = et1.getText().toString();
	        		url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbasedeletel/"+theText;

	            	//Toast.makeText(getBaseContext(), theText, Toast.LENGTH_SHORT).show();
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
