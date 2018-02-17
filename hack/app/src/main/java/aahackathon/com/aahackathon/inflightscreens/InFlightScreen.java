package aahackathon.com.aahackathon.inflightscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

import aahackathon.com.aahackathon.HomeScreen.MainActivity;
import aahackathon.com.aahackathon.R;
import aahackathon.com.aahackathon.application.MainApplicaition;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */

public class InFlightScreen extends AppCompatActivity implements View.OnClickListener, InflightPresenter.View {

    @Inject
    InFlightModel mInFlightModel;

    private Button mWifiButton;
    private Button mAssistButton;
    private Button mChannelButton;
    private Button mEmergencyButton;
    private Button mBuyButton;
    private Button mDestinationDetailButton;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_dashboard:
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
        setContentView(R.layout.in_flight);

        DaggerInFlightComponent.builder()
                .networkComponent(((MainApplicaition)getApplicationContext()).getNetworkComponent())
                .inFlightModule(new InFlightModule(this))
                .build().inject(this);

        mWifiButton = (Button) findViewById(R.id.wifi);
        mAssistButton = (Button) findViewById(R.id.assist);
        mBuyButton = (Button) findViewById(R.id.buy);
        mChannelButton = (Button) findViewById(R.id.channel);
        mDestinationDetailButton = (Button) findViewById(R.id.details);
        mEmergencyButton = (Button) findViewById(R.id.emergency);

        mEmergencyButton.setOnClickListener(this);
        mDestinationDetailButton.setOnClickListener(this);
        mChannelButton.setOnClickListener(this);
        mBuyButton.setOnClickListener(this);
        mAssistButton.setOnClickListener(this);
        mWifiButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buy:
                mInFlightModel.onCategoryClick();
                break;
            case R.id.details:
                mInFlightModel.onCategoryClick();
                break;
            case R.id.emergency:
                mInFlightModel.onCategoryClick();
                break;
            case R.id.wifi:
                mInFlightModel.onCategoryClick();
                break;
            case R.id.assist:
                mInFlightModel.onCategoryClick();
                break;
            case R.id.channel:
                mInFlightModel.onCategoryClick();
                break;
        }
    }

    @Override
    public void onRefresh() {
        Toast.makeText(this, "Request accepted", Toast.LENGTH_SHORT).show();
    }
}
