package com.relive.webservice.cxf;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface="com.relive.webservice.cxf.HelloWorld",serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	Map<Integer,User> users = new LinkedHashMap<Integer,User>();
	
	@Override
	public String sayHi(String text) {
		return "Hello " + text;
	}

	@Override
	public String sayHiToUser(User user) {
		users.put(users.size() + 1, user);
		return "Hello " + user.getName();
	}

	@Override
	public String[] sayHiToUserList(List<User> userList) {
		String[] result = new String[userList.size()];
		int i = 0;
		for(User user : userList){
			result[i] = "Hello " + user.getName();
			i++;
		}
		return result;
	}

}
