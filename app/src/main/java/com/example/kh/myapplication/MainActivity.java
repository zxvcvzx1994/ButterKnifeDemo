package com.example.kh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kh.myapplication.View.MyFragment;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnLogout)
    Button btnLogOut;
    @BindView(R.id.etUser)
    EditText etUser;
    @BindView(R.id.etPass)
    EditText etPass;
    @BindColor(R.color.colorPrimaryDark)
    int colorPrimaryDark;
    private MyFragment myFragment;
   @OnClick(R.id.btnLogin)
   public void submit(Button button){
       Toast.makeText(getApplicationContext(), "121", Toast.LENGTH_SHORT).show();
   }
   @OnClick (R.id.btnLogout)
   public void sub(){
       Toast.makeText(this, "f", Toast.LENGTH_SHORT).show();
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if(myFragment==null){
            myFragment = new MyFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.linemain, myFragment,"MyFragment").commit();
        }else{
            myFragment= (MyFragment) getSupportFragmentManager().findFragmentByTag("MyFragment");
        }
    }
}
