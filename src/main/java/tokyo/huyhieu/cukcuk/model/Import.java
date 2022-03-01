package tokyo.huyhieu.cukcuk.model;

public class Import {
    private Long id;
    private Long idMaterial;
    private Long idSupplier;
    private Long idUser;
    private Long quantity;
    private Double totalPrice;  

    public Import() {
    }
    
    public Import(Long id, Long idMaterial, Long idSupplier, Long idUser, Long quantity, Double totalPrice) {
        this.id = id;
        this.idMaterial = idMaterial;
        this.idSupplier = idSupplier;
        this.idUser = idUser;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMaterial() {
        return this.idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Long getIdSupplier() {
        return this.idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Long getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
