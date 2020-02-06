package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.IUsbBiz;

public class SpringTest {
 public static void main(String[] args) {
	 //创建Spring的上下文关系对象，加载上下文的配置文件
	ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
	//获取注入的实现类对象，为接口赋值，接口注入
	IUsbBiz ubiz=(IUsbBiz)ctx.getBean("usbDev");
	IUsbBiz ubiz1=(IUsbBiz)ctx.getBean("usbDev1");
	ubiz.service();
	ubiz1.service();
}
}
