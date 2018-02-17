package aahackathon.com.aahackathon.login;

import java.util.HashMap;

/**
 * Created by MURARI.RAVINATH on 19-01-2018.
 */

public class LoginPresenter
{

    public interface View{

        void gotoSignUp();
        void onFinish();
    }

    public interface Presenter{

        void onLogin(HashMap inputMap);

    }

}
