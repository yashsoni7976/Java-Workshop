package ItemListenerEvent;
import java.awt.*;
import java.awt.event.*;

public class ILECheckbox implements ItemListener, ActionListener{
    Checkbox cb1,cb2;
    Frame frm = new Frame("AWT Component - ITEM Listener");
    Panel p = new Panel();
    Panel p1 = new Panel();
    Panel p2= new Panel();
    Panel p3= new Panel();
    Panel p4= new Panel();
    Button b = new Button("EXIT");
    Label lbl1 = new Label();
    Label lbl2 = new Label();
    Label lbl3 = new Label();
    Choice ch = new Choice();

    List l = new List();

    ILECheckbox(){
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.MAGENTA);
        frm.setSize(400,400);
        frm.setVisible(true);
        frm.add(p1);
        frm.add(p2);
        frm.add(p3);
        frm.add(p4);
        frm.setLayout(new GridLayout(4,1));
        cb1 = new Checkbox("Male", false);
        cb1.addItemListener(this);
        cb2 = new Checkbox("Female", false);
        cb2.addItemListener(this);
        p1.add(cb1);
        p1.add(cb2);
        p1.add(lbl1);

        ch.addItem("Choice Item 1");
        ch.addItem("Choice Item 2");
        ch.addItem("Choice Item 3");
        ch.addItemListener(this);
        p2.add(ch);
        p2.add(lbl2);

        l.add("List 1");
        l.add("List 2");
        l.add("List 3");
        l.add("List 4");
        l.addItemListener(this);
        p3.add(l);
        p3.add(lbl3);

       
        p4.add(b);
        b.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==b)
        {
            System.exit(0);
        }
    }

    
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==cb1 && cb1.getState()==true){
            lbl1.setText(cb1.getLabel());
            cb2.setState(false);
        }
        else if(e.getSource()==cb2 && cb2.getState()==true){
            lbl1.setText(cb2.getLabel());
            cb1.setState(false);
        }

        if(e.getSource()==ch)
        {
            lbl2.setText(ch.getSelectedItem());
        }

        if(e.getSource()==l)
        {
            lbl3.setText(l.getSelectedItem());
        }
       
    }
    

public static void main(String[] args){
    ILECheckbox ile = new ILECheckbox();
}
}
