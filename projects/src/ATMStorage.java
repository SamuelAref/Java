public class ATMStorage {

    private String name;
    private int password;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int Password) {
        password = Password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int Balance) {
        balance = Balance;
    }

    ATMStorage() {
    }

    ATMStorage(String Name, int Password, int Balance) {

        setName(Name);
        setPassword(Password);
        setBalance(Balance);
    }

}
