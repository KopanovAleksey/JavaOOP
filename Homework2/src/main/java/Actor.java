public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public String getName(){
        return name;
    };
    public Actor(String name){
        this.name = name;
    }
}
