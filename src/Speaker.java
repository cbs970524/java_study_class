public class Speaker {
    String modelName;
    String manufacturer;
    int price;
    String type;

    Speaker(String modelName){
        this.modelName = modelName;
    }
    Speaker(String modelName, String type){
        this.modelName = modelName;
        this.type = type;
    }

    void setSpeaker(String modelName){
        System.out.println(modelName + " 스피커를 설치합니다.");
    }
    void useSpeaker(String modelName){
        System.out.println(modelName + " 스피커를 통해 확성합니다.");
    }
}
