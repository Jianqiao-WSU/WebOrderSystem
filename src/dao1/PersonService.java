package dao1;

public class PersonService {  
    private String name;  
  
    // name���Ե�setter����  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    // ����Person���info����  
    public void info() {  
        System.out.println("������Ϊ��" + name);  
    }  
}  
