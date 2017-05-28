
package exercicio060708;
import java.util.Calendar;

public class Exercicio060708 {


    public static void main(String[] args) {
        Calendar data1 = Calendar.getInstance();
        data1.set(Calendar.DAY_OF_MONTH, 26);
        data1.set(Calendar.MONTH, 5);
        data1.set(Calendar.YEAR, 2017);
        
        Calendar data2 = Calendar.getInstance();
        data2.set(Calendar.DAY_OF_MONTH, 01);
        data2.set(Calendar.MONTH, 1);
        data2.set(Calendar.YEAR, 2018);
        exercicio06(data1,data2);
        exercicio07(data1,data2);
        exercicio08(data1,data2);
    }
    public static void exercicio06(Calendar data1, Calendar data2) {
        int numdias,numeses,numanos,numhoras,numminutos;

        long d1 = data1.getTimeInMillis();
        long d2 = data2.getTimeInMillis();
        numdias =  (int)((d2 - d1)/ (24*60*60*1000));
        numanos = (int) numdias/360;
        numeses = (int) numdias/30;
        numhoras = (int) numdias * 24;
        numminutos = (int) numhoras * 60;
        System.out.println("N° anos: " + numanos);
        System.out.println("N° meses: " + numeses);
        System.out.println("N° dias: " + numdias );
        System.out.println("N° horas: " + numhoras);
        System.out.println("N° minutos: " + numminutos);

    }
    public static void exercicio07(Calendar data1, Calendar data2) {
       if(data1.get(Calendar.YEAR) > data2.get(Calendar.YEAR)) {
           System.out.println("A primeira data é maior!");
       }
       else if(data1.get(Calendar.YEAR) < data2.get(Calendar.YEAR)) {
        System.out.println("A segunda data é maior!");
       }
       else if(data1.get(Calendar.YEAR) == data2.get(Calendar.YEAR)) {
           if(data1.get(Calendar.MONTH) > data2.get(Calendar.MONTH)) {
             System.out.println("A primeira data é maior!");
           }
          else if(data1.get(Calendar.MONTH) < data2.get(Calendar.MONTH)) {
              System.out.println("A segunda data é maior!");
          }
          else if(data1.get(Calendar.MONTH) == data2.get(Calendar.MONTH)) {
              if(data1.get(Calendar.DAY_OF_MONTH) > data2.get(Calendar.DAY_OF_MONTH)) {
                  System.out.println("A primeira data é maior!");
              }
              else if(data1.get(Calendar.DAY_OF_MONTH) < data2.get(Calendar.DAY_OF_MONTH)){
                  System.out.println("A segunda data é maior!");
              }
              else {
                  System.out.println("As datas são iguais!");
              }

          }
       }
    }
    
    public static void exercicio08(Calendar data1, Calendar data2) {
        int numdias;
        long d1 = data1.getTimeInMillis();
        long d2 = data2.getTimeInMillis();
        numdias =  (int)((d2 - d1)/ (24*60*60*1000));
        if(numdias > 20) {
               System.out.println("A diferença de dias é maior que 20 dias!");
            }
            else {
               System.out.println("A diferença de dias é menor que 20 dias!");
            }
    }
}
