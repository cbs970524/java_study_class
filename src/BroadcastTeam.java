import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

public class BroadcastTeam extends Department{
    //List<List<Equipment>> equipments;
    List<Equipment> equipmentList;

    BroadcastTeam(){
        this.member = new ArrayList<Person>();
        this.equipmentList = new ArrayList<>();

    }
    BroadcastTeam(ArrayList<Person> member, ArrayList<Camera> camera, ArrayList<Computer> computer, ArrayList<Mic> mic, ArrayList<Speaker> speaker){
        this();
        this.member = member;
        for(int i=0;i<camera.size();i++){
            equipmentList.add(camera.get(i));
        }
        for(int i=0;i<computer.size();i++){
            equipmentList.add(computer.get(i));
        }
        for(int i=0;i<mic.size();i++){
            equipmentList.add(mic.get(i));
        }
        for(int i=0;i<speaker.size();i++){
            equipmentList.add(speaker.get(i));
        }
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
        for(int i=0;i<this.equipmentList.size();i++){
            if(this.equipmentList.get(i) instanceof Camera){
                this.equipmentList.get(i).setting(((Camera) this.equipmentList.get(i)).modelName);
                this.equipmentList.get(i).use(((Camera) this.equipmentList.get(i)).modelName);
            }
            else if(this.equipmentList.get(i) instanceof Computer){
                this.equipmentList.get(i).setting(((Computer) this.equipmentList.get(i)).modelName);
                this.equipmentList.get(i).use(((Computer) this.equipmentList.get(i)).modelName);
                ((Computer) this.equipmentList.get(i)).streaming(((Computer) this.equipmentList.get(i)).modelName);
            }
            else if(this.equipmentList.get(i) instanceof Mic){
                this.equipmentList.get(i).setting(((Mic) this.equipmentList.get(i)).modelName);
                this.equipmentList.get(i).use(((Mic) this.equipmentList.get(i)).modelName);
                ((Mic) this.equipmentList.get(i)).returnMic(((Mic) this.equipmentList.get(i)).modelName);
            }
            else if(this.equipmentList.get(i) instanceof Speaker){
                this.equipmentList.get(i).setting(((Speaker) this.equipmentList.get(i)).modelName);
                this.equipmentList.get(i).use(((Speaker) this.equipmentList.get(i)).modelName);
            }
            else {
                this.equipmentList.get(i).setting((this.equipmentList.get(i)).modelName);
                this.equipmentList.get(i).use((this.equipmentList.get(i)).modelName);
            }
        }
        //장비가 하나 이상은 있어야할텐데 그건 어떻게 체크하지...

    }
    @Override
    void working(){
        broadcasting();
    }

    void buyEquipment(List<Equipment> equipmentList){
        for(int i=0;i<equipmentList.size();i++){
            if(equipmentList.get(i) instanceof Camera){
                this.equipmentList.add((Camera) equipmentList.get(i));
            }
            else if(equipmentList.get(i) instanceof Computer){
                this.equipmentList.add((Computer) equipmentList.get(i));
            }
            else if(equipmentList.get(i) instanceof Mic){
                this.equipmentList.add((Mic) equipmentList.get(i));
            }
            else if(equipmentList.get(i) instanceof Speaker){
                this.equipmentList.add((Speaker) equipmentList.get(i));
            }
            else{
                this.equipmentList.add(equipmentList.get(i));
            }
        }
    }
    void fixEquipment(Equipment equipment) {
        if (this.equipmentList.contains(equipment)) {
            System.out.println(equipment + "를 수리했습니다.");
        } else {
            System.out.println("보유하지 않은 장비입니다.");
        }
    }
    void throwEquipment(Equipment equipment){
        if(this.equipmentList.contains(equipment)){
            this.equipmentList.remove(equipment);
        }
        else{
            System.out.println("보유하지 않은 장비입니다.");
        }
    }

    @Override
    public String toString(){
        return "방송부의 인원은 "+member.toString()+"가 있으며 장비는 "+this.equipmentList.toString()+"이 있습니다.";
    }
}