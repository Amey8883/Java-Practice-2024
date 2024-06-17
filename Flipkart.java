import java.util.Scanner;

abstract class Payment {
    abstract void findPayment(Payment obj);
}

class GooglePay extends Payment {
    String str = "Google Pay";

    @Override
    void findPayment(Payment obj) {
        GooglePay obj1 = (GooglePay) obj;
        System.out.println(obj1.str);
    }
}

class PhonePay extends Payment {
    String str = "Phone Pay";

    @Override
    void findPayment(Payment obj) {
        PhonePay obj1 = (PhonePay) obj;
        System.out.println(obj1.str);
    }
}

class AmazonPay extends Payment {
    String str = "Amazon Pay";

    @Override
    void findPayment(Payment obj) {
        AmazonPay obj1 = (AmazonPay) obj;
        System.out.println(obj1.str);
    }
}

public class Flipkart {
    public void payment() {
        System.out.println("1. Google Pay");
        System.out.println("2. Phone Pay");
        System.out.println("3. Amazon Pay");
        System.out.println("4. Cash on delivery");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an option: ");
        int opt = sc.nextInt();

        Payment obj;

        switch (opt) {
            case 1:
                obj = new GooglePay();
                obj.findPayment(obj);
                break;
            case 2:
                obj = new PhonePay();
                obj.findPayment(obj);
                break;
            case 3:
                obj = new AmazonPay();
                obj.findPayment(obj);
                break;
            case 4:
                System.out.println("Your cash ready");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public static void main(String[] args) {
        Flipkart obj = new Flipkart();
        obj.payment();
    }
}