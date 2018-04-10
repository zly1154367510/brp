package com.zly.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import com.zly.web.formbean.RegisterFormBean;
/*
 * 
 * ����
 * ������ת����bean
 */
public class WebUtils {

	public static <T>T requestToBean(HttpServletRequest request,Class<T> beanClass){
		try {
			
			//����bean����
			T bean = beanClass.newInstance();
			
			//request����ת����bean��
			Enumeration e = request.getParameterNames();
			while(e.hasMoreElements()){
				String name = (String) e.nextElement();	
				String value = request.getParameter(name);
				BeanUtils.setProperty(bean, name, value);
			}
			return bean;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void beanToEntity(Object src,Object dest) throws IllegalAccessException, InvocationTargetException{
		BeanUtils.copyProperties(dest, src);
	}




}
