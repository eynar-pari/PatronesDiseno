package ejercicios.singleton_factory_ejercicio4;

public class FactoryPrestamo {

    public enum PrestamoType {CREDITO,FINANCIAMIENTO,VIVIENDA,NEGOCIO}

    public static Prestamo make(PrestamoType type){
        Prestamo prestamo;
        switch (type){

            case CREDITO:
                prestamo = new PrestamoCredito();
                break;
            case FINANCIAMIENTO:
                prestamo = new PrestamoFinanciamiento();
                break;
            case VIVIENDA:
                prestamo = new PrestamoVivienda();
                break;
            case NEGOCIO:
                prestamo = new PrestamoNegocio();
                break;
            default:
                prestamo = new PrestamoNegocio();
                break;
        }
        return prestamo;
    }
}

