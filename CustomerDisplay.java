import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 




import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JButton;
 
 
public class CustomerDisplay extends JPanel
{
   
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    public String[] columnNames = {"Nazwa", "Kolor", "Waga", "Lokalizacja", "Wartoœæ"};
    public DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    public JTable table = new JTable(model);
    RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
      
     
     
public CustomerDisplay()
{
    JScrollPane scrollPane = new JScrollPane(table);
    table.setRowSorter(sorter);
    panel.add(scrollPane);
    add(panel);
    
      
                                 
     
}
 
public void addRow(String Nazwa, String Kolor, String Waga, String Lokalizacja, String Wartoœæ)
{
    Object [] row = new Object [5];
    row[0] = Nazwa;
    row[1] = Kolor;
    row[2] = Waga;
    row[3] = Lokalizacja;
    row[4] = Wartoœæ;
    model.addRow(row);
}


                    

 
public void setData(Object obj, int row_index, int col_index)
{
    table.getModel().setValueAt(obj, row_index, col_index);
}


public int getSelectedRow() {
	return table.getSelectedRow();
} 

public void removeRow() {
	 model.removeRow(getSelectedRow());
	
}    

 
}