package ejercicios7.visitor;

public interface IVisitor {
     public void visit(Perro perro);
     public void visit(Gato gato);
     public void visit(Caballo caballo);

}
