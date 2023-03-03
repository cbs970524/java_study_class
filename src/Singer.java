import java.util.List;

public class Singer extends Department{
    List<Person> member;

    Singer(Person[] persons){
        for(int i=0;i< persons.length;i++){
            addNewMember(persons[i]);
        }
    }

    void leadSing(Person member){
        if(this.member.indexOf(member)!=-1){
            System.out.println(member+"이(가) 찬양 인도를 합니다.");
        }
        else{
            System.out.println(member+"는 찬양단 구성원이 아닙니다.");
        }
    }
    void sing(Person[] persons){
        System.out.println(persons+"가 찬양합니다.");
    }

    void working(Person leader, Person[] singer){
        leadSing(leader);
        sing(singer);
    }

    void eatFood(Person[] persons){
        useMoney(5000*persons.length);
    }
}
