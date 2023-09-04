import java.util.Scanner;
class ConsoleIO {
    private Scanner scanner;
    public ConsoleIO() {
        this.scanner = new Scanner(System.in);
    }
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public void displayOutput(String output) {
        System.out.println(output);
    }
    public void displayMenu() {
        System.out.println("Address Book Menu");
        System.out.println("1. Add an address");
        System.out.println("2. Remove an address");
        System.out.println("3. Get the number of addresses");
        System.out.println("4. List all addresses");
        System.out.println("5. Find an address by last name");
        System.out.println("6. Exit");
    }
}
