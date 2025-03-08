// Name : Vidish Ketankumar Mistry
// PRN : 23070126146
// Batch : B-3


public class Main {
    public static void main(String[] args) {

        // Create instance of MallardDuck  and display properties
        MallardDuck md = new MallardDuck();


        System.out.println("-----------------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("-----------------------------");
        // Create instance of RubberDuck and display properties
        RubberDuck rd = new RubberDuck();
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("-----------------------------");
        //Create Instance of RedHeadDuck and display properties
        RedheadDuck rhd = new RedheadDuck();
        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        rhd.performFly();
        System.out.println("-----------------------------");
        // // Create instance of Decoy Duck and display properties

        DecoyDuck dd= new DecoyDuck();
        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
    }
}