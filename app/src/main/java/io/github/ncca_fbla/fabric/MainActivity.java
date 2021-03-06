/*
 * Copyright (c) NCCA FBLA 2016
 * Written by James Parsons
 *
 */

package io.github.ncca_fbla.fabric;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
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
        // TODO: Format the string with our font.
        getSupportActionBar().setTitle(appName);

        // Get the navigation drawer.
        navigationDrawer = (DrawerLayout) findViewById(R.id.navigation_drawer);

        // Set up the navigation drawer toggle.
        drawerToggle = new ActionBarDrawerToggle(context, navigationDrawer, R.string.action_drawer_open, R.string.action_drawer_close) {
            @SuppressWarnings("unused")
            public void onDrawerClose(View view) {
                invalidateOptionsMenu();
            }

            @SuppressWarnings("unused")
            public void onDrawerOpen(View view) {
                invalidateOptionsMenu();
            }
        };

        navigationDrawer.setDrawerListener(drawerToggle);

        // TODO: Set up the navigation drawer list.

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);

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
        adapter.addFragment(new HomeFragment(), "Home");
        adapter.addFragment(new StarredFragment(), "Favorites");
        adapter.addFragment(new SocialFragment(), "Social");

        pager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Run this if the nav drawer is activated.
        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        // Otherwise match the item that was pressed.
        switch(item.getItemId()) {
            case R.id.action_refresh:
                // TODO: Handle feed refresh.
                return true;

            case R.id.action_settings:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        // TODO: Safely log out.
    }
}