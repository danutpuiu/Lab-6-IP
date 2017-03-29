package ArgoUML;

import java.util.Vector;

public class Drum {

  public Vector<Vehicul> vehicule;

  public Intersectie myIntersectie;


  public Drum(Intersectie intersectie) {
      this.myIntersectie = intersectie;
      this.vehicule = new Vector<>();
  }


  public int getVehicleCount() { return this.vehicule.size(); }

  public int getPublicTransportCount() {
    int count = 0;
    for (Vehicul v : this.vehicule) {
        if (v.type.startsWith("Public"))
            count++;
    }
    return count;
  }

  public int getPersonalVehCount() {
      int count = 0;
      for (Vehicul v : this.vehicule) {
          if (v.type.startsWith("Personal"))
              count++;
      }
      return count;
  }

  public int getCargoTransportCount() {
      int count = 0;
      for (Vehicul v : this.vehicule) {
          if (v.type.startsWith("Marfa"))
              count++;
      }
      return count;
  }

}