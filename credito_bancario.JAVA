public class credito_bancario {
public static void main(String[] args) {

  float renda = Float.parseFloat(IO.readln("Qual e sua renda mensal?: "));
  float score = Float.parseFloat(IO.readln("Qual o seu score?: "));
    float historico = Float.parseFloat(IO.readln("Qual o seu historico?: "));
    float dependentes = Float.parseFloat(IO.readln("Quais os seus dependentes?: "));


    if (renda >= 10000 && score >= 800 && historico == 1 ) {
        IO.println("Aprovado Premium");

    }else if (renda >= 5000 && score >= 600 && (historico >= 1 && dependentes <= 2 )){
        IO.println("Aprovado Padrão");

    }else if((score <= 400 & score >= 599)||(renda >= 5000 && historico == 0)) {
        IO.println("Risco Moderado");

    }else if(dependentes < 5 && score < 700) {
        IO.println("Negado por excesso de risco");

    }else {
        IO.println("Negado");
    }



}

}
