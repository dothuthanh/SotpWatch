import java.time.LocalTime;
import java.util.Locale;

public class StopWatch {
    private double startTime;
    private double endTime;
    long milireset,milistop;
    public double getStartTime(){
        return startTime;
    }
    public double getEndTime(){
        return endTime;
    }
    public StopWatch(){
        LocalTime startTime;
    }
    void start(){
        LocalTime reset = LocalTime.now();
        System.out.println("hien tai:" + reset);
        this.milireset = System.currentTimeMillis();
    }
    void stop(){
        LocalTime stop = LocalTime.now();
        System.out.println("kiem tra:" + stop);
        this.milistop=System.currentTimeMillis();
    }
    void getElapsedTime(){
        long timePast = System.currentTimeMillis();
        System.out.println("thoi gian troi qua:" + timePast +"s");
    }
}
class TestStiopWatch{
    public static void main(String[] args) {
        StopWatch kt = new StopWatch();
        kt.getElapsedTime();
    }
}