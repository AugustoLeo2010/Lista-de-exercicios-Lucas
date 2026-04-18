public class classificacao_senha {
public static void main(String[] args) {

float senha = Float.parseFloat(IO.readln("Digite a senha: "));

if (senha == 2026) {
    IO.println("Senha Mestra");

}else if (senha > 999 && senha != 2026) {
    IO.println("Senha Comum");

}else if (senha < 1000) {
    IO.println("Senha Fraca");
}


}

}
