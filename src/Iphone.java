import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

abstract public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
   
    @Override
    public void atender() {
        System.out.println("Telefone tocando");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe a sua mensagem");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Iniciando chamada");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adiconada");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página aberta");
        
    }

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
