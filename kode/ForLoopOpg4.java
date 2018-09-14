public class ForLoopOpg4
{
   public static void main(String[] args)
   {
      //kald printmetode
      print(3);
   
   }
   
   public static void print(int antal)
   {
      //for loop med 10 gentagelser
      for (int i=1;i<=10;i++)
      {
         //udskriv en linie med antal stjerner
         for (int j=0;j<antal;j++)
         {
            //udskriv stjerne og mellemrum
            System.out.print("* ");
         }
         //husk at skifte linie
         System.out.println();
      }
   }
}