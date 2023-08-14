package controller;

public class SomatorioNumeros {

    public SomatorioNumeros() {
        super();
    }

    public int FRecursivaNatural(int N) {
        //Condi��o de parada ==> Quando N for igual a 0, ou seja quando n�o tiver mais valores para serem somados, ele retorna 0 para o somat�rio (N+0).
        if (N == 0) {
            return 0;
        }
        return N + FRecursivaNatural(N - 1);
        /*
         * A chamada de processos ocorre da seguinte forma:
         *
         * A fun��o recebe como par�metro o valor N informado pelo usu�rio, e o somat�rio ocorre
         * Somando o valor de N a uma nova chamada de processo, onde o valor de N vai diminu�ndo
         * um a um, at� chegar na sua condi��o de parada (0).
         * Assim, ocorrendo da seguinte forma:
         * Ent�o -> N + (N-1).
         */

    }
}
