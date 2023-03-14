import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Department> team = new ArrayList<>();

        team.add(new BroadcastTeam());
        team.add(new WorshipTeam());

        Person p1 = new Person("최범식",20,'m');
        Person p2 = new Person("홍길동",30,'m');
        Person p3 = new Person("이순신",10,'m');
        Person p4 = new Person("신사임당",15,'f');
        Person p5 = new Person("세종대왕",25,'m');
        Person p6 = new Person("율곡이이",35,'m');

        team.get(0).addNewMember(p1);
        team.get(0).addNewMember(p2);
        team.get(0).addNewMember(p3);
        team.get(1).addNewMember(p4);
        team.get(1).addNewMember(p5);
        team.get(1).addNewMember(p6);

        team.get(0).newLeader(team.get(0).member.get(0));
        team.get(1).newLeader(team.get(1).member.get(0));

        Camera cam1 = new Camera("sony");
        Computer com1 = new Computer("samsung");
        Mic mic1 = new Mic("sm58","dynamic");
        Mic mic2 = new Mic("beta58","condenser");
        Speaker sp1 = new Speaker("vp7212","active");

        List<Equipment> equipmentList = new ArrayList<>(Arrays.asList(cam1,com1,mic1,sp1,mic2));

        BroadcastTeam gmbs = (BroadcastTeam) team.get(0);
        gmbs.buyEquipment(equipmentList);

        team.get(0).working();
        team.get(1).working();
    }
}