package ItemListenerEvent;

import java.awt.*;
import java.awt.event.*;

public class ItemEventExample implements ActionListener, ItemListener {
    Frame frm = new Frame("Item Event");
    Panel p = new Panel();
    Label l1, l2, l3, l4, l5;
    TextField tf1, tf2, tf3, tf4, tf5;
    Checkbox cb = new Checkbox("Click to Enable Result Button");
    Button b1, b2;

    ItemEventExample() {
        frm.setSize(600, 400);
        frm.setVisible(true);
        frm.add(p);
        p.setLayout(new GridLayout(7, 2));

        l1 = new Label("Enter First Number : ");
        l2 = new Label("Enter Second Number : ");
        l3 = new Label("Enter Third Number : ");
        l4 = new Label("SUM of three Number : ");
        l5 = new Label("Average of three Number : ");

        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();
        tf5 = new TextField();

        b1 = new Button("Exit");
        b2 = new Button("SHOW RESULT");

        b2.setVisible(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        cb.addItemListener(this);

        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(l3);
        p.add(tf3);
        p.add(l4);
        p.add(tf4);
        p.add(l5);
        p.add(tf5);
        p.add(b1);
        p.add(cb);
        p.add(b2);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == cb && cb.getState() == true) {
            b2.setVisible(true);
        } else {
            b2.setVisible(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == b2) {
            int a = Integer.parseInt(tf1.getText().toString());
            int b = Integer.parseInt(tf2.getText().toString());
            int c = Integer.parseInt(tf3.getText().toString());
            int sum;
            double avg;

            sum = a + b + c;
            avg = sum / 3f;

            String resSum = String.valueOf(sum);
            String resAvg = String.valueOf(avg);

            tf4.setText(resSum);
            tf5.setText(resAvg);
        }

        if (e.getSource() == b1) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        ItemEventExample iee = new ItemEventExample();
    }

}
