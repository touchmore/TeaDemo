package com.kb.teademo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.kb.teademo.R;
import com.kb.teademo.asynctask.LoadPicAsyncTask;
import com.kb.teademo.config.Config;

public class Fragment_tops extends Fragment {
	private ViewPager viewPager;// ����ֲ�
	private LinearLayout linearLayout;// ���ָʾС��
	private TextView textView;// �����Ϣ
	private ListView listView;// �б�
	private View view;
	private PagerAdapter pagerAdapter;

	private void initView() {
		viewPager = (ViewPager) view.findViewById(R.id.vp_tops);
		linearLayout = (LinearLayout) view.findViewById(R.id.ll_ad_tops);
		textView = (TextView) view.findViewById(R.id.tv_ad_tops);
		listView = (ListView) view.findViewById(R.id.lv_tops);

	}

	private void initCtrl() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = View.inflate(getActivity(), R.layout.fragment_tops, null);
		initView();
		// Ϊ�õ�ƬViewPager��Ӽ���
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				// ����С��任
				for (int i = 0; i < linearLayout.getChildCount(); i++) {
					linearLayout.getChildAt(i).setSelected(false);
				}
				linearLayout.getChildAt(arg0).setSelected(true);
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
		// �����첽���������ȡ��������ͼƬ
		new LoadPicAsyncTask(viewPager, getActivity()).execute(Config.HOMEPATH);

		return view;
	}
}
