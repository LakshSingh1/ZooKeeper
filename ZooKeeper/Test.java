package ZooKeeper;

public class Test {
    

    public static void main(String[] args) {
        Gorilla g= new Gorilla();
        Bat b= new Bat();
        g.throwSomehting();
        g.throwSomehting();
        g.throwSomehting();
        g.eatBanana();
        g.eatBanana();
        g.climbTree();

        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.eatHuman();
        b.eatHuman();
        b.fly();
        System.out.println(g.displayEnergyLevel());
    }
}
