package com.gzz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gzz
 * @create 2021-11-27 22:04
 */
public class MainTest {
	public static void main(String[] args) {
		System.out.println("第一个测试！");
		AnnotationConfigApplicationContext cpxac = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] names = cpxac.getBeanDefinitionNames();
		for(String name : names){
			System.out.println(name);
		}
	}
}
