import java.util.*;
public class linearSearchMenu {
    public static int MenuSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"dosa", "idli", "samosa", "panipuri", "bhel"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a dish to search in the menu: ");
        String key = sc.nextLine();

        int index = MenuSearch(menu, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(key + " is at index " + index);
        }
    }
}
