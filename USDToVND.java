public class USDToVND {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter money");
        int money = scanner.nextInt();
        int change = money * 23000;
        System.out.println(change);
    }
}
