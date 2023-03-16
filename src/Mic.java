public class Mic extends Equipment{
    String type;

    Mic(String modelName){
        super(modelName);
    }
    Mic(String modelName, String type){
        super(modelName);
        this.type = type;
    }

    @Override
    void use(String modelName){
        System.out.println(modelName + " 마이크를 사용합니다.");
    }
    @Override
    void setting(String modelName){
        System.out.println(modelName + " 마이크를 설치합니다.");
    }
    void returnMic(String modelName){
        System.out.println(modelName + " 마이크를 회수합니다.");
    }
    @Override
    public String toString(){
        return "model name is " + this.modelName + "type is " + this.type;
    }
}