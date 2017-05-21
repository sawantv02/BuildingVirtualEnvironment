package Q5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q5TextPanel extends JPanel implements ActionListener {

	protected JTextField tf1;
	protected JTextField tf2;
	protected JTextField tf3;
	protected JTextField tf4;
	protected JButton button;

	public Q5TextPanel() {
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		tf3 = new JTextField(15);
		tf4 = new JTextField(15);

		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);

		button = new JButton("Create pi chart");
		add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int t1=Integer.parseInt(tf1.getText());
		int t2=Integer.parseInt(tf1.getText());
		int t3=Integer.parseInt(tf1.getText());
		int t4=Integer.parseInt(tf1.getText());
		Q5Panel panel=new Q5Panel();
		panel.repaint();

	}

}
