public class faixa_etaria {
public static void main(String[] args) {

  float idade = Float.parseFloat(IO.readln("Qual e sua idade?: "));

  if (idade == 12) {
      IO.println("Criança");

  }else if (idade >= 12 && idade <= 17) {
      IO.println("Adolescente");

  }else if (idade >= 18 && idade <= 59 ) {
      IO.println("Adulto");

  }else if (idade > 60) {
      IO.println("Idoso");

  }else if (idade < 0) {
      IO.println("Idade Invalida");
  }


}

}
