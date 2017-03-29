package ArgoUML;

public class Rond extends Intersectie {

    public Rond() {super();}

    @Override
    public int getStreetPriority() {
        return 0;
    }

    @Override
    public void updateSemafoare(Semafor semafor) {

    }

    @Override
    public Semafor determineNext() {
        return null;
    }
}