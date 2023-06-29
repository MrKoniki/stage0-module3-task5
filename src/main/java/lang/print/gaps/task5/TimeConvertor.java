package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        double seconds = 60.0;
        seconds *= minutes;
        System.out.println(seconds);
    }
}
