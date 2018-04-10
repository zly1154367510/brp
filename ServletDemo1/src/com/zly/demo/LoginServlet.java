package com.zly.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "LoginServlet",description = "登录程序", urlPatterns = { "/LoginServlet" })
/* 
 * @WebServlet 类级注解 将该类注册成Servlet
 * description Servlet描述
 * urlPatterns Servlet 访问url 等介于wed.xml中的<url-patterns>标签
 * 
 * Servlet生命周期
 * 实例化->相应请求方法
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GET");
		
		/**
		 * 获取web.xml获取的全局变量
		 * 
		 */
		String contextParam = this.getServletContext().getInitParameter("testParam");
        System.out.println("contextParam");
        
        /*
         * 请求重定向
         */
        
        response.sendRedirect("https://www.baidu.com");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("POST");
	}

}
