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
        this();
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
        for(int i=0;i<this.cameraList.size();i++){
            this.cameraList.get(i).setting(this.cameraList.get(i).modelName);
            this.cameraList.get(i).use(this.cameraList.get(i).modelName);
        }
        for(int i=0;i<this.computerList.size();i++){
            this.computerList.get(i).setting(this.computerList.get(i).modelName);
            this.computerList.get(i).use(this.computerList.get(i).modelName);
        }
        for(int i=0;i<this.micList.size();i++){
            this.micList.get(i).setting(this.micList.get(i).modelName);
            this.micList.get(i).use(this.micList.get(i).modelName);
        }
        for(int i=0;i<this.speakerList.size();i++) {
            this.speakerList.get(i).setting(this.speakerList.get(i).modelName);
            this.speakerList.get(i).use(this.speakerList.get(i).modelName);
        }
    }
    @Override
    void working(){
        broadcasting();
    }

    void buyEquipment(List<Equipment> equipmentList){
        for(int i=0;i<equipmentList.size();i++){
            if(equipmentList.get(i) instanceof Camera){
                this.cameraList.add((Camera) equipmentList.get(i));
            }
            else if(equipmentList.get(i) instanceof Computer){
                this.computerList.add((Computer) equipmentList.get(i));
            }
            else if(equipmentList.get(i) instanceof Mic){
                this.micList.add((Mic) equipmentList.get(i));
            }
            else if(equipmentList.get(i) instanceof Speaker){
                this.speakerList.add((Speaker) equipmentList.get(i));
            }
            else{
                this.otherList.add(equipmentList.get(i));
            }
        }
    }
    void fixEquipment(Equipment equipment) {
        if(equipment instanceof Camera){
            if(this.cameraList.contains(equipment)){
                System.out.println(equipment + "를 수리했습니다");
            }
            else{
                System.out.println("보유하지 않은 장비입니다");
            }
        }
        else if(equipment instanceof Computer){
            if(this.computerList.contains(equipment)){
                System.out.println(equipment + "를 수리했습니다");
            }
            else{
                System.out.println("보유하지 않은 장비입니다");
            }
        }
        else if(equipment instanceof Mic){
            if(this.micList.contains(equipment)){
                System.out.println(equipment + "를 수리했습니다");
            }
            else{
                System.out.println("보유하지 않은 장비입니다");
            }
        }
        else if(equipment instanceof Speaker){
            if(this.speakerList.contains(equipment)){
                System.out.println(equipment + "를 수리했습니다");
            }
            else{
                System.out.println("보유하지 않은 장비입니다");
            }
        }
        else{
            if(this.otherList.contains(equipment)){
                System.out.println(equipment + "를 수리했습니다");
            }
            else{
                System.out.println("보유하지 않은 장비입니다");
            }
        }
    }
    void throwEquipment(Equipment equipment){
        if(equipment instanceof Camera){
            if(this.cameraList.contains(equipment)){
                this.cameraList.remove(equipment);
                System.out.println(equipment + "를 처분했습니다.");
            }
            else {
                System.out.println("보유하지 않은 장비입니다.");
            }
        }
        else if(equipment instanceof Computer){
            if(this.computerList.contains(equipment)){
                this.computerList.remove(equipment);
                System.out.println(equipment + "를 처분했습니다.");
            }
            else {
                System.out.println("보유하지 않은 장비입니다.");
            }
        }
        else if(equipment instanceof Mic){
            if(this.micList.contains(equipment)){
                this.micList.remove(equipment);
                System.out.println(equipment + "를 처분했습니다.");
            }
            else {
                System.out.println("보유하지 않은 장비입니다.");
            }
        }
        else if(equipment instanceof Speaker){
            if(this.speakerList.contains(equipment)){
                this.speakerList.remove(equipment);
                System.out.println(equipment + "를 처분했습니다.");
            }
            else {
                System.out.println("보유하지 않은 장비입니다.");
            }
        }
        else {
            if(this.otherList.contains(equipment)){
                this.otherList.remove(equipment);
                System.out.println(equipment + "를 처분했습니다.");
            }
            else {
                System.out.println("보유하지 않은 장비입니다.");
            }
        }
    }

    @Override
    public String toString(){
        return "방송부의 인원은 "+member.toString()+"가 있으며 장비는 "+this.cameraList.toString()+this.computerList.toString()+this.micList.toString()+this.speakerList.toString()+"이 있습니다.";
    }
}