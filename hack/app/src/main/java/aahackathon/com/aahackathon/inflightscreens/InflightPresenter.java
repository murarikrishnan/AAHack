package aahackathon.com.aahackathon.inflightscreens;

/**
 * Created by MURARI.RAVINATH on 17-02-2018.
 */

public class InflightPresenter {

    public interface View{

        void onRefresh();
    }

    public interface Presenter{

        void onCategoryClick();

    }

}
