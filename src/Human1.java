public class Human1 {
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

    public Human1(String dateOfBirth, String name) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    public static void main(String [] args)
    {
        Human1 object = new Human1("030290","sofia");

        object.printDetails();
    }

}
