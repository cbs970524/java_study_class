public class Mic extends Equipment{
//    String modelName;
//    String manufacturer;
//    int price;
    String type;

    Mic(String modelName){
        super(modelName);
//        this.modelName = modelName;
    }
    Mic(String modelName, String type){
        super(modelName);
        this.type = type;
    }

    void use(String modelName){
        System.out.println(modelName + " 마이크를 사용합니다.");
    }
    void setting(String modelName){
        System.out.println(modelName + " 마이크를 설치합니다.");
    }
    void returnMic(String modelName){
        System.out.println(modelName + " 마이크를 회수합니다.");
    }
}