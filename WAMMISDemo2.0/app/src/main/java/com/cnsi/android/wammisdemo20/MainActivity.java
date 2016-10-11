package com.cnsi.android.wammisdemo20;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action here!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Add Profile Fragment to default view upon succeful login
        Fragment profFrag = new ProfileFragment();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame_container,profFrag).commit();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            Toast.makeText(getApplicationContext(), "Successfully logged out!!", Toast.LENGTH_SHORT).show();
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation drawer view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;

        if (id == R.id.nav_dashboard)
        {
            fragment = new DashboardFragment();
        }
        if (id == R.id.nav_profile)
        {
            fragment = new ProfileFragment();
        }
        else if (id == R.id.nav_id)
        {
            fragment = new ViewIDFragment();
        }
        else if (id == R.id.nav_elig)
        {
            fragment = new EligibilityFragment();
        }
        else if (id == R.id.nav_household)
        {
            fragment = new HouseholdFragment();
        }
        else if (id == R.id.nav_contact)
        {
            fragment = new ContactUsFragment();
        }
        else if (id == R.id.nav_faq)
        {
            fragment = new FAQFragment();
        }
        else if (id == R.id.nav_resources)
        {
            fragment = new ResourcesFragment();
        }
        else if (id == R.id.nav_correspondence)
        {
            fragment = new ViewCorrespondenceFragment();
        }
        else if (id == R.id.nav_new_id)
        {
            fragment = new NewIDFragment();
        }
        else if (id == R.id.nav_changeplan)
        {
            fragment = new PlanChangeFragment();
        }
        else if (id == R.id.nav_provider)
        {
            fragment = new FindProviderFragment();
        }





        if(fragment != null)
        {
            FragmentManager fragmentManager = getFragmentManager();

            fragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
