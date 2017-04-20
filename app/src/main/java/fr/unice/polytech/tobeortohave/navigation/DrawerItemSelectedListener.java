package fr.unice.polytech.tobeortohave.navigation;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import fr.unice.polytech.tobeortohave.R;
import fr.unice.polytech.tobeortohave.navigation.NavigationPageAdapter;

/**
 * @author Alexandre Clement
 *         Created the 20/04/2017.
 */

public class DrawerItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener
{
    private final FragmentActivity fragmentActivity;
    private final NavigationPageAdapter navigationPageAdapter;

    public DrawerItemSelectedListener(FragmentActivity fragmentActivity)
    {
        this.fragmentActivity = fragmentActivity;
        navigationPageAdapter = new NavigationPageAdapter(fragmentActivity.getSupportFragmentManager());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        fragmentActivity.setTitle(item.getTitle());
        final Fragment fragment = navigationPageAdapter.getItem(item.getItemId());
        fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment).commit();
        final DrawerLayout drawer = (DrawerLayout) fragmentActivity.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
