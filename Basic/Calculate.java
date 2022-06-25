public class Calculate
{
	int sum(int a,int b){
        return a+b;
}		

public static void main(String[] args) {
         
        Calculate obj = new Calculate();
        int c = obj.sum(5,4);
        System.out.println(c);
    }
}