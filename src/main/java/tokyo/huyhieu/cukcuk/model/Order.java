package tokyo.huyhieu.cukcuk.model;

public class Order {
    private Long id;
    private Double totalMoney;
    private Long idUser;
    private Long idVoucher;
    private String date;
    private boolean status;

    public Order() {
    }

    public Order(Long id, Double totalMoney, Long idUser, Long idVoucher, String date, boolean status) {
        this.id = id;
        this.totalMoney = totalMoney;
        this.idUser = idUser;
        this.idVoucher = idVoucher;
        this.date = date;
        this.status = status;
    }

    public Order( Double totalMoney, Long idUser, Long idVoucher, String date, boolean status) {
        this.totalMoney = totalMoney;
        this.idUser = idUser;
        this.idVoucher = idVoucher;
        this.date = date;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalMoney() {
        return this.totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Long getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdVoucher() {
        return this.idVoucher;
    }

    public void setIdVoucher(Long idVoucher) {
        this.idVoucher = idVoucher;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
