public class Dog
{
   private String name;
   private String foedselsdato;
   
   //konstruktør
   public Dog()
   {
      name = "";
      foedselsdato = "1. april 2018";
   }
   
   public Dog(String name, String dato)
   {
      this.name = name;
      this.foedselsdato = dato;
   }
   
   //get (accessor) & set (mutator)
   public void setNavn(String name)
   {
      this.name = name;
   }
   
   public void setFoedselsdato(String dato)
   {
      this.foedselsdato = dato;
   }
   
   public String getNavn()
   {
      return name;
   }
   
   public String getFoedselsdato()
   {
      return foedselsdato;
   }
   
   //øvrige metoder
   public void logre(boolean glad)
   {
   
   }
   
   public void goe(int styrke)
   {
   
   }
}