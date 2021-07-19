package adapter;

public class Mac {

    void connectPda( Adapte adapte ){
        adapte.conn();
    }


    public static void main(String[] args) {

        Mac mac = new Mac();
        Pda pda = new Pda("xy");
        Adapte ugreenAdapter = new UgreenAdapter(pda);
        mac.connectPda(ugreenAdapter);
    }






}
