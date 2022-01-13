package Assignments.Gorest_IO.models;

public class UserAccountToDo {
    private String meta;
    private AccountToDo accountToDo;

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public AccountToDo getData() {
        return accountToDo;
    }

    public void setData(AccountToDo accountToDo) {
        this.accountToDo = accountToDo;
    }
}
