package main;

import methods.CarroRoubado;
import methods.ViaturaPolicial;

public class Main {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado();
        ViaturaPolicial viatura1 = new ViaturaPolicial();
        ViaturaPolicial viatura2 = new ViaturaPolicial();

        carroRoubado.adicionarObservador(viatura1);
        carroRoubado.adicionarObservador(viatura2);


        carroRoubado.virarEsquerda();
        carroRoubado.virarDireita();
        carroRoubado.parar();

        carroRoubado.removerObservador(viatura1);

        carroRoubado.virarEsquerda();
    }
}
