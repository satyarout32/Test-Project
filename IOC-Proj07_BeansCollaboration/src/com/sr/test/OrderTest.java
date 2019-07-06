package com.sr.test;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sr.beans.Flipkart;

public class OrderTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Flipkart fpkt=null;
		
		res=new ClassPathResource("com/sr/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);

		fpkt=factory.getBean("fkart", Flipkart.class);
		
		//System.out.println(fpkt.shopping(new String[] {"flag","sweets","kurta"});
		
		
	}

}
