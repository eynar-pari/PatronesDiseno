package ejercicios7.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Lavadora lavadora = new Lavadora();
        Televisores televisores = new Televisores();
        Refrigerador refrigerador = new Refrigerador();
        lavadora.setCosto(50);
        refrigerador.setCosto(60);
        televisores.setCosto(70);

        Celular celular = new Celular();
        Computadora computadora = new Computadora();
        Tablet tablet = new Tablet();
        celular.setPrecio(70);
        computadora.setPrecio(80);
        tablet.setPrecio(90);

        AdaptadorLavadora adaptadorLavadora = new AdaptadorLavadora(lavadora);
        AdaptadorTelevisores adaptadorTelevisores = new AdaptadorTelevisores(televisores);
        AdaptadorRefrigerador adaptadorRefrigerador = new AdaptadorRefrigerador(refrigerador);

        List<IArtefactosElectronicosA> listArtefactos = new ArrayList<>();
        listArtefactos.add(celular);
        listArtefactos.add(tablet);
        listArtefactos.add(computadora);
        listArtefactos.add(adaptadorLavadora);
        listArtefactos.add(adaptadorRefrigerador);
        listArtefactos.add(adaptadorTelevisores);

        for (IArtefactosElectronicosA element:listArtefactos
             ) {
            System.out.println("precio "+ element.getPrecio());
        }

    }


}
