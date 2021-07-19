package factory.lambda;

public class Me {

    //静态内部类
   static class LoveImpl2 implements Love{

        @Override
        public void loveMagic(Integer loveNumber) {

            System.out.println("you love me LoveImpl2" + loveNumber);

        }
    }


    public static void main(String[] args) {


       //局部内部类
        class LoveImpl3 implements Love{

            @Override
            public void loveMagic(Integer loveNumber) {

                System.out.println("you love me LoveImpl3" + loveNumber);

            }
        }

        //匿名内部类

        Love love4 = new Love() {
            @Override
            public void loveMagic(Integer loveNumber) {

                System.out.println("you love me LoveImpl4" + loveNumber);
            }
        };


        Love love = new LoveImpl();
        Love love2 = new LoveImpl2();
        Love love3 = new LoveImpl3();
        love.loveMagic(520);
        love2.loveMagic(521);
        love3.loveMagic(522);
        love4.loveMagic(523);

        Love love666 = (a) -> {

            while(true){
                --a;
                System.out.println(a);
                if(a == -2){
                    break;
                }
            }

        };
        love666.loveMagic(20);


    }






}

//内部类
class LoveImpl implements Love{

    @Override
    public void loveMagic(Integer loveNumber) {

        System.out.println("you love me" + loveNumber);

    }
}
