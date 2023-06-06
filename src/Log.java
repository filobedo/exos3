import java.util.Calendar;

public final class Log {

    public static void generateLog(String log) {
        System.out.println("[" + Calendar.getInstance().getTime() + log + "]");
    }
}
