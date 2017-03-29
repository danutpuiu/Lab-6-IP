package ArgoUML;

import java.util.Vector;

public abstract class Vehicul {

  String type;
  Drum   myDrum;

  public Vehicul(Drum drum, String type) {
    this.myDrum = drum;
    this.type = type;
  }

}