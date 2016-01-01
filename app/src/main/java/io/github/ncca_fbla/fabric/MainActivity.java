package io.github.ncca_fbla.fabric;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout navigationDrawer;
    private ActionBarDrawerToggle drawerToggle;

    private Toolbar toolbar;

    private Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Store the context in case we need it out of scope.
        context = this;

        // Get the app name from a string resource and store it in a SpannableString.
        SpannableString appName = new SpannableString(getString(R.string.app_name));
        // TODO: Spannable string is not working.
        // appName.setSpan(new TypefaceSpan(self, "ThirsyScript.otf"), 0, appName.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Get the navigation drawer.
        navigationDrawer = (DrawerLayout) findViewById(R.id.navigation_drawer);

        // Set up the navigation drawer toggle.
        drawerToggle = new ActionBarDrawerToggle(context, navigationDrawer, R.string.drawer_open, R.string.drawer_close) {
            public void onDrawerClose(View view) {
                // TODO: What needs to happen?
            }

            public void onDrawerOpen(View view) {
                // TODO: What needs to happen?
            }
        };

        navigationDrawer.setDrawerListener(drawerToggle);

        // Set up ViewPager stuff and tabs.
        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        prepareViewPager(pager);

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(pager);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    private void prepareViewPager(ViewPager pager) {
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(null, "Home");
        adapter.addFragment(null, "Favorites");
        adapter.addFragment(null, "Social");
        adapter.addFragment(null, "Search");

        pager.setAdapter(adapter);
    }
}
