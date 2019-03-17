package api;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class KillAllProcesses implements ActionListener{
	
  @SuppressWarnings("unused")
private static final long serialVersionUID = 1L;

  public static void execKill(long minutes) throws InterruptedException {
    Thread.sleep(minutes * 60L * 1000L);
    try {
      Runtime.getRuntime().exec("TASKKILL /F /IM " + "steam" + ".exe");
      Runtime.getRuntime().exec("TASKKILL /F /IM " + "discord" + ".exe");
      Runtime.getRuntime().exec("TASKKILL /F /IM " + "fortnite" + ".exe");
      Runtime.getRuntime().exec("TASKKILL /F /IM " + "pubg" + ".exe");
      System.exit(0);
    }
    catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }

  public void actionPerformed(ActionEvent e){
    long minuteNum = 1;
    if (e.getActionCommand().equals("Start"))
      try {
        execKill(minuteNum);
      } catch (InterruptedException e1) {
        e1.printStackTrace();
      }
  }
}