package tokyo.huyhieu.cukcuk.model;

public class Supplier {
    private Long id;
    private String name;
    private String address;
    private String phone;

    public Supplier() {
    }

    public Supplier(Long id, String name, String phone,  String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Supplier(String name, String phone,  String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
