package com.example.androidtest01;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.example.tool.Base64;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
String encrypedPwd="";
	public void onClick01(View v) {
		try {
			encrypedPwd = Base64.encodeBytes("1234567890".getBytes("UTF-8"));
			ST(encrypedPwd);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	public void onClick02(View v) {
		try {
			byte[] encryptedWithoutB64 = Base64.decode(encrypedPwd);
			String str=new String(encryptedWithoutB64);
			ST(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void ST(String s) {
		((TextView)findViewById(R.id.textView1)).setText(s);
	}

}
