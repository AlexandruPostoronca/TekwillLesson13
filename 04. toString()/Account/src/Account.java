public class Account {
    private final long id;
    private final String code;
    private final Long balance;

    public Account(long id, String code, Long balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    // Override toString() here

    @Override
    public String toString() {
        return "Account{id=" + id + ", code='" + code + '\'' +  ", balance=" + balance +'}';
    }
}
