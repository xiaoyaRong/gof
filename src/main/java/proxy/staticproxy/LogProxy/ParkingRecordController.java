package proxy.staticproxy.LogProxy;

public class ParkingRecordController {

    private IParkingRecord parkingRecord;


    public void setParkingRecord(IParkingRecord parkingRecord) {
        this.parkingRecord = parkingRecord;
    }

    private void carOut(){
        parkingRecord.carOut();
    }



    public static void main(String[] args) {
        ParkingRecordController parkingRecordController = new ParkingRecordController();

        parkingRecordController.setParkingRecord(new ParkingRecordImpl());
        parkingRecordController.carOut();



        //parkingRecordController.setParkingRecord(new LogProxyParkingRecord(new ParkingRecordImpl()));
        //parkingRecordController.carOut();
    }
}
