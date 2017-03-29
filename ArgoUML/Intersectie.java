package ArgoUML;

import java.util.Vector;

public abstract class Intersectie implements IntersectieInterface {

  public Vector<Semafor> semafoare = new Vector<>();

  public Vector<Drum> drumuri = new Vector<>();



  public Intersectie(){}

  public int getStreetPriority() {
      return 0;
  }

  public void updateSemafoare(Semafor semafor) {

  }

  public Semafor determineNext() {
      return semafoare.elementAt(0);
  }

}