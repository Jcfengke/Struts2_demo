package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import mode.Person;

/**
 * Created by songjinfengPC on 2016/12/22.
 */
public class ModelDrivenAction extends ActionSupport implements ModelDriven<Person> {
    //定义Person对象用于承载getModel()方法返回的数据信息  
    //同时这里必须实例化对象,否则person的对象会为空  
    private Person person = new Person();

    public static int i=0;



    public Person getPerson() {
        System.out.println("getPerson正在被调用,i="+i);
        i++;
        return person;
    }

    @Override
    public String execute() throws Exception {

        System.out.println(person.toString());

        return SUCCESS;
    }

    @Override
    public Person getModel() {

        System.out.println("getModel正在被调用,i="+i);
        i++;
        return this.getPerson();
    }
}
