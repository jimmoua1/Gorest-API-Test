package Assignments.Gorest_IO.models;

public class UserPost {
    private String meta;
    private AccountPost accountPost;

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public AccountPost getData() {
        return accountPost;
    }

    public void setData(AccountPost accountPost) {
        this.accountPost = accountPost;
    }
}
