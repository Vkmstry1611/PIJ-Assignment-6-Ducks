abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    abstract public void display();
    public void performSwim(){
        swimBehaviour.swim();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }


}


