//package com.concretepage;
//
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.owasp.csrfguard.CsrfGuard;
//import org.owasp.csrfguard.CsrfGuardException;
//import org.owasp.csrfguard.action.IAction;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Map;
//
//import static com.concretepage.AppzillonConstants.*;
//
//public class CsrfRedirect implements IAction {
//
//	/**
//	 *
//	 */
//	private static final long serialVersionUID = 1L;
//
//
//
//
//
//	@Override
//	public void setName(String name) {
//		// TODO Auto-generated method stub
//
//	}
//
//
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public void setParameter(String name, String value) {
//		// TODO Auto-generated method stub
//
//	}
//
//
//	@Override
//	public String getParameter(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public Map<String, String> getParameterMap() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void execute(HttpServletRequest request, HttpServletResponse response, CsrfGuardException csrfe,
//			CsrfGuard csrfGuard) throws CsrfGuardException {
//		if(request.getMethod().equals("GET")) {
//			System.out.println("CsrfGuardException"+ csrfe);
//			System.out.println("Invalid GET request : " + request.getRequestURI());
//			RequestDispatcher dispatch = request.getRequestDispatcher("/apps/error.jsp");
//			try {
//				dispatch.forward(request, response);
//			} catch (ServletException se) {
//				System.out.println("ServletException"+ se);
//			} catch (IOException ioe) {
//				System.out.println("IOException"+ ioe);
//			}
//			return;
//		}
//		try {
//			JSONObject appzHeader = null;
//			JSONObject result =null;
//			appzHeader = null;
//			JSONArray appzErrors = new JSONArray();
//			JSONObject error = new JSONObject();
//			appzHeader.put(STATUS, false);
//			boolean res = request.getSession().isNew();
//			if(res){
//				System.out.println("Session timed out");
//				error.put(APPZILLON_ERROR_MSG, "A valid session does not exist");
//				error.put(APPZILLON_ERROR_CODE, "APZ-SMS-EX-003");
//				System.out.println("Invalidating session " + request.getSession(false));
//				request.getSession(false).invalidate();
//			} else {
//				System.out.println("CsrfGuardException"+ csrfe);
//				System.out.println("Invalid POST request : " + result);
//				error.put(APPZILLON_ERROR_MSG, "Invalid request token");
//				error.put(APPZILLON_ERROR_CODE, "APZ-CSRF-EX");
//			}
//			appzErrors.put(0, error);
//			result.put(APPZILLON_HEADER, appzHeader);
//			result.put(APPZILLON_BODY, new JSONObject());
//			result.put(APPZILLON_ERRORS, appzErrors);
//			//Utility.buildAndSendResponse(request, response, result.toString());
//		} catch (JSONException je) {
//			System.out.println("JSONException"+je);
//		}
//	}
//
//
//
//}
