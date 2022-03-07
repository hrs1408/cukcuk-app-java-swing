package tokyo.huyhieu.cukcuk.model;

public class Warehouse {
    private Long idMaterial;
    private Long quantity;

    public Warehouse() {
    }

    public Warehouse(Long idMaterial, Long quantity) {
        this.idMaterial = idMaterial;
        this.quantity = quantity;
    }

    public Long getIdMaterial() {
        return this.idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
