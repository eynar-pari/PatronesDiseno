package ejercicios7.composite;

abstract class Component {
    private String name;
    public Component(String name)    {
        this.name =name;
        System.out.println("Constructor " +name);
    }
    public String getName(){
        return this.name;
    }
    public abstract void print();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
    public abstract int getPrecio();
}
