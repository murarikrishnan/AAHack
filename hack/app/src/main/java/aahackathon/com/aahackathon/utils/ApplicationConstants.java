package aahackathon.com.aahackathon.utils;


import java.util.concurrent.atomic.AtomicInteger;

public class ApplicationConstants {

    public static String APP_NAME = "AirAsia hackathon";
    public static String PREF_NAME = "AAHack";

    public static String INTERNAL_URL ="https://api.myjson.com/";


    public static final String BUILDNUMBER= "V"+" 0.16"+".102";
    public static long RAND_NUM = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    public static StringBuilder LOG_TEXT = new StringBuilder();
    private final static AtomicInteger c = new AtomicInteger(0);
    public static int getID() {
        return c.incrementAndGet();
    }



    public static final String APPLICATION_TYPE = "2";


    //"YouTube Integration

    public static final String DEALER_ID = "10547145";
    public static final String OEM_ID = "1001";

}