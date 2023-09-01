package ZooKeeper;

public class Gorilla extends Mammal {
    public void throwSomehting(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -=5); ;
        System.out.println("Big Throw");
        }
    public void eatBanana(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy +=10); ;
        System.out.println("Tasty Banana");
    }
    public void climbTree(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -=10); ;
        System.out.println("Gorilla Tired");
    }
}
