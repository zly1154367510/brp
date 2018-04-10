package com.zly.demo;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShareVarServlet
 */
@WebServlet(name = "ShareVarServlet" ,urlPatterns = {"/ShareVarServlet"})
public class ShareVarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareVarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 三种变量共享
		 * Servler 全局变量
		 * Session 变量
		 * request 单次请求变量
		 */
		ServletContext ctx = this.getServletContext();
		ctx.setAttribute("ctx_name", "ctx_value");
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("session_name", "session_value");
		
		request.setAttribute("request_name", "request_value");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
