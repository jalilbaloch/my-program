public class PrimeExample{
    
	public static void main(String args[]){
	
	    int i,m=0,flag=0;
		
		int n=5;
		m=n/2;
		
		if(n==0 ||n==1){
		
		    System.out.println(n+" This is Not Prime Number");
		
        }else{
          
            for(i=2;i<=m;i++) {
                
                if(n%i==0){
                 
			System.out.println(n+" This is not Prime Number");
                  flag=1;
                  break;
                }
			}

            if(flag==0){ 
		    System.out.println(n+"TThis  is Prime Number"); }
        }
    }
}	
