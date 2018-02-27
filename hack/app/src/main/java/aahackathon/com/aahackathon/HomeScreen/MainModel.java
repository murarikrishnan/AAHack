package aahackathon.com.aahackathon.HomeScreen;

import java.util.HashMap;

import javax.inject.Inject;

import aahackathon.com.aahackathon.dao.PlanPojo;
import aahackathon.com.aahackathon.network.NetworkWebService;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */

public class MainModel implements MainPresenter.Presenter {

    Retrofit mRetrofit;
    MainPresenter.View mView;

    @Inject
    public MainModel(Retrofit retrofit, MainPresenter.View view){
        mRetrofit = retrofit;
        mView = view;
    }

    @Override
    public void onPlan(HashMap inputMap) {
/**
 * the below code will be used if the webservice is from api, since the time is not enough will be just commenting
 * returning a success message
 */
        mRetrofit.create(NetworkWebService.class).getPlanDetails().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<PlanPojo>() {
                    @Override
                    public void onCompleted() {
                        mView.onFinish();
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.print("Error");
                    }

                    @Override
                    public void onNext(PlanPojo planPojo) {
                        System.out.print("OnNext");
                        mView.detailConfirmed(planPojo.getPNR());

                    }
                });

//     mView.onFinish();



    }
}
