package it.unisalento.pps.progettoEsame.view.render;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

public class ImmaginiListCellRender implements ListCellRenderer {
	
	
	
	public Component getListCellRendererComponent (JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
		
		JLabel label = (JLabel) value;
		
		if (isSelected){
		label.setBackground(list.getSelectionBackground());
		label.setForeground(list.getSelectionForeground());
		}else{			
			label.setBackground(list.getBackground());
			label.setForeground(list.getForeground());
		}
	
		label.setEnabled (list.isEnabled ());
		label.setOpaque(true);
	
		Border brd = BorderFactory.createEmptyBorder (5, 5, 5, 5);
		label.setBorder(brd);
	
		return label;
	
	}

}
