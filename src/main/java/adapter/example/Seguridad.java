package adapter.example;

public class Seguridad implements PersonaB{
    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    private int nacimiento;

    @Override
    public int calcularEdad() {
        return 2019-nacimiento;
    }
}
