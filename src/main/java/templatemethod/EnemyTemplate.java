package templatemethod;

public abstract class EnemyTemplate {

    public abstract void setSkills();
    public abstract void attack();
    public abstract void protect();
    public abstract void result();

    public final void template() {
        setSkills();
        attack();
        protect();
        result();
    }
}
