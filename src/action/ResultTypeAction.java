package action;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songjinfengPC on 2016/12/13.
 * <p>
 * ResultTypeAction
 * 1,去分resulttype；
 * 2,深刻理解不同类型的区别；
 */
public class ResultTypeAction {

    //action的名称
    public String action = "ResultTypeAction";
    //前台传过来的信息
    public String info = "";
    //设置返回值
    public  String  action_result="";

    public void setAction_result(String action_result) {
        this.action_result = action_result;
    }

    public String getAction_result() {
        return action_result;
    }

    public String getInfo() {
        return info;
    }

    public String getAction() {
        return action;
    }


    //执行方法
    public String execute() {

        //打印action的名称
        System.out.println("action:"+action);
        //打印info的信息
        System.out.println("info:" + info);

        //转化成数字
        int number=Integer.parseInt(info);

        //定义返回结果
        String  result="";

        switch (number){

            //dispatcher类型的跳转
            case 1:
                result="dispatcher";
                action_result="输出类型：dispatcher  </br>"
                +"action的类型："+this.getAction()+"</br>"
                +"测试结果："+"success";

                break;
            //freemarker类型的使用：
            case 2:
                action_result="输出类型：freemarker  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+"ftl文件+web.xml文件配置"
                        +"测试结果："+"success";
                result="freemarker";
                break;
            //httpheader类型的使用
            case 3:
                action_result="输出类型：httpheader  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+""
                        +"测试结果："+"success";
                result="httpheader";
                break;
            case 4:
                action_result="输出类型：stream  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+"struts2.xml文件需要做特殊配置，同时acitono里面需要添加几个方法"
                        +"测试结果："+"success";
                result="stream";
                break;
            case 5:
                result="velocity";
                break;
            case 6:
                action_result="输出类型：xslt  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+"如果报错：Operation not supported   可以创建 template.xml模板文件    "
                        +"测试结果："+"success";
                result="xslt";
                break;
            case 7:
                action_result="输出类型：plainText  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+""
                        +"测试结果："+"success";
                try{
                    ServletActionContext.getResponse().setContentType ("text/html;charset=utf-8");
                    PrintWriter out = ServletActionContext.getResponse().getWriter();
                    out.print(action_result);
                    out.flush();
                    out.close();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }finally {
                    result="plainText";

                }
                break;

            case 8:
                //Chain:基本用途是构造成一条动作链。前一个动作将控制权转交给后一个动作，而前一个动作的状态在后一个动作里仍然保持着。动作链由Chaining拦截器负责处理，因为这个拦截器是defaultStack拦截器栈的一份子，多以你随时都可以使用动作链。
                action_result="输出类型：chain  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+"需要额外的aciton配合使用，请详细阅读一下链接的内容：http://blog.csdn.net/randomnet/article/details/8656759  （本地info中的内容）"
                        +"测试结果："+"success";
                info="ResultTypeAction数据信息  info："+info;
                result="chain";
                break;

            case 9:
                action_result="输出类型：redirect  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+"需要额外的aciton配合使用,并且action处理完后重定向到一个视图资源（如：jsp页面），请求参数全部丢失，action处理结果也全部丢失。"
                        +"测试结果："+"success";
                result="redirect";

                break;


            case 10:
                action_result="输出类型：redirectAction  </br>"
                        +"action的类型："+this.getAction()+"</br>"
                        +"条件："+"需要额外的aciton配合使用,并且action处理完后重定向到一个视图资源（如：jsp页面），请求参数全部丢失，action处理结果也全部丢失。"
                        +"测试结果："+"success";
                result="redirectAction";
                break;

            /*case 11:
                result="postback";
                break;
*/
        }

        //获取action的ActionContext
        ActionContext actionContext=ActionContext.getContext();
        //放入到session中
        actionContext.getSession().put("action_result",action_result);

        System.out.println("返回结果:"+action_result);

        System.out.println("result:" + result);

        return result;
    }


    //获得下载文件的内容，可以直接读入一个物理文件或从数据库中获取内容
    public InputStream getInputStream(){
        //return new FileInputStream("somefile.rar"); 直接下载 somefile.rar

        InputStream     inputStream=null;
        //和 Servlet 中不一样，这里我们不需对输出的中文转码为 ISO8859-1
        try {
            inputStream=new ByteArrayInputStream("测试action的resul   type=stream的情况。".getBytes());
        }catch (Exception   e){
            System.out.println(e.getMessage());
        }
        return inputStream;
    }

    //对于配置中的 ${fileName}, 获得下载保存时的文件名
    public String getFileName() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String fileName = "序列号(" + df.format(new Date()) + ").txt";
        try {
            //中文文件名也是需要转码为 ISO8859-1，否则乱码
            return new String(fileName.getBytes(), "ISO8859-1");
        } catch (UnsupportedEncodingException e) {
            return "ActionResultStream.txt";
        }
    }


}
