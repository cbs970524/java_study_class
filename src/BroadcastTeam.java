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
    void broadcasting(String type) {
        System.out.println(type + "방송을 시작합니다");
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
            this.camera.remove(find);
        }
    }
    void throwCamera(String camera){
        this.camera.remove(camera);
    }
    void showInfo(){

    }
}