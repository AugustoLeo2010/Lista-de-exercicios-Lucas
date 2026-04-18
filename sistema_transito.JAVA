public class sistema_transito {
public static void main(String[] args) {

float velocidade = Float.parseFloat(IO.readln("Digite a velocidade do veiculo: "));

  if (velocidade < 0) {
      IO.println("Velocidade invalida");

  }else if (velocidade > 0 && velocidade < 60) {
      IO.println("Velocidade permitida");

  }else if (velocidade > 61 && velocidade < 80) {
      IO.println("Atenção");

  }else if (velocidade > 81 && velocidade < 100) {
      IO.println("Multa leve");

  }else if (velocidade > 100) {
      IO.println("Multa grave");
  }


}
}
