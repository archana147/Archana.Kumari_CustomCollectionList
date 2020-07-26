import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Custom_CollectionList {

	public static void main(String[] args) {

		ArrayList<Integer> listobj=new ArrayList<Integer>(50);
		boolean ch = true;
		Scanner sc =  new Scanner(System.in);
		int c,input,flag=1;
		listobj.add(10);
		listobj.add(20);
		listobj.add(30);
		listobj.add(40);
		listobj.add(50);
		listobj.add(60);
		listobj.add(70);
		listobj.add(80);
		listobj.add(90);
		listobj.add(100);
		System.out.println(listobj);
                System.out.println("1.Insert\n2.Delete\n3.Search\n4.Print\n5.exit");
		System.out.print("Enter your choice :");
		if(ch==true)
			{   c = sc.nextInt();
				switch(c)
				{
				case 1:		System.out.print("Enter the number to be added: ");
						input= sc.nextInt();
						listobj.add(input);
						System.out.println(" Number  added: ");
						break;
				case 2: input=sc.nextInt();
					for(int i=0;i<listobj.size();i++){
						if(listobj.get(i)==input){
							listobj.remove(i);
							System.out.println("Number  removed Successfully");
						        flag=0;
                                                       
							  }
							}
						if (flag==1)

						{System.out.println("Number is not present in the list");}
						
						break;
                                 case 3:  input=sc.nextInt();
					  for(int i=0;i<listobj.size();i++){
						if(listobj.get(i)==input){
						flag=0;
						System.out.println("Number is present in the list");
                                        
				                      }
                                	            }
						if (flag==1)

						{System.out.println("Number is not present in the list");}
						
					   break;

				case 4:System.out.println("The data present in the list : ");
						System.out.println(listobj);
						System.out.println();
						break;
				
				case 5:   sc.close();
						return;
						
			   default:	System.out.println("Invalid choice");
				   	
						
				}
				
     		System.out.println("If you want to continue ,type true");
		ch=sc.nextBoolean();
                
		
			}
else {
 System.exit(0); }
		
		
	}
}
