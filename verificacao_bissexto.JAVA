public class verificacao_bissexto {
public static void main(String[] args) {

float ano = Float.parseFloat(IO.readln("Digite o ano: "));

if (ano < 0) {
    IO.println("Ano invalido");

}else if (ano % 4 == 0) {
    IO.println("Ano bissexto");

}else{
    IO.println("Ano comum");
}


}
}
