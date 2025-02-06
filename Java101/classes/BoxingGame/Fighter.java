public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    public Fighter(String name, int damage, int health, int weight, double dodgeChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodgeChance;
    }

    public int hit(Fighter opponent) {
        System.out.println("----------");
        System.out.println(this.name + " hit " + opponent.name + " for " + this.damage + " damage.");

        if (opponent.dodge()) {
            System.out.println(opponent.name + " dodged the incoming attack..");
            return opponent.health;
        }

        if (opponent.health - this.damage < 0)
            return 0;

        return opponent.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100; // 0.0 to 99.9
        return randomValue <= this.dodgeChance;
    }
}
