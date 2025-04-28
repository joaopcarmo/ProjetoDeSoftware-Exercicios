1) Em linguagem de programação Java, escreva um algoritmo que possua um pacote com o
   nome “animal”. Nesse pacote, defina as classes “Animal”, “Elefante”, “Gorila”, “Leao”,
   “Urso” e “Zebra”.

   O algoritmo deve possuir também um pacote com o nome “principal”. Nesse pacote defina
   uma classe com o nome “Principal”. Na classe “Principal”, crie o método:

   public static void main (String[] args).

   Nesse método, crie um vetor de 10 animais,

   Animal[] zoologico = new Animal[10];

   Cada posição do vetor deve receber a referência para um objeto de uma classe do pacote
   “animal”. Percorra o vetor passando para os objetos a mensagem para execução do método
   sobrescrito nas respectivas classes.