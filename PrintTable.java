import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 





import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.*;
import java.awt.*;
 
 
class Buttons extends JPanel
{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JTable table = new JTable();
    private JButton addButton = new JButton("Dodaj");
    private JButton deleteButton = new JButton("Usuñ");
    private JTextField jtfFilter = new JTextField();
    private JButton jbtFilter = new JButton("Filter");
    RowSorter<TableModel> sorter = new TableRowSorter<TableModel>();
    
 
    public Buttons()
    {  
        panel.setLayout(new FlowLayout());
        panel.add(addButton);
        panel.add(deleteButton);
        add(panel);
        panel.add(new JLabel("Specify a word to match:"),
                BorderLayout.WEST);
        panel.add(jtfFilter, BorderLayout.CENTER);
        
         
    }
 
     public void addInfoBtnAddActionListener(ActionListener listener)
    {
        addButton.addActionListener(listener);
           
    }
     
     public void deleteInfoBtnAddActionListener(ActionListener listener)
     {
    	 deleteButton.addActionListener(listener);
            
     }
   
}
 
 class FirstProject extends JPanel
{ 
  
    Buttons buttons = new Buttons();
    CustomerInformation customer = new CustomerInformation();
    CustomerDisplay display = new CustomerDisplay();
     
    public FirstProject()
    {
        JPanel panel = new JPanel();       
        panel.setLayout(new BorderLayout());
        panel.add(buttons, BorderLayout.NORTH);
        panel.add(customer, BorderLayout.CENTER);
        panel.add(display, BorderLayout.SOUTH);
         
        add(panel);
         
        // Akcja dodania rekordu
        buttons.addInfoBtnAddActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	String Nazwa = customer.getNazwa();
                String Kolor = customer.getKolor();
                String Waga = customer.getWaga();
                String Lokalizacja = customer.getLokalizacja();
                String Wartoœæ = customer.getWartoœæ();
                 
                display.addRow(Nazwa, Kolor, Waga, Lokalizacja, Wartoœæ);
            }
        });
        
        // Akcja usuniecia rekordu
        buttons.deleteInfoBtnAddActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        	
            try{
                display.removeRow();
                }catch(Exception ex)
                {
                 JOptionPane.showMessageDialog(null, ex);
                }
                }	
        });
        
     
 
    }
}
 

 
  class CustomerInformation extends JPanel
{
   
    JPanel panel = new JPanel();
    // Deklaracja pol typu "JLabels" 
    private JLabel label1 = new JLabel("Nazwa");
    private JLabel label2 = new JLabel("Kolor");
    private JLabel label3 = new JLabel("Waga");
    private JLabel label4 = new JLabel("Lokalizacja");
    private JLabel label5  = new JLabel("Wartoœæ");
     
    // Deklaracja pol typu "JTextFields"
    private JTextField text1 = new JTextField(10);
    private JTextField text2 = new JTextField(10);
    private JTextField text3 = new JTextField(10);
    private JTextField text4 = new JTextField(10);
    private JTextField text5 = new JTextField(10);
     
     
     
    public CustomerInformation()
    { 
         
        // Utworzenie kolumn
        panel.setLayout( new GridLayout(5, 2));
         
        // Dodawanie rekordów do panelu
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(label3);
        panel.add(text3);
        panel.add(label4);
        panel.add(text4);
        panel.add(label5);
        panel.add(text5);
         
         
        add(panel);     
    
    }
    /// Pobieranie zmiennych
    public String getNazwa()
    {
        return text1.getText();
    }
     
    public String getKolor()
    {
        return text2.getText();
    }
     
    public String getWaga()
    {
        return text3.getText();
    }
     
    public String getLokalizacja()
    {
        return text4.getText();
    }
     
     public String getWartoœæ()
    {
        return text5.getText();
    }
     
     
     
}