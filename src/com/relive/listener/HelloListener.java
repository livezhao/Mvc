package com.relive.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("执行销毁方法...");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("启动监听，执行初始化方法。。。");
	}

}
