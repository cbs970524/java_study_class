public class Speaker extends Equipment{
//    String modelName;
//    String manufacturer;
//    int price;
    String type;

    Speaker(String modelName){
        super(modelName);
//        this.modelName = modelName;
    }
    Speaker(String modelName, String type){
        super(modelName);
//        this.modelName = modelName;
        this.type = type;
    }

    void setting(String modelName){
        System.out.println(modelName + " 스피커를 설치합니다.");
    }
    void use(String modelName){
        System.out.println(modelName + " 스피커를 통해 확성합니다.");
    }
}
