package ejercicios7.visitor;

import java.time.LocalDateTime;

public class Veterinario implements IVisitor {

    @Override
    public void visit(Perro perro) {
        System.out.println("Receta Cura Para el Animal de tipo Perro, para el tipo de Enfermedad "+perro.getTipoEnfermedad()+" \n"+ LocalDateTime.now());
    }

    @Override
    public void visit(Gato gato) {
        System.out.println("Receta Cura Para el Animal de tipo Gato, para el tipo de Enfermedad "+gato.getTipoEnfermedad()+" \n"+ LocalDateTime.now());
    }

    @Override
    public void visit(Caballo caballo) {
        System.out.println("Receta Cura Para el Animal de tipo Caballo, para el tipo de Enfermedad "+caballo.getTipoEnfermedad()+" \n"+ LocalDateTime.now());
    }
}
