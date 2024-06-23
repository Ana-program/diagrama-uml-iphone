package navegadorInternet;

import funcionalidades.NavegadorInternet;

abstract public class MozillaFirefox implements NavegadorInternet{
    
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
}
