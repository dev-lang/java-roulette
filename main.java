/*
  Loop infinito que recorre negativos y positivos
  
  El método se ha realizado aprovechando el límite del registro short para hacer un loop.

  Funciona porque nunca se cumple la condición y entonces recorre los negativos

  (c) 2021 github.com/dev-lang
*/

class Main {
  public static void main(String[] args) {
    short CityAmount = 1;
    String Mensaje="Hello world! -devlang";
    System.out.println(Mensaje);
    while (CityAmount <= 32768){
      System.out.println(CityAmount);
      CityAmount++;
    }
  }
}
