package action;


import com.opensymphony.xwork2.Action;

/**
 * Created by songjinfengPC on 2016/12/12.
 *
 * 解析：
 *      接口：com.opensymphony.xwork2.Action;
 *
 *      定义了五个枚举，以及一个方法。
 *
 */
public class ImplementsAciton implements Action {


    public    String     action="实现的com.opensymphony.xwork2.Action接口的action";

    public    String     info="";


    public String getInfo() {
        return info;
    }

    public String getAction() {
        return action;
    }

    public void setInfo(String info) {
        this.info = "实现com.opensymphony.xwork2.Action接口";
    }

    public void setAction(String action) {
        this.action = action;
    }


    @Override
    public String execute() throws Exception {


        System.out.println("info:"+info.toString());

        if (info.contains("success")){

            return  SUCCESS;

        }else {

            return  ERROR;

        }

    }
}
