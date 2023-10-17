import java.util.Scanner;
 class student {
        Scanner sc=new Scanner(System.in);
        String[] sub=new String[100];
        int[] marks=new int[100];
        int i,n;
        void get()
        {
        System.out.println("enter the number of subjects");        
        n=sc.nextInt();                
        System.out.println("enter the subjects");
        for(i=0;i<n;i++)
        {
         sub[i]=sc.nextLine();  
        }
        System.out.println("enter the marks");
        for(i=0;i<n;i++)
        {
        marks[n]=sc.nextInt();
        }
        }
}

