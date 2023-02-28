public class Person {
    String name;
    int age;
    char gender;
    String team;

    Person(String name){
        this.name = name;
    }
    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    Person(String name, int age, char gender, String team){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.team = team;
    }

}