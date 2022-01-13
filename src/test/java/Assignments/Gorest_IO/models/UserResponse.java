package Assignments.Gorest_IO.models;

public class UserResponse {
    private String meta;
    private AccountData accountData;

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public AccountData getData() {
        return accountData;
    }

    public void setData(AccountData accountData) {
        this.accountData = accountData;
    }
}
