//package com.concretepage;
//
//import org.owasp.csrfguard.CsrfGuardHttpSessionListener;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//import org.springframework.session.web.http.SessionEventHttpSessionListenerAdapter;
//
//import javax.servlet.http.HttpSessionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class SpringConfig {
//    @Bean
//    public SessionEventHttpSessionListenerAdapter session() {
//        System.out.println("=================loading bean========================");
//        List<HttpSessionListener> listeners = new ArrayList<HttpSessionListener>();
//        listeners.add(new CsrfGuardHttpSessionListener());
//        return new SessionEventHttpSessionListenerAdapter(listeners);
//    }
//}
