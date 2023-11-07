package strategy;

public class Enemy {

    private String name;
    private AttackStrategy attackStrategy;

    public Enemy(String name) {
        this.name = name;
        attackStrategy = new UnarmedAttack();
    }

    public void attack(Player player){
        attackStrategy.attack(player);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
