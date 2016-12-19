package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by songjinfengPC on 2016/12/13.
 *
 *  3.继承 com.opensymphony.xwork2.ActionSupport
 *  解析：
 *          本质：实现了com.opensymphony.xwork2.Action;这个接口，同时还支持序列化
 *
 *
 *
 */
public class ExtendAction   extends ActionSupport {

    public    String     action="继承的com.opensymphony.xwork2.ActionSupport";

    public    String     info="";


    public String getInfo() {
        return info;
    }

    public String getAction() {
        return action;
    }

    public void setInfo(String info) {
        this.info = "继承的com.opensymphony.xwork2.ActionSupport";
    }

    public void setAction(String action) {
        this.action = action;
    }


    /**
     * 原方法一直是返回：SUCCESS
     * @return
     * @throws Exception
     */
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
