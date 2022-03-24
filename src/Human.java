public class Human {
    private String dateOfBirth;
    private String name = "Default Name";
    public void speak()
    {
        System.out.println("Hello World");
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
 void printDetails()
 {
     System.out.println("Name is "+name);
     System.out.println("Date of Birth is "+dateOfBirth);
 }


    public static void main(String [] args)
    {
     Human object = new Human();
     object.setName("sofia");
     object.setDateOfBirth("020390");
     object.printDetails();
    }
}
