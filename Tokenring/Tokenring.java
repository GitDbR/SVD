import java.util.*;
public class Tokenring{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter of nodes you want in the ring");
         int n = sc.nextInt();
         System.out.println("Ring formed is as below");
         for(int i=0;i<n;i++){
            System.out.print(i+" ");
         }
         System.out.println("0");
         int choice = 0;
         do{
            
            System.out.println("enter sender");
            int sender =sc.nextInt();
            System.out.print("enter Receiver");
            int receiver=sc.nextInt();
            System.out.println("enetr data to send");
            int data = sc.nextInt();
            int token=0;
            System.out.print("token passing");
            for(int i=token ;i<sender;i++){
                System.out.print(" "+ i + " ->");
            }
            System.out.println(" " + sender);
            System.out.println("sender"+ sender + " sending data"+data);
            for(int i= sender ;i!=receiver ;i=(i+1)%n){
            System.out.println("data"+ data+" forwarded by :" + i);
            }
            System.out.println("receiver :"+ receiver + " received the data: "+ data);
            token =sender;
            System.out.print("do yoy want to send data again ? If yes enter 1 , If no enter 0: ");
            choice =sc.nextInt();

         }while(choice == 1 );
    }
}