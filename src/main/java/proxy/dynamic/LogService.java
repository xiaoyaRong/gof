package proxy.dynamic;

import java.util.Date;

public class LogService {

    public void saveStartLog(String method){
        System.out.println(method + "使用 开始时间" + new Date());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void saveEndLog(String method){
        System.out.println(method + "使用 结束时间" + new Date());
    }

}
