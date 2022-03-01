package tokyo.huyhieu.cukcuk.model;

public class Warehouse {
    private Long id;
    private Long idMaterial;
    private Long quantity;

    public Warehouse() {
    }

    public Warehouse(Long id, Long idMaterial, Long quantity) {
        this.id = id;
        this.idMaterial = idMaterial;
        this.quantity = quantity;
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

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
