package aahackathon.com.aahackathon.HomeScreen;

import java.util.HashMap;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */

public class MainPresenter {

    public interface View{

        void gotoSignUp();
        void onFinish();
    }

    public interface Presenter{

        void onPlan(HashMap inputMap);

    }

}
