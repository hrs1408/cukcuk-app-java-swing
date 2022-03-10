package tokyo.huyhieu.cukcuk.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huyhi
 */
public class ExportDetail {
    private long id;
    private long idExport;
    private long idMaterial;
    private long quantity;

    public ExportDetail(long id, long idExport, long idMaterial, long quantity) {
        this.id = id;
        this.idExport = idExport;
        this.idMaterial = idMaterial;
        this.quantity = quantity;
    }

    public ExportDetail() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdExport() {
        return idExport;
    }

    public void setIdExport(long idExport) {
        this.idExport = idExport;
    }

    public long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    
    
}
