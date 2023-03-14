public class Equipment {
    protected String modelName;
    String manufacturer;
    int price;

    Equipment(String modelName){
        this.modelName=modelName;
    }
    void setting(String modelName){
        System.out.println("장비를 세팅합니다.");
    }
    void use(String modelName){
        System.out.println("장비를 사용합니다.");
    }

}