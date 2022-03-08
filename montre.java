public class montre {  
 public static void main( String [] args){
   int [] chronot= {13,45};
   int min [] = new int [60] ;

   int h [] = new int [24];
   int k;
   int j;
   for (k=0 ,j=0; k<=min.length && j<=h.length; k++ ,j++) {
	if (k== chronot[0] && j== chronot[1] ) {
        	System.out.println (" il est : " + k + "H" + j + " minute ") ;
	}
      }
     }
 }
