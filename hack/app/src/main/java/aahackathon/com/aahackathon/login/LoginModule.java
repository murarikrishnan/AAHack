package aahackathon.com.aahackathon.login;

import aahackathon.com.aahackathon.utils.Scope;
import dagger.Module;
import dagger.Provides;


@Module
public class LoginModule {

    LoginPresenter.View mView;

    public LoginModule(LoginPresenter.View view) {
        mView = view;
    }

    @Provides
    @Scope
    LoginPresenter.View provideLoginPresenterView(){
        return mView;
    }
}
