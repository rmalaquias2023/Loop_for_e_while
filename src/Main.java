public class Main {
    public static void main(String[] args) {
       System.out.println("Esse é o Screen Match!");
       System.out.println("Filme: Top Gun: Maverick");

       int anoDeLancamento = 2022;
       System.out.println("Ano de lançamento: " + anoDeLancamento);
       //boolean incluidoNoPlano = true;
       //double notaDoFilme = 8.1;


       // media calculada a partir da soma de 3 notas
       double media = (9.8 + 6.3 + 8.0) / 3;
       System.out.println(media);

       String sinopse;
       sinopse = """
        
        Filme de aventura, estrelado pelo ator Tom Cruise
        ano de lançamento:"""+ anoDeLancamento;
       System.out.println(sinopse);

       int classificacao = (int) (media /2);
       System.out.println(classificacao);





    }
}