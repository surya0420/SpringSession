package com.springsession;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SampleHttpListener implements HttpSessionListener {


   public void sessionCreated(HttpSessionEvent httpSessionEvent){
        HttpSession httpSession = httpSessionEvent.getSession();
       System.out.println("inside listner class ====");
        httpSession.setAttribute("testKey","testValue");

       System.out.println("test value inside listner===>"+httpSession.getAttribute("testKey"));
    }
}
