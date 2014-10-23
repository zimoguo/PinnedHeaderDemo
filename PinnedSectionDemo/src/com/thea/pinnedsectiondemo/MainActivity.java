package com.thea.pinnedsectiondemo;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;

import com.thea.pinnedsectiondemo.adapter.MyPinnedListViewAdapter;

/**
 * @author thea
 *
 * 2014-10-16
 */
public class MainActivity extends ListActivity {
	
	MyPinnedListViewAdapter adapter;
	List<String> sectionList;
	List<String> list;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sectionList=new ArrayList<String>();
		list=new ArrayList<String>();
		
		sectionList.add("2014-10-12");
		sectionList.add("2014-10-13");
		sectionList.add("2014-10-14");
		sectionList.add("2014-10-15");
		sectionList.add("2014-10-16");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		
		adapter=new MyPinnedListViewAdapter(MainActivity.this,sectionList, list);
		setListAdapter(adapter);
	}



}
