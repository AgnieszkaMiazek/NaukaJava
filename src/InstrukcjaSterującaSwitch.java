public class InstrukcjaSterującaSwitch {
    public static void main(String[] args) {
        String danie = "Pizza";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22zł.");
                break;
            case "Kurczak":
                System.out.println("Cena to 15zł.");
                break;
            case "Frytki":
                System.out.println("Cena to 7zł.");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }}
