package controller;

public class SomatorioNumeros {

    public SomatorioNumeros() {
        super();
    }

    public int FRecursivaNatural(int N) {
        //Condição de parada ==> Quando N for igual a 0, ou seja quando não tiver mais valores para serem somados, ele retorna 0 para o somatório (N+0).
        if (N == 0) {
            return 0;
        }
        return N + FRecursivaNatural(N - 1);
        /*
         * A chamada de processos ocorre da seguinte forma:
         *
         * A função recebe como parâmetro o valor N informado pelo usuário, e o somatório ocorre
         * Somando o valor de N a uma nova chamada de processo, onde o valor de N vai diminuíndo
         * um a um, até chegar na sua condição de parada (0).
         * Assim, ocorrendo da seguinte forma:
         * Então -> N + (N-1).
         */

    }
}
