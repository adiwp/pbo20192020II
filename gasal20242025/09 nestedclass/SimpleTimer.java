import java.util.Timer;
import java.util.TimerTask;

public class SimpleTimer {
    public static void main(String[] args) {
        System.out.println("Timer dimulai...");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 1;

            @Override
            public void run() {
                if (counter <= 5) {
                    System.out.println("Detik ke-" + counter);
                    counter++;
                } else {
                    System.out.println("Timer selesai.");
                    timer.cancel();
                }
            }
        };

        // Menjadwalkan tugas setiap 1 detik (1000 ms)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}