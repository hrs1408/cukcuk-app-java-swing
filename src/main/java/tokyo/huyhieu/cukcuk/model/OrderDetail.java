package tokyo.huyhieu.cukcuk.model;

public class OrderDetail {
    private Long id;
    private Long idOrder;
    private Long idProduct;
    private Long quantity;
    private Double intoMoney;

    public OrderDetail() {
    }

    public OrderDetail(Long id, Long idOrder, Long idProduct, Long quantity, Double intoMoney) {
        this.id = id;
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.intoMoney = intoMoney;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdOrder() {
        return this.idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Long getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getIntoMoney() {
        return this.intoMoney;
    }

    public void setIntoMoney(Double intoMoney) {
        this.intoMoney = intoMoney;
    }
}
