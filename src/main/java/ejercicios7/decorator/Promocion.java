package ejercicios7.decorator;

import java.util.Random;

public class Promocion extends Decorator {
    public Promocion(ICuenta componente){
        super(componente);
    }

    public int getRandom(){
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        return  result;
    }

    public void showData() {
        super.showData();
        boolean isWinner= getRandom()%2==0;
        if (isWinner)
            super.setMonto(super.getMonto()*2);

        System.out.println("*Promocion Win: "+isWinner);
        System.out.println("*Amount : "+super.getMonto());
    }
}
