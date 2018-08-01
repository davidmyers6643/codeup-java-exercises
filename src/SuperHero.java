public class SuperHero extends Person{
    private String alterEgo;

//    only persons with a name could exist.
    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return this.alterEgo;
    }
//    use the original definition of getName => person
    public String getSecretID() {
        return super.getName();
    }
}
