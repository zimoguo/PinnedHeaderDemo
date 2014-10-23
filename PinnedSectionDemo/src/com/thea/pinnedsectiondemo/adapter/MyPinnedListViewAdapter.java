/**
 * 
 */
package com.thea.pinnedsectiondemo.adapter;

import java.util.List;

import com.thea.pinnedsectiondemo.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import za.co.immedia.pinnedheaderlistview.SectionedBaseAdapter;

/**
 * @author thea
 *
 * 2014-10-16
 */
public class MyPinnedListViewAdapter extends SectionedBaseAdapter{
	
	private List<String> sectionList;
	private List<String> list;
	private Context context;

	public MyPinnedListViewAdapter(Context context,List<String> sectionList, List<String> list) {
		super();
		this.sectionList = sectionList;
		this.list = list;
		this.context = context;
	}

	@Override
	public Object getItem(int section, int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int section, int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSectionCount() {
		// TODO Auto-generated method stub
		return sectionList.size();
	}

	@Override
	public int getCountForSection(int section) {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public View getItemView(int section, int position, View convertView,
			ViewGroup parent) {
		ViewHold hold=null;
		if (convertView==null) {
			hold=new ViewHold();
			convertView=LinearLayout.inflate(context, R.layout.list_item, null);
			hold.tv_item=(TextView) convertView.findViewById(R.id.tv_item);
			convertView.setTag(hold);
		} else {
			hold=(ViewHold) convertView.getTag();
		}
		hold.tv_item.setText(list.get(position));
		return convertView;
	}

	@Override
	public View getSectionHeaderView(int section, View convertView,
			ViewGroup parent) {
		ViewHold hold=null;
		if (convertView==null) {
			hold=new ViewHold();
			convertView=LinearLayout.inflate(context, R.layout.section_item, null);
			hold.tv_section=(TextView) convertView.findViewById(R.id.tv_section_item);
			convertView.setTag(hold);
		} else {
			hold=(ViewHold) convertView.getTag();
		}
		hold.tv_section.setText(sectionList.get(section));
		return convertView;
	}

	class ViewHold{
		private TextView tv_section,tv_item;
		
	}
}
