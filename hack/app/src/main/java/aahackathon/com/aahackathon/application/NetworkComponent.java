package aahackathon.com.aahackathon.application;

import android.content.Context;

import javax.inject.Singleton;

import aahackathon.com.aahackathon.utils.AppPreferences;
import aahackathon.com.aahackathon.utils.ForApplication;
import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by MURARI.RAVINATH on 19-01-2018.
 */
@Singleton
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface NetworkComponent {
    @ForApplication
    Context getContext();

    AppPreferences getAppPref();

    Retrofit retrofit();
}
