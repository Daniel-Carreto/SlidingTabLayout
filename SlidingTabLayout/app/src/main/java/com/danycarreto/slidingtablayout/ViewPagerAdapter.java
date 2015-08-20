package com.danycarreto.slidingtablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DanyCarreto on 20/08/15.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final int totalPaginas = 3;
    private String[] titulos;
    public ViewPagerAdapter(FragmentManager fm, String[] titulos) {
        super(fm);
        this.titulos = titulos;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PrimerFragment();
            case 1:
                return new SegundoFragment();
            case 2:
                return new TercerFragment();
        }
        return null;
    }

    public CharSequence getPageTitle(int position) {
        return titulos[position];
    }
    @Override
    public int getCount() {
        return totalPaginas;
    }
}
