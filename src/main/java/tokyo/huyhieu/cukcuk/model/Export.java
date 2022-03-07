package tokyo.huyhieu.cukcuk.model;

public class Export {
     private long id;
    private long idUser;

    public Export(long id, long idUser) {
        this.id = id;
        this.idUser = idUser;
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
}
