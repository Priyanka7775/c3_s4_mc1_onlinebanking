public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingAccount= new SavingAccount(12345678987L,"12-1-2022","Self",true,10000,10000,7,
                "Priyanka","987654321");

        System.out.println("savingAccount.creditBalance(3000) = " + savingAccount.creditBalance(3000));
        System.out.println("savingAccount.debitBalance(5000) = " + savingAccount.debitBalance(5000));
        System.out.println("savingAccount.showAccountBalance() = " + savingAccount.showAccountBalance());
    }
}

