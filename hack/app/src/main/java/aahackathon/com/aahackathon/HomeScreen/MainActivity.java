package aahackathon.com.aahackathon.HomeScreen;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.HashMap;

import javax.inject.Inject;

import aahackathon.com.aahackathon.R;
import aahackathon.com.aahackathon.application.MainApplicaition;
import aahackathon.com.aahackathon.egifts.EGiftsScreen;
import aahackathon.com.aahackathon.inflightscreens.InFlightScreen;
import aahackathon.com.aahackathon.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainPresenter.View, DatePickerDialog.OnDateSetListener {

    @Inject
    MainModel mMainModel;

    private TextView mTextMessage;
    private Button mAddFIeldsButton;
    private Button mNextButton;
    private LinearLayout mEditTextLayout;
    private EditText mDateTextView1;
    private EditText mDateTextView2;
    private EditText mDateTextView3;
    private EditText mDateTextView4;
    private EditText mDateTextView5;
    private EditText mDateTextViewStatic;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    Intent intent = new Intent(getApplicationContext(), InFlightScreen.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_notifications:
                    Intent intent1 = new Intent(getApplicationContext(), EGiftsScreen.class);
                    startActivity(intent1);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder()
                .networkComponent(((MainApplicaition)getApplicationContext()).getNetworkComponent())
                .mainModule(new MainModule(this))
                .build().inject(this);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mEditTextLayout = (LinearLayout)findViewById(R.id.edittextscrollview);

        mAddFIeldsButton = (Button)findViewById(R.id.button3);
        mAddFIeldsButton.setOnClickListener(this);

        mNextButton = (Button)findViewById(R.id.button4);
        mNextButton.setOnClickListener(this);

        mDateTextView1 = (EditText) findViewById(R.id.dateview1);
        mDateTextView2 = (EditText) findViewById(R.id.dateview2);
        mDateTextView3 = (EditText) findViewById(R.id.dateview3);
        mDateTextView4 = (EditText) findViewById(R.id.dateview4);
        mDateTextView5 = (EditText) findViewById(R.id.dateview5);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button3){

            LinearLayout newLinearLayout = new LinearLayout(this);

            newLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

            AutoCompleteTextView editTextView = new AutoCompleteTextView(this);
            editTextView.setGravity(Gravity.CENTER);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT, 1);

            editTextView.setLayoutParams(params);

            newLinearLayout.addView(editTextView);

            EditText editText = new EditText(this);

            editText.setLayoutParams(params);

            newLinearLayout.addView(editText);

            mEditTextLayout.addView(newLinearLayout);


        }
        if(v.getId() == R.id.dateview1){
            mDateTextViewStatic = mDateTextView1;
            datePickerDisplay();
        }
        if(v.getId() == R.id.dateview2){
            mDateTextViewStatic = mDateTextView1;
            datePickerDisplay();
        }
        if(v.getId() == R.id.dateview3){
            mDateTextViewStatic = mDateTextView1;
            datePickerDisplay();
        }
        if(v.getId() == R.id.dateview4){
            mDateTextViewStatic = mDateTextView1;
            datePickerDisplay();
        }
        if(v.getId() == R.id.dateview5){
            mDateTextViewStatic = mDateTextView1;
            datePickerDisplay();
        }
        if(v.getId() == R.id.button4){
            mMainModel.onPlan(new HashMap());
        }
    }

    private void datePickerDisplay(){
        Calendar now = Calendar.getInstance();
        new android.app.DatePickerDialog(
                getApplication().getApplicationContext(),
                new android.app.DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Log.d("Orignal", "Got clicked");
                    }
                },
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        ).show();
    }

    @Override
    public void detailConfirmed(String pnr) {
        Toast.makeText(this, "thanks for the booking details your PNR NO : "+pnr, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFinish() {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = "You picked the following date: "+dayOfMonth+"/"+month+"/"+year;
        mDateTextViewStatic.setText(date);
    }
}
