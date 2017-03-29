package ArgoUML;

import java.util.Vector;

public class Semafor {

  public int time;
  public String color;

  public Drum drum;
  public Intersectie  myIntersectie;



  public Semafor(Drum drum, Intersectie intersectie) {
      this.drum = drum;
      this.myIntersectie = intersectie;
  }

  public int getTime() {
  return 0;
  }

  public String getColor() {
  return null;
  }

  public void setColor() {
  }

  public void setTime() {
  }

}