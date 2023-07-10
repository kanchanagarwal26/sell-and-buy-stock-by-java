import java.util.*;

public class Buy_and_sell_stock {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many prices u want to store");
        int n=sc.nextInt();
        System.out.println("enter prices");
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
       int  buy_price= Integer.MAX_VALUE;
       int maxprofit=0;
       
       for(int i=0;i<n;i++){
       if( buy_price<prices[i]){
        int profit=prices[i]-buy_price;
        maxprofit=Math.max(maxprofit, profit);
        
       }
       else{
        buy_price=prices[i];
       }
      
        
       }
        System.out.println("max profit is :"+maxprofit);
    }
    
}
