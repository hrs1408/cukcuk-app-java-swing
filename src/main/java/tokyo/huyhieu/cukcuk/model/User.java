package tokyo.huyhieu.cukcuk.model;

public class User {

    private Long id;
    private String userName;
    private String password;
    private String fullName;
    private String phone;
    private Boolean role;

    public User() {
    }

    public User(Long id, String userName, String password, String fullName, String phone, Boolean role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.role = role;
    }

    public User(String userName, String password, String fullName, boolean role, String phone) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.phone = phone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getRole() {
        return this.role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }
}
