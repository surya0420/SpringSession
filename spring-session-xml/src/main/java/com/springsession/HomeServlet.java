package com.springsession;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		RequestDispatcher dispatch = request.getRequestDispatcher("index" +".jsp");
//
//		request.getSession().setAttribute("test","testdata");
//		dispatch.forward(request, response);
//	}
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		HttpSession httpSessionNReq =req.getSession(false);
//		System.out.println("httpSessionNReq========>"+httpSessionNReq);
//		req.getSession().setAttribute("test","dataaa");
//		String attributeName = req.getParameter("attributeName");
//		String attributeValue = req.getParameter("attributeValue");
//        //add attribute in HttpSession
//
//		req.getSession().setAttribute(attributeName, attributeValue);
//		HttpSession httpSessionYReq =req.getSession(true);
//		System.out.println("httpSessionYReq========>"+httpSessionYReq);
//		System.out.println(" req.getSession().getAttribute "+req.getSession().getAttribute("test"));
//		System.out.println("sessionId  :"+req.getSession().getId());
//		resp.sendRedirect(req.getContextPath() + "/*");
//	}


	@WebServlet("/home")
	public class HomeServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			String attributeName = req.getParameter("attributeName");
			String attributeValue = req.getParameter("attributeValue");
			//add attribute in HttpSession
			req.getSession().setAttribute(attributeName, attributeValue);
			System.out.println("testVale======>   "+req.getSession().getAttribute("testKey"));

			resp.sendRedirect(req.getContextPath() + "/");
		}
	}


