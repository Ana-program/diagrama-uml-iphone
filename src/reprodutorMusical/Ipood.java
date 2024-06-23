package reprodutorMusical;

import funcionalidades.ReprodutorMusical;

abstract public class Ipood implements ReprodutorMusical {
    
    @Override
    public void pausar() {
        System.out.println("Musica pausada");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
        
    }
}
