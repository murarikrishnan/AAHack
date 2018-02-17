package aahackathon.com.aahackathon.utils;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.inject.Inject;

/**
 * Created by MURARI.RAVINATH on 29-11-2017.
 */

public class ApplicationUtils {

    @Inject
    Context mContext;

    public static HashMap getDeviceDataFourValue() {
        HashMap deviceData = new HashMap();
        try {
            deviceData.put(NetworkConstants.APP_NAME, ApplicationConstants.APP_NAME);
            deviceData.put(NetworkConstants.DEVICE_ID, "sadjfbasjhkdfbkasjhbdkfjasbhdkfjasbh");
            deviceData.put(NetworkConstants.OS_TYPE, NetworkConstants.OS_ANDROID);
            deviceData.put(NetworkConstants.APP_VERSION, 1.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deviceData;
    }



    public static String getTokenId() {
        String token = "";
        return token;
    }

    public static HashMap getDeviceDataAndUniqueNum() {
        HashMap jsonObject = new HashMap();
        try{
            HashMap deviceData = new HashMap();
            deviceData.put(NetworkConstants.APP_NAME, ApplicationConstants.APP_NAME);
            deviceData.put(NetworkConstants.DEVICE_ID, "sadjfbasjhkdfbkasjhbdkfjasbhdkfjasbh");
            deviceData.put(NetworkConstants.OS_TYPE, NetworkConstants.OS_ANDROID);
            deviceData.put(NetworkConstants.APP_VERSION, 1.0);
            jsonObject.put(NetworkConstants.DEVICE_DATA,deviceData);
            jsonObject.put(NetworkConstants.REQ_IDENTIFICATION_NUM, ((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L)+new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date()));
            jsonObject.put(NetworkConstants.DUP_REQ, "false");
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonObject;
    }

}
