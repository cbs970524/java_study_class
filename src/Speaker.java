public class Speaker extends Equipment{
    String type;

    Speaker(String modelName){
        super(modelName);
    }
    Speaker(String modelName, String type){
        super(modelName);
        this.type = type;
    }

    @Override
    void setting(String modelName){
        System.out.println(modelName + " 스피커를 설치합니다.");
    }
    @Override
    void use(String modelName){
        System.out.println(modelName + " 스피커를 통해 확성합니다.");
    }
    @Override
    public String toString(){
        return "Speaker";
    }
}
