public class Person {
    String name;
    int age;
//    char gender;
    enum gender{} //enum 복잡한데..?

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        //gender = gender;
    }
    @Override
    public String toString(){
        return this.name;
    }
}