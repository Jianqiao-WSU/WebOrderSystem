package dao1;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao1.PersonService;  

public class SpringTest {
	public static void main(String[] args) {  
        // 创建Spring的ApplicationContext  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx); // 输出Spring容器  
  
        // 通过 Spring 容器获取 Person 实例，并为 Person 实例设置属性值（这种方式称为控制反转，IoC）  
        PersonService p = ctx.getBean("personService", PersonService.class);  
        p.info();  
    }  
}
