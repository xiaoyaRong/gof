package proxy.staticproxy;

public class HouseProxy implements House {

    private FindHouseBoy boy;


    public HouseProxy(FindHouseBoy boy) {
        this.boy = boy;
    }

    @Override
    public void findHouse() {

        //检索房源信息
        checkHouseInfo(boy.getRequired());

        //看房
        boy.findHouse();

        payForThis();


    }

    private void checkHouseInfo(String required) {
        System.out.println("中介根据boy的需求：" + required + "检索房源信息");
    }

    private void payForThis() {
        System.out.println("--->中介收取中介费");
    }
}
