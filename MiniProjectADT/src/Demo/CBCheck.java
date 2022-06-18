package Demo;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class CBCheck implements ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
   
        if(e.getStateChange()==ItemEvent.SELECTED)
        {              
              if(User.seatCount<5)
              {
              JCheckBox a = (JCheckBox) e.getSource();
              int x=Integer.parseInt(a.getText());
              System.out.println("seatcount:"+User.seatCount+" Seat:"+x);
              User.seatCount++;              
              }
              else
              {                                               
              JOptionPane.showMessageDialog(null,"You have selected more than your available seats.");           
              }
        }
        else
        {   
            try
            {
       
            User.seatCount--;
            }
            catch(Exception a)
            {
            }
        }            
    }                  
}
