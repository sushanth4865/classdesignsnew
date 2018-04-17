package tejadoc;

/**
 * Created by kasir on 4/2/2018.
 */
enum State {
    KF,RC,KO;
}
public class EnumExample {
    public static void main(String[] args)
    {
        State b = State.RC;
        State[] barr = State.values();
        for(State state : barr)
        {
            System.out.println(state.ordinal()+""+ state.name());
        }
    }
}
