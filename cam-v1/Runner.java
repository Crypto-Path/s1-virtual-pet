import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
  public static void main(String[] args) {
    new Runner();
  }

  public Runner() {
    // Main
    VirtualPet p = new VirtualPet();
    // Tasks
    Timer timer = new Timer();
    int period = 200;

    timer.scheduleAtFixedRate(new TimerTask() {
      public void run() {
        if (p.face.checkFeedButton()) {
          p.feed();
        }
        if (p.face.checkExerciseButton()) {
          p.exercise();
        }
      }
    }, period, period);
  }

  public String getResponse(String prompt) {
    String res = (String)JOptionPane.showInputDialog(
      new JFrame(),
      prompt,
      "Response",
      JOptionPane.PLAIN_MESSAGE
    );
    return res;
  }

  public void wait(int millis) {
    try {
      Thread.sleep(millis);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  
}
