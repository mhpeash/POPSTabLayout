package com.mhpeash.popstablayout.Tab_Layout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public TabAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RecentFragment();
            case 1:
                return new SpecialFragment();
            case 2:
                return new DiscountFragment();
            case 3:
                return new CategoryFragment();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
