package ZooKeeper;

public class Bat extends Mammal {
    public void fly(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -=50); ;
        System.out.println("Too fast");
        }
    public void eatHuman(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy +=20); ;
        System.out.println("Good Blood");
    }
    public void attackTown(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -=100); ;
        System.out.println("Humans Shall Feel The Wratih");
    }
}
