package aahackathon.com.aahackathon.inflightscreens;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */

public class InFlightModel implements InflightPresenter.Presenter{

    Retrofit mRetrofit;
    InflightPresenter.View mView;

    @Inject
    public InFlightModel(Retrofit retrofit, InflightPresenter.View view){
        mRetrofit = retrofit;
        mView = view;
    }


    @Override
    public void onCategoryClick() {
        mView.onRefresh();
    }
}
