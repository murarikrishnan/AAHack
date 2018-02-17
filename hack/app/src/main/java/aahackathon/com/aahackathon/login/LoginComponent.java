package aahackathon.com.aahackathon.login;

import aahackathon.com.aahackathon.application.NetworkComponent;
import aahackathon.com.aahackathon.utils.Scope;
import dagger.Component;

@Scope
@Component(dependencies = NetworkComponent.class, modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
