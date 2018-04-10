package com.zly.web.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.zly.domain.User;
import com.zly.exception.UserExistException;
import com.zly.service.impl.BusinessServiceIml;
import com.zly.utils.WebUtils;
import com.zly.web.formbean.RegisterFormBean;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 1.对表单字段进行合法性校验
		 * 2.如果校验失败，显示校验错误信息
		 * 3.如果校验成功，调用service
		 * 4.如果service处理失败，跳回注册页面显示失败信息
		 * 5.注册成功发出提示
		 * 
		 */
		//获取编导form
		RegisterFormBean bean = WebUtils.requestToBean(request, RegisterFormBean.class);
		System.out.println(bean);
		//执行检查表单元素方法
		boolean b = bean.checkFromElement();
		//获取记录表单错误的map
		Map errors = bean.getErrors();
		if (!b) {
			//表单元素有错
			request.setAttribute("errors", errors);
			request.setAttribute("test", "test");
			request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
			System.out.println("注册失败");
			return;
		}else{
			//表单元素正确
			User user = new User();
			BusinessServiceIml businessServiceIml = new BusinessServiceIml();
			
			try {
				
				/*
				 * 
				 * 
				 * 	private String cickName;
					private String userName;
					private String passWord;
					private String email;
					private String birhday;
					
					private String username;
					private String password;
					private String email;
					private String brihbay;
					private String cickname;
				 */
				WebUtils.beanToEntity(bean, user);
				try {
					businessServiceIml.register(user);
					System.out.println("注册成功");
				} catch (UserExistException e) {
					// TODO Auto-generated catch block
					System.out.println("注册失败");
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
