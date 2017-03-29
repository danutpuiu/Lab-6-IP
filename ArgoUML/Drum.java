package ArgoUML;

import b.c.D;

import java.util.Queue;
import java.util.Vector;

public class Drum {

  public Queue<Vehicul> vehicule;

  public Intersectie myIntersectie;


  public Drum(Intersectie intersectie) {
      this.myIntersectie = intersectie;
  }


  public int getVehicleCount() {
  return 0;
  }

  public int getPublicTransportCount() {
  return 0;
  }

  public int getPersonalVehCount() {
  return 0;
  }

  public int getCargoTransportCount() {
  return 0;
  }

}