package com.inovex.zabbixmobile.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.inovex.zabbixmobile.activities.fragments.ChecksDetailsPage;
import com.inovex.zabbixmobile.model.Application;
import com.inovex.zabbixmobile.model.TriggerSeverity;

/**
 * Base class for a pager adapter containing details pages for a particular
 * severity (see {@link TriggerSeverity}. The base functionality is similar to
 * {@link FragmentPagerAdapter}.
 * 
 * @param <T>
 *            class of the items in this adapter's data set
 */
public class ApplicationPagerAdapter extends
		BaseServicePagerAdapter<Application> {

	@Override
	public CharSequence getPageTitle(int position) {
		return getItem(position).getName();
//		return ((ChecksDetailsPage)getPage(position)).getTitle();
//		return "TITLE";
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	protected Fragment getPage(int position) {
		ChecksDetailsPage p = new ChecksDetailsPage();
		p.setApplication(getItem(position));
		return p;
	}

}
