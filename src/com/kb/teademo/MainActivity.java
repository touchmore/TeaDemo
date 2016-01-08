package com.kb.teademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	private HorizontalScrollView horizontalScrollView;
	private LinearLayout linearLayout;

	private void initView() {
		horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hs_main);// µ¼º½À¸
		linearLayout = (LinearLayout) findViewById(R.id.ll_main);

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
