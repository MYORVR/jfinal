package com.wbu.controller;

import com.jfinal.core.Controller;



public class IndexController extends Controller {
        public void show(){
            String name = getPara("name");
            int age = getParaToInt("password");
            System.out.println("姓名"+name+"密码"+age);
        }
}
