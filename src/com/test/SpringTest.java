package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.IUsbBiz;

public class SpringTest {
 public static void main(String[] args) {
	 //����Spring�������Ĺ�ϵ���󣬼��������ĵ������ļ�
	ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
	//��ȡע���ʵ�������Ϊ�ӿڸ�ֵ���ӿ�ע��
	IUsbBiz ubiz=(IUsbBiz)ctx.getBean("usbDev");
	IUsbBiz ubiz1=(IUsbBiz)ctx.getBean("usbDev1");
	ubiz.service();
	ubiz1.service();
}
}
