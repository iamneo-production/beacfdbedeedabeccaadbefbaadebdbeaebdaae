package service;

public class AmountDetails implements InterfaceClass {
    public double withdrawAmount(double amountToWithdraw, double availableBalance) {
        if (amountToWithdraw < 0 || availableBalance < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (amountToWithdraw > availableBalance) {
            return 0;
        }
        return availableBalance - amountToWithdraw;
    }

    public double depositAmount(double amountToDeposit, double availableBalance) {
        if (amountToDeposit < 0 || availableBalance < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        return availableBalance + amountToDeposit;
    }

    public double accountBalance(double availableBalance) {
        if (availableBalance < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        return availableBalance;
    }
}

