public class Camera extends Equipment{
    Camera(String modelName){
        super(modelName);
    }
    @Override
    void use(String modelName){
        System.out.println(modelName + " 카메라를 사용합니다.");
    }
    @Override
    void setting(String modelName){
        System.out.println(modelName + " 카메라를 설치합니다.");
    }
    @Override
    public String toString(){
        return "model name is " + this.modelName;
    }
}
