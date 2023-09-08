package set.OperacoesBasicas.Desafio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraUnicaSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraUnicaSet = new HashSet<>();
    }

    private void adicionarPalavra(String palavra) {
        palavraUnicaSet.add(palavra);
    }

    private void removerPalavra(String palavra) {
        if (palavraUnicaSet.contains(palavra)) {
            palavraUnicaSet.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada no conjunto!");
        }
    }

    private boolean verificarPalavra(String palavra) {
        return palavraUnicaSet.contains(palavra);
    }

    private void exibirPalavrasUnicas() {
        System.out.println(palavraUnicaSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
