package aahackathon.com.aahackathon.HomeScreen;

import aahackathon.com.aahackathon.application.NetworkComponent;
import aahackathon.com.aahackathon.utils.Scope;
import dagger.Component;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */
@Scope
@Component(dependencies = NetworkComponent.class, modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
