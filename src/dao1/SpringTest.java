package dao1;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao1.PersonService;  

public class SpringTest {
	public static void main(String[] args) {  
        // ����Spring��ApplicationContext  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx); // ���Spring����  
  
        // ͨ�� Spring ������ȡ Person ʵ������Ϊ Person ʵ����������ֵ�����ַ�ʽ��Ϊ���Ʒ�ת��IoC��  
        PersonService p = ctx.getBean("personService", PersonService.class);  
        p.info();  
    }  
}
