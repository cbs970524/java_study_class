import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

public class BroadcastTeam extends Department{
    ArrayList<Equipment> cameraList;
    ArrayList<Equipment> computerList;
    ArrayList<Equipment> micList;
    ArrayList<Equipment> speakerList;
    ArrayList<Equipment> otherList;

    BroadcastTeam(){
        this.member = new ArrayList<Person>();
        this.cameraList = new ArrayList<>();
        this.computerList = new ArrayList<>();
        this.micList = new ArrayList<>();
        this.speakerList = new ArrayList<>();

    }
    BroadcastTeam(ArrayList<Person> member, ArrayList<Equipment> camera, ArrayList<Equipment> computer, ArrayList<Equipment> mic, ArrayList<Equipment> speaker){
        this.member = member;
        this.cameraList = camera;
        this.computerList = computer;
        this.micList = mic;
        this.speakerList = speaker;
    }
    @Override
    void addNewMember(Person member){
        super.addNewMember(member);
        System.out.println("방송부 인원을 추가합니다.");
    }
    @Override
    void deleteMember(Person member){
        super.deleteMember(member);
        System.out.println(member + "를 방송부 멤버에서 제거합니다.");
    }
    @Override
    void useMoney(int money){
        super.useMoney(money);
        System.out.println("방송부에서" + money + "원을 지출합니다.");
    }
    @Override
    void addMoney(int money){
        super.addMoney(money);
        System.out.println("방송부 재정에 "+money+ "원 적립되었습니다.");
    }

    void broadcasting() {
        if(this.member==null){
            System.out.println("인원을 등록해주세요.");
            return;
        }
        for (Equipment c: cameraList) {
            c.setting(c.modelName);
            c.use(c.modelName);
        }
        for (Equipment c: computerList) {
            c.setting(c.modelName);
            c.use(c.modelName);
            if(c instanceof Computer){
                ((Computer) c).streaming(c.modelName);
            }
        }
        for (Equipment m: micList) {
            m.setting(m.modelName);
            m.use(m.modelName);
        }
        for (Equipment s: speakerList) {
            s.setting(s.modelName);
            s.use(s.modelName);
        }
    }
    @Override
    void working(){
        broadcasting();
    }

    void buyEquipment(List<Equipment> equipmentList){
        for(Equipment e : equipmentList){
            if(e instanceof Camera){
                this.cameraList.add((Camera) e);
            }
            else if(e instanceof Computer){
                this.computerList.add((Computer) e);
            }
            else if(e instanceof Mic){
                this.micList.add((Mic) e);
            }
            else if(e instanceof Speaker){
                this.speakerList.add((Speaker) e);
            }
            else{
                this.otherList.add(e);
            }
        }
    }
    void fixCamera(Camera camera){
        if(this.cameraList.contains(camera)){
            this.cameraList.get(this.cameraList.indexOf(camera)).normalState = true;
            System.out.println(camera + "를 수리했습니다.");
        }
        else {System.out.println("보유하지 않은 장비입니다.");}
    }
    void fixCamera(String camera){
        for(Equipment c : this.cameraList){
            if(c.modelName.equals(camera)){
                c.normalState = true;
                System.out.println(camera + "를 수리했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }
    void fixComputer(Computer computer){
        if(this.computerList.contains(computer)){
            this.computerList.get(this.computerList.indexOf(computer)).normalState = true;
            System.out.println(computer + "를 수리했습니다.");
        }
        else {System.out.println("보유하지 않은 장비입니다.");}
    }
    void fixComputer(String computer){
        for(Equipment c : this.computerList){
            if(c.modelName.equals(computer)){
                c.normalState = true;
                System.out.println(computer + "를 수리했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }
    void fixMic(Mic mic){
        if(this.micList.contains(mic)){
            this.micList.get(this.micList.indexOf(mic)).normalState = true;
            System.out.println(mic + "를 수리했습니다.");
        }
        else {System.out.println("보유하지 않은 장비입니다.");}
    }
    void fixMic(String modelName){
        for(Equipment m:micList) {
            if (m.modelName.equals(modelName)) {
                m.normalState = true;
                System.out.println(modelName + "를 수리했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }
    void fixSpeaker(Speaker speaker){
        if(this.speakerList.contains(speaker)){
            this.speakerList.get(this.speakerList.indexOf(speaker)).normalState = true;
            System.out.println(speaker + "를 수리했습니다.");
        }
        else {System.out.println("보유하지 않은 장비입니다.");}
    }
    void fixSpeaker(String speaker){
        for(Equipment c : this.speakerList){
            if(c.modelName.equals(speaker)){
                c.normalState = true;
                System.out.println(speaker + "를 수리했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }
    void throwCamera(Camera camera) {
        if (this.cameraList.contains(camera)) {
            this.cameraList.remove(camera);
            System.out.println(camera + "를 처분했습니다.");
        } else {
            System.out.println("보유하지 않은 장비입니다.");
        }
    }
    void throwCamera(String modelName){
        for(Equipment c : this.cameraList) {
            if (c.modelName.equals(modelName)) {
                this.cameraList.remove(c);
                System.out.println(modelName + "를 처분했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }

    void throwComputer(Computer computer) {
        if (this.computerList.contains(computer)) {
            this.computerList.remove(computer);
            System.out.println(computer + "를 처분했습니다.");
        } else {
            System.out.println("보유하지 않은 장비입니다.");
        }
    }
    void throwComputer(String modelName){
        for(Equipment c : this.computerList) {
            if (c.modelName.equals(modelName)) {
                this.computerList.remove(c);
                System.out.println(modelName + "를 처분했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }
    void throwMic(Mic mic) {
        if (this.micList.contains(mic)) {
            this.micList.remove(mic);
            System.out.println(mic + "를 처분했습니다.");
        }
        else {
            System.out.println("보유하지 않은 장비입니다.");
        }
    }
    void throwMic(String modelName){
        for(Equipment m : this.micList) {
            if (m.modelName.equals(modelName)) {
                this.micList.remove(m);
                System.out.println(modelName + "를 처분했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }
    void throwSpeaker(Speaker speaker) {
        if (this.speakerList.contains(speaker)) {
            this.speakerList.remove(speaker);
            System.out.println(speaker + "를 처분했습니다.");
        } else {
            System.out.println("보유하지 않은 장비입니다.");
        }
    }
    void throwSpeaker(String modelName){
        for(Equipment s : this.speakerList) {
            if (s.modelName.equals(modelName)) {
                this.speakerList.remove(s);
                System.out.println(modelName + "를 처분했습니다.");
                return;
            }
        }
        System.out.println("보유하지 않은 장비입니다.");
    }
    @Override
    public String toString(){
        return "방송부의 인원은 "+member.toString()+"가 있으며 장비는 "+this.cameraList.toString()+this.computerList.toString()+this.micList.toString()+this.speakerList.toString()+"이 있습니다.";
    }
}