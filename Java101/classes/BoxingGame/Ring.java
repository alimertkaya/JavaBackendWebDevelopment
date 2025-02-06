import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void startFight() {
        if (checkWeight()) {
            Fighter first = decideFirstFighter();
            Fighter second = (first == f1) ? f2 : f1;

            System.out.println(first.name + " starts the fight!");

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("====== New Round ======");
                second.health = first.hit(second);

                if (isWin())
                    break;
                first.health = second.hit(first);
                if (isWin())
                    break;
                printScore();
            }
        } else {
            System.out.println("The fighters' weights do not match.");
        }
    }

    private Fighter decideFirstFighter() {
        Random random = new Random();
        return (random.nextBoolean()) ? f1 : f2;
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Winner: " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("----------");
        System.out.println(f1.name + " Remaining Health: " + f1.health);
        System.out.println(f2.name + " Remaining Health: " + f2.health);
    }
}