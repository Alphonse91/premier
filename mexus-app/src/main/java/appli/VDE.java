package appli;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;

public class Vde extends JFrame implements ActionListener {
	public Vde() {
		setSize(600,300);
		setTitle("Deux_bouton");
		JButton bouton = new JButton("emploi");
		JButton bien= new JButton("village");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(bien);
		c.add(bouton);
		bouton.addActionListener(this);
		
		bien.addActionListener(this);
		
		}
        
public void actionPerformed(ActionEvent e) {
	
	Object non= e.getSource();
	
	//System.out.println (non) ;
	//System.out.print(e.getActionCommand());
	if ( "village" == e.getActionCommand() ) {
	 System.out.println (" nous somme ") ;
	}
	if ( "emploi"  == e.getActionCommand() ) { 
	 System.out.println (" au village de l emploi ") ;
	}
}

private  JButton bouton , bien ;
}

