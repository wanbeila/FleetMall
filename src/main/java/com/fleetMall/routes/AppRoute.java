package com.fleetMall.routes;

import com.fleetMall.controller.MainViewController;
import com.jfinal.config.Routes;
import com.jfinal.core.Controller;

/**
 * Created by beila on 2017/4/18.
 */
public class AppRoute extends Routes {

    @Override
    public void config() {
        setBaseViewPath("/View/");
        add("/", MainViewController.class);
    }
}
