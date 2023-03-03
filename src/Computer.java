public class Computer extends Equipment{
//    String computerName;
    String cpu;
    String gpu;
    String ram;
//    int price;

    Computer(String modelName){
        super(modelName);
        //this.modelName = modelName;
    }
    void use(String modelName){
        System.out.println(modelName + " 컴퓨터를 사용합니다.");
    }
    void setting(String modelName){
        System.out.println(modelName + " 컴퓨터를 설치합니다.");
    }
    void streaming(String modelName){
        System.out.println(modelName + " 컴퓨터로 방송을 송출합니다.");
    }
}
