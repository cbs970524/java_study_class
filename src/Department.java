import java.util.List;

public abstract class Department {
    protected Person leader;
    protected List<Person> member;
    protected int money=1000000;

    abstract void addNewMember(Person member);
    abstract void deleteMember(Person member);
    abstract void useMoney(int money);
    abstract void addMoney(int money);
    void setLeader(Person member){
        this.leader = member;
    }

    abstract void working();
}