class Meta{
    String companyName;
    String owner;

    Meta(String companyName,String owner)
    {
        this.companyName=companyName;
        this.owner=owner;
    }

    void displayMeta()
    {
        System.out.println("****META DETAILS****");
        System.out.println("Company Name: "+companyName);
        System.out.println("Owner: "+owner);
    }
}

class Instagram extends Meta{
    String applicationName;
    String typeIn;
    double noOfUsersIn;

    Instagram(String applicationName,String typeIn,double noOfUsersIn,String companyName,String owner)
    {
        super(companyName,owner);
        this.applicationName=applicationName;
        this.typeIn=typeIn;
        this.noOfUsersIn=noOfUsersIn;
    }

    void displayInstagram()
    {
        System.out.println("****INSTAGRAM DETAILS****");
        System.out.println("Application Name: "+applicationName);
        System.out.println("Application type: "+typeIn);
        System.out.println("No of users in the Application: "+noOfUsersIn+" billion");
        
    }
}

class Facebook extends Meta{
    String applicationNameFb;
    String typeFb;
    double noOfUsersFb;

    Facebook(String applicationNameFb,String typeFb,double noOfUsersFb,String companyName,String owner)
    {
        super(companyName,owner);
        this.applicationNameFb=applicationNameFb;
        this.typeFb=typeFb;
        this.noOfUsersFb=noOfUsersFb;
    }

    void displayFacebook()
    {
        System.out.println("****FACEBOOK DETAILS****");
        System.out.println("Application Name: "+applicationNameFb);
        System.out.println("Application type: "+typeFb);
        System.out.println("No of users in the Application: "+noOfUsersFb+" billion");
        
    }
}

class MetaDriver{
    public static void main(String[] args) {
        Instagram obj = new Instagram("Instagram","Social Media",2.0,"Meta","Amey");
        obj.displayMeta();
        obj.displayInstagram();
        System.out.println();
        Facebook obj1 = new Facebook("Facebook","Social Media",1.036,"Meta","Amey");
        obj1.displayMeta();
        obj1.displayFacebook();
    }
}