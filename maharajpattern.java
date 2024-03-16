import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.imageio.ImageIO;
class maharajpattern
{
  public static void main(String[] args){
 File file = new File("C:\Users\Amey Deshpande\Desktop\JAVA\raje.jpg");
 try{
    BufferedImage image = ImageIO.read(file);
    for(int i=0;i<image.getHeight();i++){
    for(int j=0;image.getWidth();j++){
    Color clr = new Color(image);
    if((clr.getRed()==0) && (clr.getGreen()==0)&&(clr.getBlue()==0)){
    System.out.println("* ");
    }else{
        System.out.println(" ");         
}
}
System.out.println();    
}      
}catch(Exception e){
 System.out.println("Exception Occured");
}
}
}