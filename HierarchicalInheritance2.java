class Fan
{
    String companyName;
    String warranty;

    Fan(String companyName, String warranty)
    {
    	super();
        this.companyName = companyName;
        this.warranty = warranty;
    }

    public void displayFan()
    {
        System.out.println("****Fan Details****");
        System.out.println("Company Name: " + companyName);
        System.out.println("Warranty: " + warranty + " years");
    }
}

class TableFan extends Fan
{
    String type;
    String color;
    double price;

    TableFan(String type, String color, double price,String companyName, String warranty)
    {
        super(companyName, warranty);
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public void displayTableFan() 
    {
        System.out.println("****TABLE FAN DETAILS****");
        System.out.println("FAN TYPE: " + type);
        System.out.println("FAN COLOR: " + color);
        System.out.println("FAN PRICE: " + price);
    }
}

class CilingFan extends Fan
{
    String typeCi;
    String colorCi;
    double priceCi;

    CilingFan(String companyName, String warranty, String typeCi, String colorCi, double priceCi)
    {
        super(companyName, warranty);
        this.typeCi = typeCi;
        this.colorCi = colorCi;
        this.priceCi = priceCi;
    }

    public void displayCilingFan()
    {
        System.out.println("****CEILING FAN DETAILS****");
        System.out.println("CEILING FAN TYPE: " + typeCi);
        System.out.println("CEILING FAN COLOR: " + colorCi);
        System.out.println("CEILING FAN Price: " + priceCi);
        // return;
    }
}

 class HierarchicalInheritance2
 {
    public static void main(String [] args)
    {
        TableFan obj = new TableFan("Orient", "2", "Table Fan", "White", 1200.0);
        obj.displayFan();
        obj.displayTableFan();
        CilingFan obj1 = new CilingFan("USHA", "1", "Ceiling Fan", "Black", 1000.0);
        obj1.displayCilingFan();
        obj1.displayFan();
    }
}