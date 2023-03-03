public class Equipment {
    String modelName;
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

    void buy(Equipment[] equipments){
        //buy, fix, throw 이걸 여기다 구현할 수 있을거 같은데....
    }

}