class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long newValue) {
        this.balance = newValue;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public void setLocked(boolean newValue) {
        this.locked = newValue;
    }
}