public class FuncionalidadesIphone {

    public static void main(String[] args) {
        
        Iphone iphone = new Iphone() {
         
        };

        iphone.ligar("1198259-2371");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    
        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Trevo");

    }
    
}
