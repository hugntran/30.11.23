import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    dssv.addSinhVien(new SinhVien(scanner.nextInt(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble()));
                    break;
                case 2:
                    dssv.editSinhVien(scanner.nextInt());
                    break;
                case 3:
                    dssv.deleteSinhVien(scanner.nextInt());
                    break;
                case 4:
                    dssv.sortByGpa(scanner.nextDouble());
                    break;
                case 5:
                    dssv.sortByName(scanner.nextLine());
                    break;
                case 6:
                    dssv.showSinhVien();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
    }