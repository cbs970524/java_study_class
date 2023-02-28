public class Camera {
    String modelName;
    String manufacturer;
    int price;
    Camera(String modelName){
        this.modelName = modelName;
    }
    void useCam(String modelName){
        System.out.println(modelName + " 카메라를 사용합니다.");
    }
}
