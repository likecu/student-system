package com.ischoolbar.programmer.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ischoolbar.programmer.util.StringUtil;
/**
 * @ÖÜÑî
 * µÇÂ¼ÑéÖ¤servlet
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5870852067427524781L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String vcode = request.getParameter("vcode");
		String loginCpacha = request.getSession().getAttribute("loginCpacha").toString();
		if(StringUtil.isEmpty(vcode)) {
			response.getWriter().write("vcodeError");
			return;
		}
		if(!vcode.toUpperCase().equals(loginCpacha.toUpperCase())) {
			response.getWriter().write("vcodeError");
			return;
		}
	}

}
