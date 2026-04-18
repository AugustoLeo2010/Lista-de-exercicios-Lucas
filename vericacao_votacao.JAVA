public class verificacao_votacao {
public static void main(String[] args) {

  float idade = Float.parseFloat(IO.readln("Digite sua idade: "));

if (idade < 16) {
    IO.println("Não vota");

}else if (idade >= 16 && idade <= 17) {
    IO.println("Voto opcional");

}else if (idade >= 18 && idade <= 69) {
    IO.println("Voto opcional");

}else if (idade >= 70) {
    IO.println("Voto opcional");
}


}

}
