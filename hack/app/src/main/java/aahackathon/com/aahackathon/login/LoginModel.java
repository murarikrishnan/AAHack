package aahackathon.com.aahackathon.login;

import java.util.HashMap;

import javax.inject.Inject;

import aahackathon.com.aahackathon.dao.LoginPojo;
import aahackathon.com.aahackathon.network.NetworkWebService;
import aahackathon.com.aahackathon.utils.ApplicationUtils;
import aahackathon.com.aahackathon.utils.NetworkConstants;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by MURARI.RAVINATH on 19-01-2018.
 */

public class LoginModel implements LoginPresenter.Presenter {

    Retrofit mRetrofit;
    LoginPresenter.View mView;

    @Inject
    public LoginModel(Retrofit retrofit, LoginPresenter.View view) {
        mRetrofit = retrofit;
        mView = view;
    }

    @Override
    public void onLogin(HashMap inputMap) {
        HashMap inputObj = new HashMap();
        HashMap deviceData = ApplicationUtils.getDeviceDataFourValue();
        inputObj.put(NetworkConstants.DEVICE_DATA,deviceData);
        inputObj.put("userName", "murari.ravinath@concentrix.com");
        inputObj.put("password", "1234");
        inputObj.put("externalAuthentication", "false");
        inputObj.put("loginType", null);
        inputObj.put("dealerId", "1108717");

       /* mRetrofit.create(NetworkWebService.class).getLoginDetails(inputObj).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<LoginPojo>() {
                    @Override
                    public void onCompleted() {
                        mView.onFinish();
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.print("Error");
                    }

                    @Override
                    public void onNext(LoginPojo loginPojo) {
                        System.out.print("OnNext");
                    }
                });*/

       mView.onFinish();

    }

    /*private interface LoginService {
        @Headers("Cookie: ")
        @POST(NetworkConstants.LOGIN_URL)
        Observable<LoginPojo> getLoginDetails(@Body HashMap jsonObject);
    }*/
}
