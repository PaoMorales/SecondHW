import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String clave;
    private String phone;
    private String email;
    private LocalDate registerDate;
    private String addres;

    public Usuario(String nombre, String clave, String phone, String email, LocalDate registerDate, String addres) {
        this.nombre = nombre;
        this.clave = clave;
        this.phone = phone;
        this.email = email;
        this.registerDate = registerDate;
        this.addres = addres;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }


    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public String getAddres() {
        return addres;
    }

}