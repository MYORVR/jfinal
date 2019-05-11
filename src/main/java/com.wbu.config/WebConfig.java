package com.wbu.config;

import com.jfinal.config.*;
import com.jfinal.core.JFinalFilter;
import com.jfinal.render.ViewType;
import com.wbu.controller.IndexController;
import com.wbu.controller.NewsController;

public class WebConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setEncoding("UTF-8");
        //设置为开发模式（如果为fals，jfinal会缓存页面，导致开发时修改页面后不能立即呈现）
        constants.setDevMode(true);
        //jfinal支持很多类型的页面，这里设置为jsp，FreeMarker也支持）
        constants.setViewType(ViewType.JSP);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", IndexController.class);
        routes.add("/news", NewsController.class);
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
