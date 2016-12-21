package action;

/**
 * Created by songjinfengPC on 2016/12/13.
 *  ResultTypeUseAciton
 *                      1.被ResultTypeAction调用（struts2使用）
 */
public class ResultTypeUseAciton {


    //前台传过来的信息
    public String info = "";
    //设置返回值
    public  String  action_result="";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAction_result() {
        return action_result;
    }

    public void setAction_result(String action_result) {
        this.action_result = action_result;
    }



    public String execute(){
        System.out.println("已经进入到：ResultTypeUseAciton");
        System.out.println("收到的action_result:"+action_result);
        System.out.println("收到的info:"+info);
        action_result="进入到ResultTypeUseAciton，执行流程：ResultTypeAction-》ResultTypeUseAciton-》当前";
        System.out.println("修改后的action_result："+action_result);
        System.out.println("ResultTypeUseAciton操作结束！");

        return "success";
    }




}
