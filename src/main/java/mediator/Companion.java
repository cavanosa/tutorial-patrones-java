package mediator;

public class Companion implements Combat {
    private String name;
    private Mediator mediator;

    public Companion(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.add(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public void send() {
        System.out.println("Sending message from " + name);
        mediator.send(this);
    }

    @Override
    public void receive(Combat combat) {
        System.out.println("Message received from " + ((Enemy) combat).getName() + ": " + name + " attack mode activated!!");
    }

    @Override
    public String toString() {
        return "name=" + name;
    }
}
