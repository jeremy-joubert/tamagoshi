package tamagoshi.tamagoshis;

public class Lunatique extends Tamagoshi {

    public Lunatique(String name) {
        super(name);
    }

    @Override
    public boolean consommeEnergie() {
        if(generateur.nextBoolean())
            energy--;
        return super.consommeEnergie();
    }

    @Override
    public boolean consommeFun() {
        if(generateur.nextBoolean())
            fun--;
        return super.consommeFun();
    }

}
