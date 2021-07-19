package proxy.staticproxy;


public class FindHouseBoy implements House {


    private String required;

    public FindHouseBoy( String required) {
        this.required = required;
    }





    @Override
    public void findHouse() {

        //根据需求 检索房源信息

        System.out.println("找房男孩 开始看房 需求：" + required);


        //

    }

    public String getRequired() {
        return required;
    }

}
