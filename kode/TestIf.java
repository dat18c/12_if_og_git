public class TestIf
{
   public static void main(String[] args)
   {
      int alder = 77;
      //if
      if (alder<20)
      {
         System.out.println("mindre end 20");
         System.out.println("teenager");
      }
      
      else if (alder<40)
      {
         System.out.println("mindre end 40");
         System.out.println("midaldrende");
      }
      
      else
      {
         System.out.println("else-delen");
         System.out.println("halv- til hel-gammel");
      }
      //if else
      
      //if else if else
      
      //or, and, not
      if (alder>=18 && alder<=67)
      {
         System.out.println("AND: arbejdsduelig");
      }
      if (alder<=17 || alder>67)
      {
         System.out.println("OR: udenfor arbejdsmarkedet");
      }
      if (!(alder>=18 && alder<=67))
      {
         System.out.println("NOT AND: udenfor arbejdsmarkedet");
      }
   }
}