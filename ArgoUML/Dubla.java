package ArgoUML;

public class Dubla extends Intersectie {

    public Dubla() {super();}

    @Override
    public void updateSemafoare(Semafor semafor) {
        int index = this.semafoare.indexOf(semafor);
        for (Semafor s : this.semafoare) {
            if (this.semafoare.indexOf(semafor) % 2 == index % 2) {
                s.color = "Green";
                s.time = getStreetPriority(s.drum);
            }
            else
                s.color = "Red";
        }
    }
}