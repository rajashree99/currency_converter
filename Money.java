/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author rajashree selvakumar
 */import java.util.Scanner;
abstract public  class Money {
abstract  void conversion();
     //void convert(){
       //  System.out.println("enter the currency to be convertred");
     //}
}
  
    class dollar extends Money{
        @Override
        public void conversion()
                
        {
            int dollar,rupees;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the dollar ");
            dollar =sc.nextInt();
            System.out.println("the corresponding amount in rupees"+dollar*70);
            System.out.println("enter the rupees ");
            rupees =sc.nextInt();
            System.out.println("the corresponding amount in dollar"+rupees/70);
           
        }
    }
    class yen extends Money{
        @Override
        public void conversion()
                
        {
            int yen,rupees;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the yen ");
            yen =sc.nextInt();
            System.out.println("the corresponding amount in rupees"+yen*80);
            System.out.println("enter the rupees ");
            rupees =sc.nextInt();
            System.out.println("the corresponding amount in dollar"+rupees/80);
           
        }
    }
    class euro extends Money{
        public void conversion()
                
        {
            int euro,rupees;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the euro ");
            euro =sc.nextInt();
            System.out.println("the corresponding amount in rupees"+euro*50);
            System.out.println("enter the rupees ");
            rupees =sc.nextInt();
            System.out.println("the corresponding amount in dollar"+rupees/50);
           
        }
    }
    class main{
    public static void main(String[] args) {
        // TODO code application logic here
         dollar d =new dollar();
         yen y =new yen();
         euro e =new euro();
         d.conversion();
         y.conversion();
         e.conversion();
         
         
       
              
        }
    }
    

