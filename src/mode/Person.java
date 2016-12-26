package mode;

/**
 * Created by songjinfengPC on 2016/12/26.
 */
public class Person {

    private  String name;
    private  String  sex;

    public void setName(String name) {
        this.name = name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }


    @Override
    public String toString() {
        return "姓名："+getName()+"性别："+getSex();
    }
}
