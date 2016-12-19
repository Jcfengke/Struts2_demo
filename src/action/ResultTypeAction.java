package action;

/**
 * Created by songjinfengPC on 2016/12/13.
 * <p>
 * ResultTypeAction
 * 1,去分resulttype；
 * 2,深刻理解不同类型的区别；
 */
public class ResultTypeAction {


    public String action = "ResultTypeAction";

    public String info = "";

    public String getInfo() {
        return info;
    }

    public String getAction() {
        return action;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String execute() {

        System.out.println("action:"+action.toString());

        System.out.println("info:" + info.toString());

        int number=Integer.parseInt(info);

        String  result="";

        switch (number){
            case 1:
                result="dispatcher";
                break;
            /*case 2:
                result="freemaker";
                break;
            case 3:
                result="httpheader";
                break;
            case 4:
                result="stream";
                break;
            case 5:
                result="velocity";
                break;
            case 6:
                result="xslt";
                break;
            case 7:
                result="plainText";
                break;
            case 8:
                result="chain";
                break;
            case 9:
                result="redirect";
                break;
            case 10:
                result="redirectAction";
                break;
            case 11:
                result="postback";
                break;
*/
        }

        System.out.println("result:" + result.toString());

        return result;
    }


}
