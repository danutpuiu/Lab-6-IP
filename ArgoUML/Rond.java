package ArgoUML;

public class Rond implements Intersectie {
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