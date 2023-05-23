public abstract class Equipment {
    protected String modelName;
    String manufacturer;
    int price;
    boolean normalState;

    Equipment(String modelName){
        this.modelName=modelName;
        this.normalState = true;
    }
    abstract void setting(String modelName);
    abstract void use(String modelName);

}