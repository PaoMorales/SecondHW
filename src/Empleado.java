public class Empleado {
    private String name;
    private String clave;

    public Empleado(String name, String clave) {
        this.name = name;
        this.clave = clave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
