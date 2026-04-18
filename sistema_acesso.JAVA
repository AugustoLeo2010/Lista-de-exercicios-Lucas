public class sistema_acesso {
public static void main(String[] args) {

float hora = Float.parseFloat(IO.readln("Digite a hora atual: "));

if (hora < 0 || hora > 23) {
    IO.println("Hora invalida");

}else if (hora >= 6 && hora <= 11) {
    IO.println("Manhã");

}else if (hora >= 12 && hora <= 17) {
    IO.println("Tarde");

}else if (hora >= 18 && hora <= 23) {
    IO.println("Noite");

}else if (hora >= 0 && hora <= 5) {
    IO.println("Madrugada");
}


}

}
