public class power_three {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        double a= Math.log10(n)/Math.log10(3);
        if(a%1==0)
            return true;
            
        return false;
    }
    public static void main(String[] args){
        int n=243;
        power_three s= new power_three();
        boolean ans= s.isPowerOfThree(n);
        System.out.println(ans);
    }
    
}
