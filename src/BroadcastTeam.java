import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

public class BroadcastTeam extends Department{
    List<List<Equipment>> equipments;

    BroadcastTeam(){
        this.member = new ArrayList<Person>();
        this.equipments = new ArrayList<>();
        for(int i=0;i<4;i++){
            equipments.add(new ArrayList<>());
        }
    }
    BroadcastTeam(ArrayList<Person> member, ArrayList<Camera> camera, ArrayList<Computer> computer, ArrayList<Mic> mic, ArrayList<Speaker> speaker){
        this();
        this.member = member;
        for(int i=0;i<4;i++){
            this.equipments.add(new ArrayList<>());
        }
        this.equipments.get(0).addAll(camera);
        this.equipments.get(1).addAll(computer);
        this.equipments.get(2).addAll(mic);
        this.equipments.get(3).addAll(speaker);
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
        for(int i=0;i<this.equipments.size();i++){
            if(this.equipments.get(i).size()==0){
                System.out.println("장비를 등록해주세요.");
                return;
            }
            else{
                for(int j=0;j<equipments.get(i).size();j++){
                    equipments.get(i).get(j).setting(equipments.get(i).get(j).modelName);
                    equipments.get(i).get(j).use(equipments.get(i).get(j).modelName);
                }
            }
        }

    }
    @Override
    void working(){
        broadcasting();
    }

    void buyEquipment(List<Equipment> equipments){
        for(int i=0;i<equipments.size();i++){
            if(equipments.get(i) instanceof Camera){
                this.equipments.get(0).add(equipments.get(i));
            }
            else if(equipments.get(i) instanceof Computer){
                this.equipments.get(1).add(equipments.get(i));
            }
            else if(equipments.get(i) instanceof Mic){
                this.equipments.get(2).add(equipments.get(i));
            }
            else if(equipments.get(i) instanceof Speaker){
                this.equipments.get(3).add(equipments.get(i));
            }
            else {
                this.equipments.add((List<Equipment>) equipments.get(i));
            }
        }
    }
    void fixEquipment(Equipment equipment) {
        if (this.equipments.contains(equipment)) {
            System.out.println(equipment + "를 수리했습니다.");
        } else {
            System.out.println("보유하지 않은 장비입니다.");
        }
    }
    void throwEquipment(Equipment equipment){
        if(this.equipments.contains(equipment)){
            this.equipments.remove(equipment);
        }
        else{
            System.out.println("보유하지 않은 장비입니다.");
        }
    }

    @Override
    public String toString(){
        return "방송부의 인원은 "+member.toString()+"가 있으며 장비는 "+this.equipments.toString()+"이 있습니다.";
    }
}