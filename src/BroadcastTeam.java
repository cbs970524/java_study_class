import java.util.ArrayList;
import java.util.List;

public class BroadcastTeam {
    ArrayList<String> team;
    ArrayList<String> member;
    ArrayList<String> camera;
    ArrayList<String> speaker;
    ArrayList<String> mic;
    ArrayList<String> computer;

    void BroadcastTeam(){
        this.team = new ArrayList<>();
        this.member = new ArrayList<>();
        this.camera = new ArrayList<>();
        this.speaker = new ArrayList<>();
        this.mic = new ArrayList<>();
        this.computer = new ArrayList<>();
    }
    void BroadcastTeam(ArrayList team, ArrayList member, ArrayList camera, ArrayList speaker, ArrayList mic, ArrayList computer){
        this.team = team;
        this.member = member;
        this.camera = camera;
        this.speaker = speaker;
        this.mic = mic;
        this.computer = computer;
    }
    void broadcasting(String type) {
        if(member!=null && camera!=null && speaker!=null && mic!=null){
            System.out.println(member+"가"+camera+"와"+speaker+"와"+mic+"를 이용해 " +type+" 방송을 시작합니다.");
        }
        else{
            System.out.println("장비 또는 인원을 등록해주세요.");
        }
    }
    void addNewMember(String member){
        this.member.add(member);
    }
    void deleteMember(String member){
        this.member.remove(member);
    }
    void buyCamera(String camera){
        this.camera.add(camera);
    }
    void fixCamera(String camera){
        int find = this.camera.indexOf(camera);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("카메라를 수리했습니다.");
        }
    }
    void throwCamera(String camera){
        this.camera.remove(camera);
    }
    void  buyComputer(String computer){
        this.computer.add(computer);
    }
    void fixComputer(String computer){
        int find = this.computer.indexOf(computer);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("컴퓨터를 수리했습니다.");
        }
    }
    void throwComputer(String computer){
        this.computer.remove(computer);
    }
    void buySpeaker(String speaker){
        this.speaker.add(speaker);
    }
    void fixSpeaker(String speaker){
        int find = this.speaker.indexOf(speaker);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("스피커를 수리했습니다.");
        }
    }
    void throwSpeaker(String spaker){
        this.speaker.remove(spaker);
    }
    void buyMic(String mic){
        this.mic.add(mic);
    }
    void fixMic(String mic){
        int find = this.mic.indexOf(mic);
        if (find == -1){
            System.out.println("보유하지 않은 장비입니다.");
        }
        else{
            System.out.println("마이크를 수리했습니다.");
        }
    }
    void throwMic(String mic){
        this.mic.remove(mic);
    }

    void showInfo(){

        System.out.println("방송부의 인원은 "+member+"가 있으며 장비는 "+camera+speaker+mic+computer + "가 있습니다.");
    }
}