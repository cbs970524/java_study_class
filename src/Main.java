import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BroadcastTeam gmbs = new BroadcastTeam();
        WorshipTeam gmws = new WorshipTeam();

        Person p1 = new Person("최범식",20,"m");
        Person p2 = new Person("홍길동",30,"m");
        Person p3 = new Person("이순신",10,"m");
        Person p4 = new Person("신사임당",15,"f");
        Person p5 = new Person("세종대왕",25,"m");
        Person p6 = new Person("율곡이이",35,"m");

        gmbs.addNewMember(p1);
        gmbs.addNewMember(p2);
        gmbs.addNewMember(p3);
        gmws.addNewMember(p4);
        gmws.addNewMember(p5);
        gmws.addNewMember(p6);

        gmbs.setLeader(p1);
        gmws.setLeader(p2);

        Camera cam1 = new Camera("sony");
        Camera cam2 = new Camera("canon");
        Computer com1 = new Computer("samsung");
        Computer com2 = new Computer("LG");
        Mic mic1 = new Mic("sm58","dynamic");
        Mic mic2 = new Mic("beta58","condenser");
        Mic mic3 = new Mic("sm57", "dynamic");
        Speaker sp1 = new Speaker("vp7212","active");
        Speaker sp2 = new Speaker("eon600", "active");

        List<Equipment> equipmentList = new ArrayList<>(Arrays.asList(cam1,cam2,com1,com2,mic1,mic2,mic3,sp1,sp2));

        gmbs.buyEquipment(equipmentList);
        gmbs.fixComputer(com2);
        gmbs.throwMic(mic3);
        gmbs.throwMic("sm58");

        List<Department> team = new ArrayList<>();
        team.add(gmbs);
        team.add(gmws);

        for(int i=0;i<team.size();i++){
            team.get(i).working();
        }
    }
}