package aahackathon.com.aahackathon.application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import aahackathon.com.aahackathon.utils.ApplicationConstants;
import aahackathon.com.aahackathon.utils.ForApplication;
import aahackathon.com.aahackathon.utils.PrefInfo;
import dagger.Module;
import dagger.Provides;

/**
 * Created by MURARI.RAVINATH on 19-01-2018.
 */
@Module
class ApplicationModule {

    Application mApplication;
    Context mContext;

    public ApplicationModule(Application application){
        mApplication = application;
        mContext = application.getApplicationContext();
    }

    @Provides
    @Singleton
    Application provideApplication() {return mApplication;}

    @Provides
    @ForApplication
    Context provideContext() {return mContext;}

    @Provides
    @PrefInfo
    String providePrefName() {return ApplicationConstants.PREF_NAME;}

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences (){
        return  mContext.getSharedPreferences("airasia", Context.MODE_PRIVATE);
    }

}
