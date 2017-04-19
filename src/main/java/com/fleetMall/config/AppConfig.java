package com.fleetMall.config;

import com.fleetMall.global.Common;
import com.fleetMall.global.GlobalValue;
import com.fleetMall.interceptor.UserStatusInterceptor;
import com.fleetMall.model._MappingKit;
import com.fleetMall.routes.AppRoute;
import com.jfinal.config.*;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

/**
 * Created by beila on 2017/4/18.
 */
public class AppConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
        me.setBaseUploadPath("com/fleetMall/files");
        me.setBaseDownloadPath("com/fleetMall/files");
//        配置上传文件大小为20M
        me.setMaxPostSize(1024 * 1024 * 20);
        me.setError404View("/404.html");
        me.setError500View("/500.html");
    }

    @Override
    public void configRoute(Routes me) {
        me.add(new AppRoute());
    }

    @Override
    public void configEngine(Engine me) {

    }

    @Override
    public void configPlugin(Plugins me) {
//      配置德鲁伊连接池插件
        loadPropertyFile("database.properties");

        DruidPlugin druidPlugin = new DruidPlugin(
                getProperty("jdbcUrl"),
                getProperty("username"),
                getProperty("password")
        );

        me.add(druidPlugin);
        ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(druidPlugin);
        _MappingKit.mapping(activeRecordPlugin);
        me.add(activeRecordPlugin);

    }

    @Override
    public void configInterceptor(Interceptors me) {
        me.add(new UserStatusInterceptor());
    }

    @Override
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("fleet_mall"));
    }

    @Override
    public void afterJFinalStart() {
//        初始化全局的ConcurrentMap
        Common.globalValue = GlobalValue.getInstance();
    }
}
