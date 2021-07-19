package proxy.dynamic;

import proxy.staticproxy.LogProxy.IParkingRecord;
import proxy.staticproxy.LogProxy.LogProxyParkingRecord;
import proxy.staticproxy.LogProxy.ParkingRecordImpl;

import java.util.Objects;

public class Client {

    public static void main(String[] args) {

        ProxyHandle proxyHandle = new ProxyHandle();
        proxyHandle.setParkingRecord(new ParkingRecordImpl());
        IParkingRecord proxy = (IParkingRecord)proxyHandle.getProxy();
        proxy.carEnter();
        proxy.carOut();

    }
}
