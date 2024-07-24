package control;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class FuncoesUteis {
    
    public static Date strToDate( String strDt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.parse(strDt);
    }
    
    public static String dateToStr( Date dt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.format(dt);
    }
    
     public static String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (java.util.Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            
            if (button.isSelected()) {
                return button.getActionCommand();
            }
        }
        return null;
    }
    
}
