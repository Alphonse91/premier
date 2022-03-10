import java.util.Date;
class date{
  public static void main(String[] args){
   Date call = new Date();
   String jour=" ";
   switch(call.getDay()){
   case 0 : jour= " lundi " ; break ;
   case 1 : jour= "mardi " ; break ;
   case 2 : jour= "mecredi " ; break ;
   case 3 : jour= " jeudi " ; break ;
   case 4 : jour= " vendredi " ; break ;
   case 5 : jour= " samedi " ; break ;
   case 6 : jour= " dimanche " ; break ;

  }
System.out.println ( " aujourd hui est le : " + jour );
System.out.println ( " nous somme aussi au " + call.getMonth() +" mois de l annee" );

 }
}
