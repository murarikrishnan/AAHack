package aahackathon.com.aahackathon.inflightscreens;

import aahackathon.com.aahackathon.utils.Scope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */
@Module
public class InFlightModule {
    InflightPresenter.View view;

    public InFlightModule(InflightPresenter.View view){
        this.view = view;
    }

    @Provides
    @Scope
    InflightPresenter.View providesSignupPresenterView(){
        return view;
    }
}
