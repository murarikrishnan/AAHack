package aahackathon.com.aahackathon.HomeScreen;

import aahackathon.com.aahackathon.utils.Scope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */
@Module
public class MainModule {

    MainPresenter.View mView;

    public MainModule(MainPresenter.View view) {
        mView = view;
    }

    @Provides
    @Scope
    MainPresenter.View provideLoginPresenterView(){
        return mView;
    }

}
