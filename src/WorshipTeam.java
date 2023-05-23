import java.util.ArrayList;
import java.util.List;

public class WorshipTeam extends Department{
    WorshipTeam(){
        this.member = new ArrayList<Person>();
    }
    WorshipTeam(List<Person> persons){
        this();
        for(int i=0;i< persons.size();i++){
            addNewMember(persons.get(i));
        }
    }

    @Override
    void addNewMember(Person member) {
        this.member.add(member);
        System.out.println("찬양단 인원을 추가합니다.");
    }
    @Override
    void deleteMember(Person member) {
        this.member.remove(member);
        System.out.println(member + "를 찬양단 멤버에서 제거합니다.");
    }
    @Override
    void useMoney(int money) {
        this.money-=money;
        System.out.println("찬양단에서" + money + "원을 지출합니다.");
    }
    @Override
    void addMoney(int money) {
        this.money+=money;
        System.out.println("찬양단 재정에 "+money+ "원 적립되었습니다.");
    }

    void leadSing(){
        if(this.leader==null){
            System.out.println("리더가 없습니다.");
        }
        else{
            System.out.println(leader.toString()+"이(가) 찬양 인도를 합니다.");
        }
    }
    void sing(){
        System.out.println(this.member.toString()+"가 찬양합니다.");
    }

    @Override
    void working(){
        leadSing();
        sing();
    }

    void eatFood(List<Person> persons){
        useMoney(5000*persons.size());
    }
}
