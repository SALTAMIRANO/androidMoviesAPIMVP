package com.tareas.clase5moviesapi.features.splash.presenter;

import com.tareas.clase5moviesapi.features.splash.model.ICallbackSplash;
import com.tareas.clase5moviesapi.features.splash.model.IModelSplash;
import com.tareas.clase5moviesapi.features.splash.view.IViewSplash;

public class SplashPresenterImpl implements IPresenterSplash, ICallbackSplash {

    IViewSplash view;
    IModelSplash model;

    public SplashPresenterImpl(IViewSplash view, IModelSplash model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void doWait() {
        view.showLoading(true);
        model.wait(this);
    }

    @Override
    public void success() {
        view.showLoading(false);
        view.goLogin();
    }


}
