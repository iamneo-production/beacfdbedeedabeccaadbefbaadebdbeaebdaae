package service;
public interface InterfaceClass {
    double withdrawAmount(double amountToWithdraw, double availableBalance);

    double depositAmount(double amountToDeposit, double availableBalance);

    double accountBalance(double availableBalance);
}
