package tokyo.huyhieu.cukcuk.model;

public class Export {
    private long id;
    private long idUser;
    private String date;

    public Export(long id, long idUser, String date) {
        this.id = id;
        this.idUser = idUser;
        this.date = date;
    }

    public Export() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
