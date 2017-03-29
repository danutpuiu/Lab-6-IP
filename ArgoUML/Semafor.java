package ArgoUML;

public class Semafor {

  public int time;
  public String color;

  public Drum drum;
  public Intersectie  myIntersectie;



  public Semafor(Drum drum, Intersectie intersectie) {
      this.drum = drum;
      this.myIntersectie = intersectie;
      this.color = "Red";
  }

  public int getTime() {
  return this.time;
  }

  public String getColor() {
  return this.color;
  }

  public void setColor(String color) { this.color = color; }

  public void setTime(int time) { this.time = time; }

}