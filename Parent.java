
package billing.program.Billingprogram;

import javax.swing.*;

public class Parent {
    
    int n,i;
    double d,c;
    double total;
    double total2=0;
    double sum1=0,sum2=0,sum3;
    double gSum;
    String N,D,time;
    
    
    public void inputData(){
        N=JOptionPane.showInputDialog("Please enter the number of calls made" +time);
        n = Integer.parseInt(N);
    }
    public void inputData2(){
        D = JOptionPane.showInputDialog("Please enter the duration of call " +(i+1) +" in minutes " );
        d = Double.parseDouble(N);
    }
    public double computeGross(){
        inputData();
        for(i=0;i<n;i++){
            inputData2();
            if(d<=2.0){
                total = d*c;
                sum1+=total;
            }
            else{
                total = d*c;
                total2 = total+(0.16*total);
            }
            sum2+=total2;
    }
        
       sum3=sum1+sum2;  
       return sum3;
  }
}
