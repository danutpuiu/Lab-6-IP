package ArgoUML;

import java.util.Vector;

public abstract class Intersectie implements IntersectieInterface {

  public Vector<Semafor> semafoare = new Vector<>();

  public Vector<Drum> drumuri = new Vector<>();



  public Intersectie(){}

  public int getStreetPriority(Drum drum) {
      int priority = 0;
      for (Vehicul v : drum.vehicule) {
          if (v.type.startsWith("Personal"))
              priority += 2;
          if (v.type.startsWith("Marfa"))
              priority += 1;
          if (v.type.startsWith("Public"))
              priority += 4;
      }
      return priority;
  }
  public Drum getMaxPriorityStreet() {
     Drum bestDrum = drumuri.elementAt(0);
      for (Drum d : this.drumuri) {
          if (getStreetPriority(d) > getStreetPriority(bestDrum))
              bestDrum = d;
      }
      return bestDrum;
  }
  public void updateSemafoare(Semafor semafor) {
        for (Semafor s : semafoare) {
            if (s == semafor)
                s.color = "Green";
            else
                s.color = "Red";
        }
  }
  public Drum determineNext() {
      return getMaxPriorityStreet();
  }

}