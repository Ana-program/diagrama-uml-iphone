package aparelhoTelefonico;

import funcionalidades.AparelhoTelefonico;

abstract public class MotoQ implements AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
System.out.println("Iniciando chamada");
        
    }

    @Override
    public void atender() {
       System.out.println("Telefone tocando");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe a sua mensagem");
    }
    
}
