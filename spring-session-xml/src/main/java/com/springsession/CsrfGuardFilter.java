//package com.concretepage;
//
//import org.owasp.csrfguard.CsrfGuard;
//import org.owasp.csrfguard.http.InterceptRedirectResponse;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class CsrfGuardFilter implements Filter {
//
//	FilterConfig filterConfig = null;
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		this.filterConfig = filterConfig;
//
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
//			throws IOException, ServletException {
//
//
//		if (!CsrfGuard.getInstance().isEnabled()) {
//			filterChain.doFilter(request, response);
//			return;
//		}
//
//		if (request instanceof HttpServletRequest && response instanceof HttpServletResponse) {
//			HttpServletRequest req = (HttpServletRequest) request;
//
//			CsrfGuard csrfGuard = CsrfGuard.getInstance();
//			InterceptRedirectResponse httpResponse = new InterceptRedirectResponse((HttpServletResponse) response, req,
//					csrfGuard);
//			String contextPath = req.getContextPath();
//			String requestURI = req.getRequestURI();
//
//			//to handle first request in weblogic when csrf token is enabled (in weblogic contextpath is <appId>/AppzillonWeb)
//			if((req.getMethod().equals("GET")) && ((contextPath+"/").equals(requestURI) || (contextPath).equals(requestURI)
//					|| (contextPath+"/AppzillonWeb/").equals(requestURI) || (contextPath+"/AppzillonWeb").equals(requestURI))) {
//				filterChain.doFilter(request, response);
//			} else if (csrfGuard.isValidRequest(req, httpResponse)) {
//				filterChain.doFilter(req, httpResponse);
//			} else {
//				/**
//				 * invalid request - nothing to do - actions already executed
//				 **/
//			}
//
//		} else {
//			filterChain.doFilter(request, response);
//		}
//
//	}
//
//	@Override
//	public void destroy() {
//		filterConfig = null;
//	}
//}
