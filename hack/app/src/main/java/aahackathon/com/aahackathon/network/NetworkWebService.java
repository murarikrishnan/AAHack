package aahackathon.com.aahackathon.network;

import java.util.HashMap;

import aahackathon.com.aahackathon.dao.LoginPojo;
import aahackathon.com.aahackathon.dao.PlanPojo;
import aahackathon.com.aahackathon.dao.SignUpResponse;
import aahackathon.com.aahackathon.utils.NetworkConstants;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by manjula.patil on 30-01-2018.
 */

public interface NetworkWebService {
    @Headers("Cookie: ")
    @POST(NetworkConstants.PLAN_URL)
    Observable<PlanPojo> getPlanDetails(@Body HashMap jsonObject);

    @Headers("Cookie: ")
    @POST(NetworkConstants.SIGNUP_URL)
    Observable<SignUpResponse> getSignUp(@Body HashMap jsonObject);

    @Headers("Cookie: ")
    @POST(NetworkConstants.LOGIN_URL)
    Observable<LoginPojo> getLoginDetails(@Body HashMap jsonObject);
}
