package tokyo.huyhieu.cukcuk.model;

public class Voucher {
    private Long id;
    private String dateStart;
    private String dateEnd;
    private int value;
    private Boolean status;

    public Voucher() {
    }

    public Voucher(Long id, String dateStart, String dateEnd, int value, Boolean status) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.value = value;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
