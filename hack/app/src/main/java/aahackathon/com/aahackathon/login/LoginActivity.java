package aahackathon.com.aahackathon.login;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

import javax.inject.Inject;

import aahackathon.com.aahackathon.HomeScreen.MainActivity;
import aahackathon.com.aahackathon.R;
import aahackathon.com.aahackathon.application.MainApplicaition;


/**
 * Created by MURARI.RAVINATH on 19-01-2018.
 */

public class LoginActivity extends Activity implements View.OnClickListener, LoginPresenter.View {

    private Button button, button_signup;

    @Inject
    LoginModel loginModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        button = (Button)findViewById(R.id.button);
        button_signup = (Button)findViewById(R.id.button_signup);
        button_signup.setOnClickListener(this);
        button.setOnClickListener(this);

        DaggerLoginComponent.builder()
                .networkComponent(((MainApplicaition)getApplicationContext()).getNetworkComponent())
                .loginModule(new LoginModule(this))
                .build().inject(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {
            HashMap inputMap = new HashMap();
            inputMap.put("sdjkhf", "bjhkasd");
            loginModel.onLogin(inputMap);
        }
       if(v.getId() == R.id.button_signup){
           gotoSignUp();
       }

    }


    @Override
    public void gotoSignUp() {

    }

    @Override
    public void onFinish() {
        Toast.makeText(this, "thanks for logging in", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
