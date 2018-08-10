import java.awt.*;
import javax.swing.*;

public class Zadanie18 {

	public static void main(String[] args) {
		new Zadanie18().quadraticEq();
	}

	private void quadraticEq() {

		JFrame jf = new JFrame();

		GridBagLayout lay = new GridBagLayout();

		GridBagConstraints c = new GridBagConstraints();

		jf.setLayout(lay);

		JLabel result = new JLabel(" ", SwingConstants.CENTER);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		jf.add(result, c);

		JTextField x1 = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		x1.setToolTipText("Enter a");
		jf.add(x1, c);
		
		JTextField x2 = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridwidth = 1;
		x2.setToolTipText("Enter b");
		jf.add(x2, c);
		
		JTextField x3 = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridwidth = 1;
		x3.setToolTipText("Enter c");
		jf.add(x3, c);

		JButton solve = new JButton("Solve");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 4;
		solve.addActionListener(e -> {
			String str[] = { x1.getText(), x2.getText(), x3.getText() };
			double[] val = new double[3];
			int count = 0;
			try {
				for (int i = 0; i < str.length; i++) {
					boolean isNum = str[i].chars().allMatch(Character::isDigit);
					if (isNum) {
						val[i] = Double.parseDouble(str[i]);
						count += 1;
					} else {
						result.setText("Number format error");
						result.setBackground(Color.RED);
						result.setOpaque(true);
					}
				}
					if (count == 3) {
						if (val[0] == 0) {
							result.setText("Not a quadratic equation");
							result.setBackground(Color.RED);
							result.setOpaque(true);
						}
						else {
							solving(val, result);
							result.setForeground(Color.BLUE);
						}
					}
			} catch (NumberFormatException e1) {
				System.out.println("ups, nie ma liczby jakiejœ");
			}
		});
		jf.add(solve, c);

		JButton clear = new JButton("Clear");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 3;
		clear.addActionListener(e -> {
			x1.setText(null);
			x2.setText(null);
			x3.setText(null);
		});

		jf.add(clear, c);

		jf.setTitle("Quadratic Equation");

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setResizable(false);

		jf.setVisible(true);

		jf.setPreferredSize(new Dimension(320, 120));
		
		jf.pack();
	}

	public void solving(double[] val, JLabel label) {

		double var1 = (double) val[0];
		double var2 = (double) val[1];
		double var3 = (double) val[2];

		double result = var2 * var2 - 4.0 * var1 * var3;

		if (result > 0.0) {
			double r1 = (-var2 + Math.pow(result, 0.5)) / (2.0 * var1);
			double r2 = (-var2 - Math.pow(result, 0.5)) / (2.0 * var1);
			label.setText("x1 = " + r1 + ", x2 = " + r2);
		} else if (result == 0.0) {
			double r1 = -var2 / (2.0 * var1);
			label.setText("x = " + r1);
		} else {
			label.setText("Brak rozwi¹zañ");
		}
	}
}
