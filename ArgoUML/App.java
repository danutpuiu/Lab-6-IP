package ArgoUML;

import java.util.Vector;

public class App {

  public Vector<Intersectie> intersectii;

  public App() {
    this.intersectii = new Vector<>();
  }

  void passTime() {
      for (Intersectie i : this.intersectii) {
          for (Semafor s : i.semafoare) {
              s.time--;
              if (s.time <= 0)
                  s.color = "Red";
          }
      }
  }
}