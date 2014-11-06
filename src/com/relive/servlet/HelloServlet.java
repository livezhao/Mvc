package com.relive.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.ws.Endpoint;

import com.relive.webservice.cxf.HelloWorldImpl;

public class HelloServlet extends GenericServlet {

	private static final long serialVersionUID = -566043926299855050L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("执行servlet。。init方法..");
		super.init();
		Endpoint.publish("http://localhost:8888/javaWs/wsFile", new HelloWorldImpl());
	}
	
	public void service(ServletRequest sRequest, ServletResponse sResponse)
			throws ServletException, IOException {
		System.out.println("执行servlet..service方法..");
	}

}
