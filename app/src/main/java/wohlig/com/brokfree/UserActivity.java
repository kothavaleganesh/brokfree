package wohlig.com.brokfree;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by Mahesh on 6/28/2016.
 */
public class UserActivity extends AppCompatActivity implements NavigationDrawerCallbacks {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    TextView toolbartitle;
    Toolbar toolbar=null ;

    private NavigationDrawerFragment mNavigationDrawerFragment;
    boolean inUserActivity = true;
    ViewPagerAdapter adapter;
    MainActivity ma=new MainActivity();
    FragmentManager fm = getSupportFragmentManager();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbartitle= (TextView) findViewById(R.id.toolbar_title);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false );
            toolbartitle.setText("USER");

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

//            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//            navigationView.setNavigationItemSelectedListener(this);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.fragment_drawer);


        // Set up the drawer.
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, drawer, toolbar);
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new UserFragment(), "User");
        adapter.addFragment(new PropertyFragment(), "Property");
        viewPager.setAdapter(adapter);
    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        if (position == 0) {
            if (inUserActivity) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i=new Intent(UserActivity.this, MainActivity.class);
                        i.putExtra("client1",0);
                        startActivity(i);
//                        ma.onNavigationDrawerItemSelected(0);
                    }
               }, 300);
            }
        }
        if (position == 1) {
            if (inUserActivity) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i=new Intent(UserActivity.this, MainActivity.class);
                        i.putExtra("client1",1);
                        startActivity(i);


                    }
                }, 300);
            }
        }
        if (position == 2) {
            if (inUserActivity) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDFragment alertdFragment = new AlertDFragment();
                        // Show Alert DialogFragment
                        alertdFragment.show(fm, "Alert Dialog Fragment");

                    }
                }, 300);
            }
        }

    }
}
