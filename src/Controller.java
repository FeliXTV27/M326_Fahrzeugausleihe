import java.util.Scanner;

public class Controller {

    public void startMenu() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|   Willkommen in der Fahrzeugverwaltung               |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Was möchten Sie tun?                                 |");
        System.out.println("| 1) Fahrzeugpark verwalten                            |");
        System.out.println("| 2) Fahrzeuge Vermieten                               |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Geben Sie Ihre Auswahl ein! [1/2]                    |");
        System.out.println("+------------------------------------------------------+");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        startMenuSwitch(input);
    }

    private void startMenuSwitch(String input) {
        switch(input){
            case "1":
                vehicleparkMenu();
                break;
            case "2":
                rentMenu();
                break;
            default:
                startMenu();
        }
    }

    private void vehicleparkMenu() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|   Fahrzeugpark-Menu                                  |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Was möchten Sie tun?                                 |");
        System.out.println("| 1) Freie Fahrzeuge anzeigen                          |");
        System.out.println("| 2) Vermietete Fahrzeuge anzeigen                     |");
        System.out.println("| 3) Fahrzeug bearbeiten                               |");
        System.out.println("| 4) Fahrzeug hinzufügen                               |");
        System.out.println("| 5) Fahrzeug entfernen                                |");
        System.out.println("| 6) Zurück zum Startmenü                              |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Geben Sie Ihre Auswahl ein! [1/2/3/4/5/6]            |");
        System.out.println("+------------------------------------------------------+");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        vehicleparkMenuSwitch(input);
    }

    private void vehicleparkMenuSwitch(String input) {
        switch(input){
            case "1":
                listFreeVehicles();
                break;
            case "2":
                listLeasedVehicles();
                break;
            case "3":
                changeVehicle();
                break;
            case "4":
                addVehicle();
                break;
            case "5":
                deleteVehicle();
                break;
            case "6":
                startMenu();
            default:
                vehicleparkMenu();
        }
    }

    private void deleteVehicle() {
    }

    private void addVehicle() {
    }

    private void changeVehicle() {
    }

    private void rentMenu() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|   Vermietungs-Menu                                   |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Was möchten Sie tun?                                 |");
        System.out.println("| 1) Freie Fahrzeuge anzeigen                          |");
        System.out.println("| 2) Vermietete Fahrzeuge anzeigen                     |");
        System.out.println("| 3) Fahrzeug ausleihen                                |");
        System.out.println("| 4) Fahrzeug zurücknehmen                             |");
        System.out.println("| 5) Zurück zum Startmenü                              |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Geben Sie Ihre Auswahl ein! [1/2/3/4/5]              |");
        System.out.println("+------------------------------------------------------+");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        rentMenuSwitch(input);
    }

    private void rentMenuSwitch(String input) {
        switch(input){
            case "1":
                listFreeVehicles();
                break;
            case "2":
                listLeasedVehicles();
                break;
            case "3":
                leaseVehicle();
                break;
            case "4":
                takebackVehicle();
                break;
            case "5":
                startMenu();
            default:
                rentMenu();
        }
    }

    private void takebackVehicle() {
    }

    private void leaseVehicle() {
    }

    private void listLeasedVehicles() {
    }

    private void listFreeVehicles() {
    }


}
