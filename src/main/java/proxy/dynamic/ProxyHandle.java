package proxy.dynamic;

import proxy.staticproxy.LogProxy.IParkingRecord;
import proxy.staticproxy.LogProxy.ParkingRecordImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class ProxyHandle implements InvocationHandler {


    private Object target;


    public void setParkingRecord(Object object) {
        this.target = object;
    }


    //生成得到代理类事例
    public Object getProxy(){
        Object obj =  Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return obj;
    }




    //调用代理类具体的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        LogService logService = new LogService();
        logService.saveStartLog(method.getName());

        Object invoke = method.invoke(target, args);

        logService.saveEndLog(method.getName());

        return invoke;
    }







}
