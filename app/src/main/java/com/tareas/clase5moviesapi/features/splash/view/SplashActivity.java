package com.tareas.clase5moviesapi.features.splash.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.tareas.clase5moviesapi.R;
import com.tareas.clase5moviesapi.features.login.view.LoginActivity;
import com.tareas.clase5moviesapi.features.splash.model.SplashModelImpl;
import com.tareas.clase5moviesapi.features.splash.presenter.IPresenterSplash;
import com.tareas.clase5moviesapi.features.splash.presenter.SplashPresenterImpl;

public class SplashActivity extends AppCompatActivity  implements IViewSplash {
    private IPresenterSplash presenter;
    private ProgressBar proBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        proBar = findViewById(R.id.proBar);

        presenter = new SplashPresenterImpl(this, new SplashModelImpl(getApplicationContext()));
        presenter.doWait();
    }


    @Override
    public void showLoading(Boolean visible) {
        proBar.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    @Override
    public void goLogin() {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        finish();
    }
}