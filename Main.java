
package billing.program.Billingprogram;

import javax.swing.*;

public class Main{
    
    public static void main(String[] args){
        //variables for the varying parameters
        double a,b,c;
        
        //object for calculating daytime cost
        Parent day = new Parent();
        day.time = " between six am to six pm";
        day.c = 4.00;
        
        day.computeGross();
        a = day.sum3;
        
        //object for calculating nighttime cost
        Parent night = new Parent();
        night.time = " between six pm to six am";
        night.c = 3.00;
        
        night.computeGross();
        b = night.sum3;
        
        //object for calculating cost to other networks
        Parent other = new Parent();
        other.time = " to other networks";
        other.c = 5.00;
        
        other.computeGross();
        c = other.sum3;
        //gross
        double gross = a+b+c;
        JOptionPane.showMessageDialog(null,"The total bill for this customer is " +gross );
    }
}
