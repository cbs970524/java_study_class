public class Person {
    String name;
    int age;

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return this.name;
    }
}