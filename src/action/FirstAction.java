package action;

/**
 * Created by songjinfengPC on 2016/12/8.
 */

/**
 * struts2的action :
 *          1.原则上是无需实现任何接口或者继承任何类型
 *          2.我们为了方便实现Action，大多数情况下都会继承com.opensymphony.xwork2.ActionSupport类，并重载（Override）此类里的String execute()方法
 *          3.继承 com.opensymphony.xwork2.ActionSupport
 */

public class FirstAction {

    public    String     action="原始的action（无实现，无继承）";

    public    String     info="";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = "success";
    }



    public String   execute(){

        System.out.println("info:" + info.toString());

        if (info.contains("success")) {

            return "success";

        } else {

            return "error";

        }



    }

}
