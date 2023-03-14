import java.util.List;

public class Department {
    protected Person leader;
    protected List<Person> member;
    protected int money=1000000;

    void addNewMember(Person member){
        this.member.add(member);
    }
    void deleteMember(Person member){
        this.member.remove(member);
    }
    void useMoney(int money){
        this.money -= money;
    }
    void addMoney(int money){
        this.money += money;
    }
    void newLeader(Person member){
        if(!this.member.contains(member)){
            System.out.println("해당 부서의 멤버가 아닙니다.");
        }
        else{
            this.leader = this.member.get(this.member.indexOf(member));
        }
    }

    void working(){
        System.out.println(this.leader.toString()+"의 주도 하에 "+this.member.toString()+"이(가) 활동합니다.");
    }
}