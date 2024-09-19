package gr.aueb.cf.ch15.prct.account;

public class IdentifiableEntity {
    private String uuid;

    public IdentifiableEntity() {}

    public IdentifiableEntity(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
