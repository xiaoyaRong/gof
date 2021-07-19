package proxy.staticproxy;

public class ProxyCompany {

    public static void main(String[] args) {

        FindHouseBoy boy = new FindHouseBoy("够大够明亮");

        HouseProxy houseProxy = new HouseProxy(boy);

        houseProxy.findHouse();

    }

}
