package tokyo.huyhieu.cukcuk.model;

public class Import {
   private long id;
    private long idSupplier;
    private long idUser;
    private Double totalMoney;

    public Import(long id, long idSupplier, long idUser, Double totalMoney) {
        this.id = id;
        this.idSupplier = idSupplier;
        this.idUser = idUser;
        this.totalMoney = totalMoney;
    }

    public Import(long idSupplier, long idUser, Double totalMoney) {
        this.idSupplier = idSupplier;
        this.idUser = idUser;
        this.totalMoney = totalMoney;
    }

    public Import(long idSupplier, long idUser) {
        this.idSupplier = idSupplier;
        this.idUser = idUser;
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
}
