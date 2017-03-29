package ArgoUML;

import java.util.Vector;

public interface Intersectie {

  public Vector<Semafor> semafoare = new Vector<>();

  public Vector<Drum> drumuri = new Vector<>();



  public int getStreetPriority();

  public void updateSemafoare(Semafor semafor);

  public Semafor determineNext();

}