public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0].substring(0, 2));
        int minutes = Integer.parseInt(args[0].substring(3, 5));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes % 60;
        if (newHours < 10) {
            System.out.print("0" + newHours + ":");
        }
        else {
            System.out.print("" + newHours + ":");
        }
        if (newMinutes < 10) {
            System.out.println("0" + newMinutes);
        }
        else {
            System.out.println("" + newMinutes);
        }
    }
}
