public class Time {

    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds );
    }

    @Override
    public String toString() {
        int trueSeconds = seconds % 86400;
        int hours = trueSeconds / 3600;
        int minuts =  (trueSeconds % 3600) / 60;
        int second = trueSeconds % 60;

        String h = (hours < 10) ? "0" + hours : "" + hours;
        String m = (minuts < 10) ? "0" + minuts : "" + minuts;
        String s = (second < 10) ? "0" + second : "" + second;

        return h + ":" + m + ":" + s;
    }
}