package api;

import ui.Warning;

public class Warner extends Thread{
	
	public static void OnStartUp(int minuteDelay) throws InterruptedException {
		
		if(minuteDelay == 5) {
			sleep(1000*60*minuteDelay);
			Warning warning = new Warning(Integer.toString(minuteDelay));
			warning.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning1 = new Warning(Integer.toString(2*minuteDelay));
			warning1.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning2 = new Warning(Integer.toString(3*minuteDelay));
			warning2.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning3 = new Warning(Integer.toString(4*minuteDelay));
			warning3.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning4 = new Warning(Integer.toString(5*minuteDelay));
			warning4.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning5 = new Warning(Integer.toString(6*minuteDelay));
			warning5.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning6 = new Warning(Integer.toString(7*minuteDelay));
			warning6.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning7 = new Warning(Integer.toString(8*minuteDelay));
			warning7.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning8 = new Warning(Integer.toString(9*minuteDelay));
			warning8.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning9 = new Warning(Integer.toString(10*minuteDelay));
			warning9.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning10 = new Warning(Integer.toString(11*minuteDelay));
			warning10.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning11 = new Warning(Integer.toString(12*minuteDelay));
			warning11.setVisible(true);
		}
		
		if (minuteDelay == 10) {
			sleep(1000*60*minuteDelay);
			Warning warning = new Warning(Integer.toString(1*minuteDelay));
			warning.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning1 = new Warning(Integer.toString(2*minuteDelay));
			warning1.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning2 = new Warning(Integer.toString(3*minuteDelay));
			warning2.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning3 = new Warning(Integer.toString(4*minuteDelay));
			warning3.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning4 = new Warning(Integer.toString(5*minuteDelay));
			warning4.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning5 = new Warning(Integer.toString(6*minuteDelay));
			warning5.setVisible(true);
		}
		
		if(minuteDelay == 15) {
			sleep(1000*60*minuteDelay);
			Warning warning = new Warning(Integer.toString(1*minuteDelay));
			warning.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning1 = new Warning(Integer.toString(2*minuteDelay));
			warning1.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning2 = new Warning(Integer.toString(3*minuteDelay));
			warning2.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning3 = new Warning(Integer.toString(4*minuteDelay));
			warning3.setVisible(true);
		}
		
		if (minuteDelay == 20) {
			sleep(1000*60*minuteDelay);
			Warning warning = new Warning(Integer.toString(1*minuteDelay));
			warning.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning1 = new Warning(Integer.toString(2*minuteDelay));
			warning1.setVisible(true);
			
			sleep(1000*60*minuteDelay);
			Warning warning2 = new Warning(Integer.toString(3*minuteDelay));
			warning2.setVisible(true);
		}
		
		KillAllProcesses.execKill(1);
			
	}
	
}
