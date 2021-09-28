public class Exercicio1 {

   public int[]numero ={10,20};

    public Exercicio1() {
         int soma =0;
        for(int i = 0; i < numero.length; i++) {

            soma +=numero[i];
        }
        System.out.println(soma);
    }


    public static void main(String[] args) {
       new Exercicio1();

    }

}
