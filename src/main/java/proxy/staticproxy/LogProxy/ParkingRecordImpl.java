package proxy.staticproxy.LogProxy;

public class ParkingRecordImpl implements IParkingRecord {
    @Override
    public Object carOut() {
        System.out.println("车辆出场业务执行");
        return 1;
    }

    @Override
    public Object carEnter() {
        System.out.println("车辆入场业务执行");
        return 2;
    }
}
