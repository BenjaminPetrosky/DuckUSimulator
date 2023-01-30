public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall(){
        quackBehavior = new Quack();
    }

    public void blow(){
        quackBehavior.quack();
    }


}
