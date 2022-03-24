public class Greeting {
    public static String greet(String lang,String name)
    {
        System.out.println("sofia changes");
        System.out.println("Sofia 2 changes");
        System.out.println("Joe Changes");
        System.out.println("sofia3 changes");

        if(lang == "Eng") {
            return "hello " + name;

        }
        else if(lang=="es") {
            return "Hola" + name;
        }
        else
        {
            return "Hi"+name;
        }
    }
    public static int interest(int principle,int time,int roi)
    {
        return principle*time*roi;
    }
    public static double calculateSalary(int hours,double payRate)
    {
        return hours*payRate;
    }
    public static boolean specialEleven(int n) {

        if(n%11==0 || n%11==1){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] arg)
    {

        String st;
        int result;
        double salary;
        boolean multiple;
        System.out.println("hiiii");
        st=greet( "Eng","sofia");
        System.out.println(st);
        result=interest(500,3,5);
        System.out.println("Rate of Interest is "+result);
        salary=calculateSalary(4,60);
        System.out.println(salary);
        multiple=specialEleven(23);
        System.out.println(multiple);
    }
}
