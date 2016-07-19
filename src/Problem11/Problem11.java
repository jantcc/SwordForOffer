package Problem11;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public double power(double base,int exponent) throws Exception{
    	double res=0.0;
    	if(equal(base,0.0)&&exponent<0){
    	    throw new Exception("³ö´í!");
    	}
    	if(equal(exponent,0)){
    		return 1.0;
    	}
    	if(exponent<0){
    		res = powerwithunsignedexponent(1.0/base,-exponent);
    	}else {
    		res = powerwithunsignedexponent(base,exponent);
    	}
    	return res;
    }
    private double powerwithunsignedexponent(double base,int absexponent){
    	double res = 1.0;
    	for(int i =0; i< absexponent;i++){
    		res*=base;
    	}
    	return res;
    }
    private boolean equal(double num1,double num2)
	{
		if((num1-num2>-0.0000001)&&num1-num2<0.0000001)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
