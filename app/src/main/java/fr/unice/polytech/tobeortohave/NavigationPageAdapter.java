package fr.unice.polytech.tobeortohave;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.util.SparseArrayCompat;

/**
 * @author Alexandre Clement
 *         Created the 20/04/2017.
 */

public class NavigationPageAdapter extends FragmentPagerAdapter
{
    private final SparseArrayCompat<Fragment> sparseArrayCompat;

    public NavigationPageAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);
        sparseArrayCompat = new SparseArrayCompat<>();
        sparseArrayCompat.append(R.id.home_item, new HomeFragment());
        sparseArrayCompat.append(R.id.stock_item, new StockFragment());
        sparseArrayCompat.append(R.id.settings_item, new SettingsFragment());
    }

    @Override
    public Fragment getItem(int position)
    {
        return sparseArrayCompat.get(position);
    }

    @Override
    public int getCount()
    {
        return sparseArrayCompat.size();
    }
}
