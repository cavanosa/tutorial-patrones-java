package facade;

public class FacadeSmithy {

    public void work(String name, boolean make) {
        if (make) {
            Forge forge = new Forge();
            forge.work(name);
            if (Recipes.getRecipes(name, make)){
                if(!forge.search(name))
                    return;
                forge.remove(name);
                forge.working(name);
                System.out.println("The " + name + " have been created!!");
            } else {
                System.out.println("It has not been possible to " +  forge.ACTION + " the " + name);
            }
        } else {
            WorkBench workBench = new WorkBench();
            workBench.work(name);
            if (Recipes.getRecipes(name, make)){
                if(!workBench.search(name))
                    return;
                workBench.remove(name);
                workBench.working(name);
                System.out.println("The " + name + " have been improved!!");
            } else {
                System.out.println("It has not been possible to " +  workBench.ACTION + " the " + name);
            }
        }
    }
}
