package aahackathon.com.aahackathon.egifts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;

import aahackathon.com.aahackathon.R;
import aahackathon.com.aahackathon.inflightscreens.InFlightScreen;

/**
 * Created by MURARI.RAVINATH on 27-02-2018.
 */

public class EGiftsScreen extends AppCompatActivity implements View.OnClickListener {

    private FragmentTabHost mTabHost;
    private FrameLayout mContentFrame;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    Intent intent = new Intent(getApplicationContext(), InFlightScreen.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_notifications:

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.egifts_screen);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        Bundle myGiftsBundle = new Bundle();
        ArrayList imagesList = new ArrayList();
        imagesList.add("http://placehold.it/120x120&text=image1");
        imagesList.add("http://placehold.it/120x120&text=image2");
        imagesList.add("http://placehold.it/120x120&text=image3");
        imagesList.add("http://placehold.it/120x120&text=image4");
        imagesList.add("http://placehold.it/120x120&text=image5");
        imagesList.add("http://placehold.it/120x120&text=image1");
        imagesList.add("http://placehold.it/120x120&text=image2");
        myGiftsBundle.putStringArrayList("images",imagesList);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("My Gifts", null),
                EGiftsFragment.class, myGiftsBundle);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Gifts Sent", null),
                EGiftsFragment.class, myGiftsBundle);

    }

    @Override
    public void onClick(View v) {

    }
}
