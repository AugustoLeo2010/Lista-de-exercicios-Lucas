public class autentificacao {
public static void main(String[] args) {

float senha = Float.parseFloat(IO.readln("Digite a senha: "));
    float acesso = Float.parseFloat(IO.readln("Digite o nivel de acesso: "));


if (senha == 1234  &&  acesso >= 5 ) {
    IO.println("Acesso total");

}else if (senha == 1234 && acesso < 5) {
    IO.println("Acesso parcial");

}else if (senha != 1234 && acesso >= 5 ) {
    IO.println("acesso suspeito");

}else{
    IO.println("Acesso negado");
}


}

}

