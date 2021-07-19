package adapter;

public class UgreenAdapter  implements Adapte {

    private Pda pda;

    public UgreenAdapter(Pda pda) {
        this.pda = pda;
    }

    @Override
    public void conn() {
        pda.connectPda();
    }
}
