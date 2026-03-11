package playground.serverSecurity;

import java.util.List;
import java.util.Scanner;

public class serverGateway {

    final static List<String> ACCOUNT_TYPE = List.of("admin", "researcher", "guest");
    final static List<String> ACCESS_GRANTED = List.of("Full Server Access Granted.", "Dataset Access Granted.",
            "Access Denied.");

    static List<String> securityLoginBlackList = List.of("DROP_TABLE_USERS", "SELECT *");

    // SECURITY ZONE
    // ---------------------
    // FireWall

    public static String fireWall(String account, byte clearanceLevel) {

        for (String item : securityLoginBlackList) {
            if (account.contains(item)) {
                return "Injection detected!";
            }
        }

        return gatewayStatus(account, clearanceLevel);
    }

    // SECURITY ZONE
    // ---------------------

    public static String gatewayStatus(String account, byte clearanceLevel) {
        if (account.equals(ACCOUNT_TYPE.getFirst()) && clearanceLevel == 5)
            return ACCESS_GRANTED.getFirst();

        else if (account.equals(ACCOUNT_TYPE.get(1)) && clearanceLevel >= 3)
            return ACCESS_GRANTED.get(1);

        else
            return ACCESS_GRANTED.getLast();
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account type: ");
        String account = sc.nextLine().trim();

        System.out.print("Security Clearance Level: ");
        byte clearanceLevel = sc.nextByte();

        System.out.printf("--NOTIFICATION--\n%s\n", fireWall(account, clearanceLevel));

        sc.close();
    }
}
