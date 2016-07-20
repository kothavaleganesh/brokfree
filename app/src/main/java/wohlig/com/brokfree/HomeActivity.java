package wohlig.com.brokfree;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

/**
 * Created by Mahesh on 6/28/2016.
 */
public class HomeActivity extends Activity{

    private ViewPager viewPager;
    private TabLayout tabLayout;
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }*/

  /*  private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new EnquiryFragment(), "Enquiry");
        adapter.addFragment(new ClientFragment(), "Clients");
        viewPager.setAdapter(adapter);
    }*/
}
