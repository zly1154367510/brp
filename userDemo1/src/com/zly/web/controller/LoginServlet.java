package com.zly.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zly.domain.User;
import com.zly.exception.UserExistException;
import com.zly.service.impl.BusinessServiceIml;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String code = request.getParameter("code");
		String codeValue = (String)request.getSession().getAttribute("codeString");
		if(codeValue != null && codeValue.equals(code)){
			BusinessServiceIml businessServiceIml = new BusinessServiceIml();
			try {
				
				User user = businessServiceIml.login(username, password);
				if (user != null) {
					request.getSession().setAttribute("user", user);
					response.sendRedirect(request.getContextPath()+"/index.jsp");
					System.out.println("登录成功");
					return;
				}
			} catch (UserExistException e) {
				// TODO Auto-generated catch block
				System.out.println("用户不存在");
			}
		}else{
			System.out.println("验证码错误");
			request.setAttribute("message", "验证码错误");
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
