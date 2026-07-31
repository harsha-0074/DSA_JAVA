//Given an integer n, find the smallest positive integer x such that the factorial of x (i.e.,  x! ) contains at least n trailing zeroes.
public class fact_zero {
    public int  zero(int x){
        int count =0;
        while(x>0){
            x = x/5;
            count  = count+x;
        }
        return count;  
    }
    public int find(int n){
        int low =0;
        int high = 5*n;
        while(low<high){
        int mid = low+(high-low)/2;
        if(zero(mid)<n){
            low = mid+1;
        }else{
            high = mid;
        }
        }
        return low;
    }
    public static void main(String args[]){
        int n = 6;
     fact_zero fz = new fact_zero();
    System.out.println(fz.find(n));//output : 25
    }
}

