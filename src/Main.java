import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> camera = new ArrayList<>(Arrays.asList("sony","samsung"));
        BroadcastTeam gmbs = new BroadcastTeam();
        gmbs.camera = camera;
        gmbs.showInfo();
        System.out.println(gmbs.camera);
        gmbs.buyCamera("lg");
        System.out.println(gmbs.camera);
        gmbs.fixCamera("samsang");
        System.out.println(gmbs.camera);
    }
}