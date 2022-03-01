package tokyo.huyhieu.cukcuk.model;

public class Export {
    private Long id;
    private Long idMaterial;
    private Long idUser;
    private Long quantity;  

    public Export() {
    }

    public Export(Long id, Long idMaterial, Long idUser, Long quantity) {
        this.id = id;
        this.idMaterial = idMaterial;
        this.idUser = idUser;
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
}
