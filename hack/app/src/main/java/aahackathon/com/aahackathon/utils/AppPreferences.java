package aahackathon.com.aahackathon.utils;

import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class AppPreferences implements PreferencesHelper {

    private static SharedPreferences mPrefs;

    private static final String PREF_USER_ID = "user_id";


    @Inject
    public AppPreferences(SharedPreferences sharedPreferences) {
        mPrefs =sharedPreferences;
    }


    @Override
    public Long getCurrentUserId() {
        long userId = mPrefs.getLong(PREF_USER_ID, 0);
        return userId == 0 ? 0 : userId;
    }

    @Override
    public void setCurrentUserId(Long userId) {
        long id = userId == null ? 0 : userId;
        mPrefs.edit().putLong(PREF_USER_ID, id).apply();
    }
}

