 class Demopublic
{
    public static void main(String[] args) {
        Demopublic1.m1();
    }
}

public class Demopublic1
{
    public static void m1()
    {
        System.out.println("Hello from Demopublic2 m1()");
        Demopublic2.m2();
    }
}

class Demopublic2
{
    public static void m2()
    {
        System.out.println("Hi from Demo2 m2()");
    }
}