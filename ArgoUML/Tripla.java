package ArgoUML;

public class Tripla extends Intersectie {

    public Tripla() {super();}

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