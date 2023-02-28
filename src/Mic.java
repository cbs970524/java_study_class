public class Mic {
    String modelName;
    String manufacturer;
    int price;
    String type;

    Mic(String modelName){
        this.modelName = modelName;
    }
    Mic(String modelName, String type){
        this.modelName = modelName;
        this.type = type;
    }

    void useMic(String modelName){
        System.out.println(modelName + " 마이크를 사용합니다.");
    }
    void returnMic(String modelName){
        System.out.println(modelName + " 마이크를 회수합니다.");
    }
}