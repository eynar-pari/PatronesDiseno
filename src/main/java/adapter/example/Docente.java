package adapter.example;

public class Docente implements PersonaB{
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
