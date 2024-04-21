class returnStatement
{
    public static void main(String [] args)
    {
        int num = 6;
        evenOdd(num);
    }
    
    public static void evenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println("Even");
            return;
        }else{
            System.out.println("Odd");
        }
        
        System.out.println("Execution ends");
    }
}