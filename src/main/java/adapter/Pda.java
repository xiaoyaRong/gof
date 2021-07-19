package adapter;

public class Pda {

    private String name = "default";

    public Pda(String name) {
        this.name = name;
    }

    void connectPda(){

        System.out.println("pda 已连接" + name);
    }

}
