public class Computer extends Equipment{
    String cpu;
    String gpu;
    String ram;

    Computer(String modelName){
        super(modelName);
    }
    @Override
    void use(String modelName){
        System.out.println(modelName + " 컴퓨터를 사용합니다.");
    }
    @Override
    void setting(String modelName){
        System.out.println(modelName + " 컴퓨터를 설치합니다.");
    }
    void streaming(String modelName){
        System.out.println(modelName + " 컴퓨터로 방송을 송출합니다.");
    }

    @Override
    public String toString(){
        return "model name is " + this.modelName;
    }
}
