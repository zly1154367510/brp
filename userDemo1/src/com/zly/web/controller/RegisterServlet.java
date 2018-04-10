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
		 * 1.�Ա��ֶν��кϷ���У��
		 * 2.���У��ʧ�ܣ���ʾУ�������Ϣ
		 * 3.���У��ɹ�������service
		 * 4.���service����ʧ�ܣ�����ע��ҳ����ʾʧ����Ϣ
		 * 5.ע��ɹ�������ʾ
		 * 
		 */
		//��ȡ�ർform
		RegisterFormBean bean = WebUtils.requestToBean(request, RegisterFormBean.class);
		System.out.println(bean);
		//ִ�м���Ԫ�ط���
		boolean b = bean.checkFromElement();
		//��ȡ��¼�������map
		Map errors = bean.getErrors();
		if (!b) {
			//��Ԫ���д�
			request.setAttribute("errors", errors);
			request.setAttribute("test", "test");
			request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
			System.out.println("ע��ʧ��");
			return;
		}else{
			//��Ԫ����ȷ
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
					System.out.println("ע��ɹ�");
				} catch (UserExistException e) {
					// TODO Auto-generated catch block
					System.out.println("ע��ʧ��");
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
