import java.time.LocalDate;

public class Evidencia {

    public static void main(String[] args) {
        String name = "Jozef Mrkvička";
        LocalDate dateOfBirth = LocalDate.of(2001,1,13);
        int contracts = 24;
        int carrot = 48;
        String city = "Bratislava";
        String SPZ = "BT235CA";
        String fuelConsumption = "5.6l/100km";
        String addressIP = "192.168.48.39";

        double predaj = carrot / contracts;

        System.out.println("Priemerné množstvo predanej mrkvy je: " + predaj + "ton");
    }
}
