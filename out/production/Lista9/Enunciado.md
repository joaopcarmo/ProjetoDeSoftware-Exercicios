# Lista 09 - POO


1) Controle os saques e apresente os dados de uma conta bancária. O algoritmo do banco é
   apresentado abaixo:

package banco;
        public class ContaCorrente {
            private int numero, agencia;
            private double saldo;

            public void iniciarContaCorrente(int n, int ag) {
                  numero = n;
                  agencia = ag;
                  saldo = 0;
            }
                  public void sacar(double valor){
                  saldo = saldo - valor;
            }
                  public void depositar(double valor){
                  saldo = saldo + valor;
            }
                  public double consultarSaldo(){
                  return (saldo);
            }
        }

      package banco;

      public class Main {
          public static void main(String[] args) {
              ContaCorrente contaCorrente;
              contaCorrente = new ContaCorrente();

              contaCorrente.iniciarContaCorrente(1, 1);

              contaCorrente.depositar(500);
              System.out.println("Saldo: " + contaCorrente.consultarSaldo());

              contaCorrente.sacar(300);
              System.out.println("Saldo: " + contaCorrente.consultarSaldo());
              }
          }
          
          
          
      Implemente o método exibe() na classe ContaCorrente que retorne os dados da conta.
      Exemplo:
      Agência: 15
      Conta: 101
      Saldo: R$ 3257,48.

      Para testar a implementação da classe, solicite ao usuário que informe o número e
      agência da conta. Em seguida, solicite um valor para depósito. Então, imprima os dados
      da conta utilizando o método exibe() implementado. Logo após, solicite um valor para
      saque. Novamente, imprima os dados da conta utilizando o método exibe(). Altere o
      método sacar() de modo que não seja possível sacar um valor maior que o saldo da
      conta. Emita uma mensagem de erro, caso o valor do saque seja inválido. Documente as
      classes e seus métodos, utilizando o comentário /** */, reconhecido pela ferramenta
      javadoc