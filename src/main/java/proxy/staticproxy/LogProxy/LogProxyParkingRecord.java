package proxy.staticproxy.LogProxy;

public class LogProxyParkingRecord implements IParkingRecord {

    private ParkingRecordImpl parkingRecord;

    public LogProxyParkingRecord(ParkingRecordImpl parkingRecord) {
        this.parkingRecord = parkingRecord;
    }


    @Override
    public Object carOut() {
        this.saveLog("car out");
        parkingRecord.carOut();
        return 0;
    }

    @Override
    public Object carEnter() {
        this.saveLog("car enter");
        parkingRecord.carEnter();
        return 3;
    }


    void saveLog(String method){
        System.out.println("log for " + method + "is use");
    }
}
