package tokyo.huyhieu.cukcuk.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huyhi
 */
public class ImportDetail {
    private long id;
    private long idImport;
    private long idMaterial;
    private long quantity;
    private Double intoMoney;

    public ImportDetail(long id, long idImport, long idMaterial, long quantity, Double intoMoney) {
        this.id = id;
        this.idImport = idImport;
        this.idMaterial = idMaterial;
        this.quantity = quantity;
        this.intoMoney = intoMoney;
    }

    public ImportDetail(long idImport, long idMaterial, long quantity, Double intoMoney) {
        this.idImport = idImport;
        this.idMaterial = idMaterial;
        this.quantity = quantity;
        this.intoMoney = intoMoney;
    }

    public ImportDetail() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdImport() {
        return idImport;
    }

    public void setIdImport(long idImport) {
        this.idImport = idImport;
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

    public Double getIntoMoney() {
        return intoMoney;
    }

    public void setIntoMoney(Double intoMoney) {
        this.intoMoney = intoMoney;
    }
    
    
}
