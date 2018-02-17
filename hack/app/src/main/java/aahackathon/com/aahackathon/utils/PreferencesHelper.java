package aahackathon.com.aahackathon.utils;

import javax.inject.Singleton;

@Singleton
public interface PreferencesHelper {



    Long getCurrentUserId();

    void setCurrentUserId(Long userId);



}