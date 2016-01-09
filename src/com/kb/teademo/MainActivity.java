package com.kb.teademo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kb.teademo.fragment.Fragment_tops;

public class MainActivity extends FragmentActivity {
	private HorizontalScrollView horizontalScrollView;
	private LinearLayout linearLayout;
	private ViewPager viewPager;
	private Fragment fragment;
	private FragmentPagerAdapter fragmentPagerAdapter;

	private void initView() {
		horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hs_main);// 导航栏
		linearLayout = (LinearLayout) findViewById(R.id.ll_main);
		viewPager = (ViewPager) findViewById(R.id.vp_main);
		for (int i = 0; i < linearLayout.getChildCount(); i++) {
			TextView textView = (TextView) linearLayout.getChildAt(i);
			textView.setTextColor(0xff000000);
		}
		((TextView) linearLayout.getChildAt(0)).setTextColor(Color.GREEN);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				// 触发导航栏，变化颜色及位置
				horizontalScrollView.smoothScrollTo(100 * arg0, 0);
				for (int i = 0; i < linearLayout.getChildCount(); i++) {
					TextView textView = (TextView) linearLayout.getChildAt(i);
					textView.setTextColor(0xff000000);
				}
				((TextView) linearLayout.getChildAt(arg0))
						.setTextColor(Color.GREEN);

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});

		fragmentPagerAdapter = new FragmentPagerAdapter(
				getSupportFragmentManager()) {

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return linearLayout.getChildCount();
			}

			@Override
			public Fragment getItem(int arg0) {
				// TODO Auto-generated method stub
				switch (arg0) {
				case 0:
					fragment = new Fragment_tops();
					break;
				case 1:
					fragment = new Fragment_tops();
				case 2:
					fragment = new Fragment_tops();
				case 3:
					fragment = new Fragment_tops();
				case 4:
					fragment = new Fragment_tops();

				default:
					break;
				}

				return fragment;
			}
		};

		viewPager.setAdapter(fragmentPagerAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClick(View view) {
		int n = linearLayout.indexOfChild(view);
		// 变化颜色
		for (int i = 0; i < linearLayout.getChildCount(); i++) {
			TextView textView = (TextView) linearLayout.getChildAt(i);
			textView.setTextColor(0xff000000);
		}
		((TextView) linearLayout.getChildAt(n)).setTextColor(Color.GREEN);
		// 变化页面
		viewPager.setCurrentItem(linearLayout.indexOfChild(view));
	}
}
