package com.fleetMall.controller;

import com.fleetMall.interceptor.UserStatusInterceptor;
import com.jfinal.aop.Clear;
import com.jfinal.core.Controller;

/**
 * Created by beila on 2017/4/18.
 */
public class EmployeeController extends Controller {

    public void index() {

    }

//======================================json start=================================================
    @Clear(UserStatusInterceptor.class)
    public void login() {
//        获取用户名，密码
        String username = getPara("username");
        String password = getPara("password");


    }

    public void add() {

    }

    public void list() {

    }

    public void delete() {

    }
// ======================================json end=================================================

}
