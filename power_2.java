public class power_2 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        if((n&n-1)==0) //checking the binary conversions of the integer to verify if it is a power of two
        return true;
        return false;
    }
    public static void main(String[] args){
        int n=1024;
        power_2 s= new power_2();
        boolean ans= s.isPowerOfTwo(n);
        System.out.println(ans);
    }
    
}
