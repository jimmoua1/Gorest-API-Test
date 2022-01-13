package Assignments.Gorest_IO.models;

public class UserComment {
    private String meta;
    private AccountComment accountComment;

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public AccountComment getData() {
        return accountComment;
    }

    public void setData(AccountComment accountComment) {
        this.accountComment = accountComment;
    }

}
