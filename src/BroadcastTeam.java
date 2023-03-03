import java.util.ArrayList;
import java.util.List;

public class BroadcastTeam extends Department{
    List<String> team;
    //List<Person> member;
    List<Camera> camera;
    List<Speaker> speaker;
    List<Mic> mic;
    List<Computer> computer;

    BroadcastTeam(){
        this.team = new ArrayList<>();
        this.member = new ArrayList<Person>();
        this.camera = new ArrayList<Camera>();
        this.speaker = new ArrayList<Speaker>();
        this.mic = new ArrayList<Mic>();
        this.computer = new ArrayList<Computer>();
    }
    BroadcastTeam(ArrayList<String> team, ArrayList<Person> member, ArrayList<Camera> camera, ArrayList<Speaker> speaker, ArrayList<Mic> mic, ArrayList<Computer> computer){
        this.team = team;
        this.member = member;
        this.camera = camera;
        this.speaker = speaker;
        this.mic = mic;
        this.computer = computer;
    }
    void broadcasting(Person member, Camera camera, Speaker speaker, Mic mic, Computer computer) {
        if(this.member!=null && this.camera!=null && this.speaker!=null && this.mic!=null && this.computer!=null){
            camera.setting(camera.modelName);
            camera.use(camera.modelName);
            speaker.setting(speaker.modelName);
            speaker.use(speaker.modelName);
            mic.setting(mic.modelName);
            mic.use(mic.modelName);
            computer.setting(computer.modelName);
            computer.streaming(computer.modelName);
        }
        else{
            System.out.println("장비 또는 인원을 등록해주세요.");
        }
    }
    void working(Person person, Person[] persons){
        //장비도 매개변수로 받아야되는데... 그럼 오버라이딩이 아니게 되는데...
    }
    /*
    void addNewMember(Person member){
        this.member.add(member);
    }
    void deleteMember(Person member){
        this.member.remove(member);
    }*/
    void buyCamera(Camera[] camera){
        for(int i=0;i<camera.length;i++) {
            this.camera.add(camera[i]);
        }
    }
    void fixCamera(Camera camera){
        int find = this.camera.indexOf(camera);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("카메라를 수리했습니다.");
        }
    }
    void throwCamera(Camera camera){
        this.camera.remove(camera);
    }
    void  buyComputer(Computer[] computer){
        for(int i=0;i<computer.length;i++) {
            this.computer.add(computer[i]);
        }
    }
    void fixComputer(Computer[] computer){
        int find = this.computer.indexOf(computer);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("컴퓨터를 수리했습니다.");
        }
    }
    void throwComputer(Computer computer){
        this.computer.remove(computer);
    }
    void buySpeaker(Speaker[] speaker){
        for(int i=0;i<speaker.length;i++) {
            this.speaker.add(speaker[i]);
        }
    }
    void fixSpeaker(Speaker speaker){
        int find = this.speaker.indexOf(speaker);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("스피커를 수리했습니다.");
        }
    }
    void throwSpeaker(Speaker spaker){
        this.speaker.remove(spaker);
    }
    void buyMic(Mic[] mic){
        for(int i=0;i<mic.length;i++) {
            this.mic.add(mic[i]);
        }
    }
    void fixMic(Mic mic){
        int find = this.mic.indexOf(mic);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("마이크를 수리했습니다.");
        }
    }
    void throwMic(Mic mic){
        this.mic.remove(mic);
    }

    public String toString(){
        System.out.println("방송부의 인원은 "+member.toString()+"가 있으며 장비는 "+camera.toString()+speaker.toString()+mic.toString()+computer.toString() + "가 있습니다.");
        return null;
    }
}