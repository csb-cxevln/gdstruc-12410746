//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    // prints out Hello World
    // System.out.println("Hello World");

    // gets user input
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scanner.nextLine();

    System.out.println("Hello " + name);
}
