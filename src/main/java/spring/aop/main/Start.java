package spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.objects.FileManager;

public class Start {

	public static void main(String[] args) {
		System.setProperty("org.springframework.aop.framework.bytebuddy", "true");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		FileManager fileManager = (FileManager) context.getBean("fileManager");
		fileManager.getExtensionCount("c:\\Windows\\System32");
		fileManager.getExtensionCount("c:\\Windows\\");
		fileManager.getExtensionCount("c:\\Windows\\system32\\drivers");
	}
}
