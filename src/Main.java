import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> camera = new ArrayList<>(Arrays.asList("sony","samsung"));
        BroadcastTeam gmbs = new BroadcastTeam();
        gmbs.camera = camera;


        gmbs.buyMic("sure");

        Person p1 = new Person("beomsik",27,'m');
        Person p2 = new Person("gildong");
        gmbs.addNewMember(p1);
        gmbs.addNewMember(p2);
    }
}