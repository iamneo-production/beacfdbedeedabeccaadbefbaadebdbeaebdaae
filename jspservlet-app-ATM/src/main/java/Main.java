import model.AccountDetails;

public class Main {
    public static void main(String[] args) {
        // Create an instance of AccountDetails
        AccountDetails account = new AccountDetails("saving", 0, 0, 0);

        // Set account details
        account.setAccountType("saving");
        account.setWithdrawOrDepositAmount(1000);
        account.setAvailableBalance(5000);
        account.setPin(1234);

        // Print account details
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Withdraw/Deposit Amount: " + account.getWithdrawOrDepositAmount());
        System.out.println("Available Balance: " + account.getAvailableBalance());
        System.out.println("PIN: " + account.getPin());
    }
}
