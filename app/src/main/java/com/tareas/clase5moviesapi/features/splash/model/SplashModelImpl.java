package com.tareas.clase5moviesapi.features.splash.model;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class SplashModelImpl implements IModelSplash {
    Context context;

    public SplashModelImpl(Context context) {
        this.context = context;
    }


    @Override
    public boolean wait(final ICallbackSplash callback) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.success();
            }
        }, 3000);
        return true;
    }
}
