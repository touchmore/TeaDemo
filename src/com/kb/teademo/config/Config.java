package com.kb.teademo.config;

public class Config {
	// ��ȡ����apk�汾·��
	public static final String UPDATE_APK_PATH = "http://baike.maimaicha.com/getversion.ashx";
	// ��ҳ�õ�Ƭ����·��
	public static final String HOMEPATH = "http://sns.maimaicha.com/api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.getSlideshow";
	// ͷ������·��
	public static final String HEADLINEPATH = "http://sns.maimaicha.com/api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.getHeadlines";
	// ������ҳ
	public static final String NEWCONTENTPATH = "http://sns.maimaicha.com/api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.getNewsContent&id=";
	// �ٿ� post�� rows=15&page=0&type=16
	public static final String BAIKEPATH = "http://sns.maimaicha.com/api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.getListByType";
	// ���� post�� rows=10&page=1&search=tea
	public static final String SEARCHPATH = "http://sns.maimaicha.com/api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.searcListByTitle";
	// ��Ѷ post��rows=15&page=0&type=52
	public static final String INFORMATIONPATH = BAIKEPATH;
	// ��Ӫ�ӿڣ�ͬ�� post��rows=15&page=0&type=53
	public static final String OPERATE = BAIKEPATH;
	// ���ݽӿڣ�ͬ�� post��rows=15&page=0&type=54
	public static final String DATAPAGER = BAIKEPATH;

}
