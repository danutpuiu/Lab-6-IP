package ArgoUML;

public class Dubla extends Intersectie {

    public Dubla() {super();}

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