import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Nuts;
        int Cone;
        int newNuts;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество собранных шишек: ");

        Cone = scanner.nextInt();

        System.out.print("Введите количество орехов: ");

        Nuts = scanner.nextInt();

        System.out.print("Введите количество необходимых орехов: ");

        newNuts = scanner.nextInt();

        if (Cone * Nuts >= newNuts){

            System.out.print("Белочке хватит еды на зиму ");

        }

        else {

            System.out.print("Белочке не хватит еды на зиму ");

        }

    }
}