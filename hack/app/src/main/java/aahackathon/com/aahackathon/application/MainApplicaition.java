package aahackathon.com.aahackathon.application;

import android.app.Application;

import aahackathon.com.aahackathon.utils.ApplicationConstants;


/**
 * Created by MURARI.RAVINATH on 19-01-2018.
 */

public class MainApplicaition extends Application{

    NetworkComponent mNetworkComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetworkComponent = DaggerNetworkComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(ApplicationConstants.INTERNAL_URL))
                .build();

    }

    public NetworkComponent getNetworkComponent(){
        return mNetworkComponent;
    }
}
