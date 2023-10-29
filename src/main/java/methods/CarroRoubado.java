package methods;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado {
    private List<ViaturaPolicial> observadores = new ArrayList<>();

    public void adicionarObservador(ViaturaPolicial observador) {
        observadores.add(observador);
    }

    public void removerObservador(ViaturaPolicial observador) {
        observadores.remove(observador);
    }

    public void virarEsquerda() {
        System.out.println("Carro roubado virou a esquerda");
        notifiqueOObservador("Viatura virou a esquerda");
    }

    public void virarDireita() {
        System.out.println("Carro roubado virou a direita...");
        notifiqueOObservador("Viatura virou a direita");
    }

    public void parar() {
        System.out.println("Carro roubado parou");
        notifiqueOObservador("Viatura parou");
    }

    private void notifiqueOObservador(String mensagem) {
        for (ViaturaPolicial observador : observadores) {
            observador.atualizar(mensagem);
        }
    }
}