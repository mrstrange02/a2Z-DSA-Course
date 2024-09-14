import java.util.Arrays;
import java.util.HashMap;

public class medium_array {

    //two sum problem
    //Brute  TC -O(N2)

    //a[]={2,6,5,8,11} target=14    a+b=14 what is that a and b

  static int twosum(int a[],int target)
    {
        //int a,b;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==j) continue;
                else if(a[i]+a[j]==target)
                {
                   return 1;
                }
                
            }
        }
        return 0;
    }

    //using hashmap
    static int[] twosum2(int a[],int target)
    {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int n=a[i];
            int more=target-n;
            if(mpp.containsKey(more))
            {
                ans[0]=mpp.get(more);
                ans[1]=i;
                
            }
             mpp.put(a[i],i);
        }
        return  ans;
        

    }

    //better solution

    static String twosum3(int a[],int target)
    {
        Arrays.sort(a);
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
          int sum=a[left]+a[right];
            if(sum==target)
            {
                return "yes";
            }
            else if(sum<target) left++;
            

            else right--;
        }
        return "NO";
    }


    //Sort array of 0s,1s,2s
    //better solution  
    //Tc-O(2N)

    static void sortarray(int a[])
    {
        
        int c0=0,c1=0,c2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0) c0++;
            else if(a[i]==1) c1++;
            else
            c2++;
              
        }

        for(int i=0;i<c0;i++) a[i]=0;
        for(int i=c0;i<c0+c1;i++) a[i]=1;
        for(int i=c0+c1;i<a.length;i++) a[i]=2;
    
        
    }

    //optimal solution using Dutch national flag Algorithm


public static void main(String []args)

{
    /*int t=14;
    int a[]={2,6,5,8,11};
    int j[]=twosum2(a,t);
        System.out.println(j[0]+" "+j[1]);*/


       /*  int a[]={2,6,5,11,8};
        int t=14;
        String s=twosum3(a,t);
        System.out.println(s);*/

        int a[]={0,2,1,2,2,1,0};
        sortarray(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    
}
    


}
