public class Stakit
{
   public static void main(String[] args)
   {
      //stakitproblem
      for (int i=0;i<4;i++)
      {
         System.out.print("|=");
         
      }
      //indsæt tom linie
      System.out.println();
      //sæt pæl først
      System.out.print("|");
      //sæt hegnstykker og pæle - en mindre en før
      for (int etellerandet=0;etellerandet<3;etellerandet++)
      {
         System.out.print("=|");
      }
      //skift linie
      System.out.println();
      //talrække 1, 2, 3, 4, 5 uden komma til sidst
      //skriv første tal
      System.out.print(1);
      //skriv komma og næste tal 4 gange
      for (int i=2;i<=5;i++)
      {
         System.out.print("," + i);
      }
   }

}