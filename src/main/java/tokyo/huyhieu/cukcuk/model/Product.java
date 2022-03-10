package tokyo.huyhieu.cukcuk.model;

public class Product {

    private Long id;
    private Long idCategory;
    private String name;
    private Double price;
    private String image;

    public Product() {
    }

    public Product(Long id, Long idCategory, String name, Double price, String image) {
        this.id = id;
        this.idCategory = idCategory;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public Product(Long id, Long idCategory, String name, Double price) {
        this.idCategory = idCategory;
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product(long idCategory, String name, Double price, String image) {
        this.idCategory = idCategory;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCategory() {
        return this.idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
