import java.util.List;

public class Department {
    List<Person> member;
    int money=1000000;

    void addNewMember(Person member){
        this.member.add(member);
    }
    void deleteMember(Person member){
        this.member.remove(member);
    }
    void useMoney(int money){
        this.money -= money;
    }
    void getMoney(int money){
        this.money += money;
    }

    void working(Person person, Person[] persons){
        System.out.println(person+"의 주도 하에 "+persons+"이(가) 활동합니다.");
    }
    void marketing(){
        System.out.println("부서를 홍보합니다.");
    }
}