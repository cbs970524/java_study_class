public class Computer {
    String computerName;
    String cpu;
    String gpu;
    String ram;
    int price;

    Computer(String computerName){
        this.computerName = computerName;
    }

    void streaming(String modelName){
        System.out.println(modelName + " 컴퓨터로 방송을 송출합니다.");
    }
}
