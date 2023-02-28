import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BroadcastTeam gmbs = new BroadcastTeam();
        Camera c1 = new Camera("cam1");
        Camera c2 = new Camera("cam2");
        Camera[] cameras = new Camera[10];
        cameras[0] = c1;
        cameras[1] = c2;
        gmbs.buyCamera(cameras);

        Person p1 = new Person("beomsik",27,'m');
        Person p2 = new Person("gildong",25,'f');
        gmbs.addNewMember(p1);
        gmbs.addNewMember(p2);

        //Speaker[] s1 = new Speaker[]{new Speaker("jbl123", "active")};
        Speaker s1 = new Speaker("jbl123", "active");
        gmbs.buySpeaker(s1);
        Mic[] m1 = new Mic[]{new Mic("sure123", "dynamic")};
        gmbs.buyMic(m1);
        Computer[] com1 = new Computer[]{new Computer("com1")};
        gmbs.buyComputer(com1);

        gmbs.broadcasting(p1,c1,s1,m1,com1);
    }
}