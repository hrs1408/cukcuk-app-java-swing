package tokyo.huyhieu.cukcuk.model;

public class Import {
    private long id;
    private long idSupplier;
    private long idUser;
    private Double totalMoney;
    private String date;

    public Import(long id, long idSupplier, long idUser, Double totalMoney, String date) {
        this.id = id;
        this.idSupplier = idSupplier;
        this.idUser = idUser;
        this.totalMoney = totalMoney;
        this.date = date;
    }

    public Import(long idSupplier, long idUser, Double totalMoney, String date) {
        this.idSupplier = idSupplier;
        this.idUser = idUser;
        this.totalMoney = totalMoney;
        this.date = date;
    }

    public Import(long idSupplier, long idUser, String date) {
        this.idSupplier = idSupplier;
        this.idUser = idUser;
        this.date = date;
    }

    public Import() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
