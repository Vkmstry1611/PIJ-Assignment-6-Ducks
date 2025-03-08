public class DecoyDuck extends Duck{

    public DecoyDuck(){
        quackBehaviour=new MuteQuack();
        swimBehaviour= new Drown();
        flyBehaviour= new NotFly();

    }
    @Override
    public void display() {
        System.out.println("I am Decoy Duck !");
    }
}
