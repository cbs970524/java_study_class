public class Camera extends Equipment{
//    String modelName;
//    String manufacturer;
//    int price;
    Camera(String modelName){
        super(modelName);
//        this.modelName = modelName;
    }
    void use(String modelName){
        System.out.println(modelName + " 카메라를 사용합니다.");
    }
    void setting(String modelName){
        System.out.println(modelName + " 카메라를 설치합니다.");
    }
}
