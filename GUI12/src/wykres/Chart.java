package wykres;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.*;

import javax.script.*;
import javax.swing.*;

public class Chart extends JPanel {

	private boolean hover = false;
	double[] values;
	String[] eq = new String[1];
	int mouseX = 0;
	int mouseY = 0;

	public Chart(double[] values2, String[] eq) {
		this.values = values2;
		this.eq = eq;
		addMouseListener(mouse);
		addMouseMotionListener(mouse);
	}

	MouseAdapter mouse = new MouseAdapter() {

		@Override
		public void mouseEntered(MouseEvent e) {
			hover = true;
		}

		@Override
		public void mouseExited(MouseEvent e) {
			hover = false;
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			mouseX = e.getX();
			mouseY = e.getY();
			repaint();
		}
	};

	public ArrayList<Integer> getValues(String s) {

		ArrayList<String> last = new ArrayList<String>();
		last.add(s);

		Matcher minus = Pattern.compile("-[Xx]").matcher(last.get(0));
		if (minus.find()) {
			String temp = last.get(0).replaceAll("-x", "-1x");
			last.set(0, temp);
		}
		Matcher first = Pattern.compile("^[Xx]").matcher(last.get(0));
		if (first.find()) {
			String temp = last.get(0).replaceFirst("x", "1x");
			last.set(0, temp);
		}

		Matcher plus = Pattern.compile("\\+[Xx]").matcher(last.get(0));
		if (plus.find()) {
			String temp = last.get(0).replaceAll("\\+x", "+1x");
			last.set(0, temp);
		}

		Matcher power = Pattern.compile("[+-]?\\d+[Xx]\\^\\d").matcher(last.get(0));
		Matcher multix = Pattern.compile("[+-]?\\d+[Xx][+-]").matcher(last.get(0));
		Matcher endval = Pattern.compile("[+-]\\d+$").matcher(last.get(0));

		ArrayList<Integer> values = new ArrayList<Integer>();

		while (power.find()) {
			String temp = power.group(0);
			Matcher fi = Pattern.compile("^[+-]?\\d").matcher(temp);
			fi.find();
			values.add(Integer.parseInt(fi.group()));
		}

		while (multix.find()) {
			String temp = multix.group();
			Matcher fi = Pattern.compile("^[+-]?\\d").matcher(temp);
			fi.find();
			values.add(Integer.parseInt(fi.group()));
		}

		while (endval.find()) {
			values.add(Integer.parseInt(endval.group()));
		}

		return values;
	}

	public double quickMathz(double x) {
		ArrayList<Integer> vals = getValues(Zadanie19.func.getText());

		double result = 0;
		double power = vals.size() - 1;
		for (int i = 0; i <= vals.size() - 2; i++) {
			result += Math.pow(x, power) * vals.get(i);
			power--;
		}
		result += vals.get(vals.size() - 1);
		return result;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		if (values[0] != 0 && values[1] != 0 && values[2] != 0 && values[3] != 0) {
			double osx = getWidth() / (Math.abs(values[0]) + Math.abs(values[1]));
			double osy = getHeight() / (Math.abs(values[2]) + Math.abs(values[3]));

			Line2D xline = new Line2D.Double(0, Math.abs(values[3] * osy), getWidth(), Math.abs(values[3] * osy));
			Line2D yline = new Line2D.Double(Math.abs(values[0] * osx), 0, Math.abs(values[0] * osx), getHeight());

			g2.setColor(Color.BLUE);
			g2.draw(xline);
			g2.draw(yline);

			if (Zadanie19.func.getText().length() > 0) {

				double valuex = (double) getHeight() / (double) getWidth();
				int varx = 0;
				double x = 0;
				int[] polyx = new int[(int) Math.floor((getWidth() / valuex))];
				int[] polyy = new int[(int) Math.floor((getWidth() / valuex))];

				ArrayList<Double> xs = new ArrayList<Double>();

				double minval = Double.parseDouble(Zadanie19.xmin.getText());
				double interval = (Math.abs(values[0]) + Math.abs(values[1])) / (getWidth() / valuex);
				for (int i = 0; i <= polyx.length; i++) {
					xs.add(minval);
					minval += interval;

				}

				for (int i = 0; i < polyx.length; i++) {
					polyx[i] = (int) x;
					polyy[i] = (int) (getHeight() - (Math.abs(values[2] * osy))
							- Integer.valueOf((int) Math.floor(quickMathz(xs.get(i)) * osy)));
					x += valuex;
				}

				g2.setColor(Color.RED);
				g2.drawPolyline(polyx, polyy, polyx.length);

				if (hover) {
					for (int i = 0; i < getHeight(); i++) {
						if (mouseX == polyx[i] && mouseY == polyy[i]) {
							Line2D posx = new Line2D.Double(mouseX, mouseY, mouseX, Math.abs(values[3] * osy));
							Line2D posy = new Line2D.Double(mouseX, mouseY, Math.abs(values[0] * osx), mouseY);

							g2.setColor(Color.BLACK);
							g2.draw(posx);
							g2.draw(posy);

							DecimalFormat df = new DecimalFormat();
							df.setMaximumFractionDigits(1);

							if (mouseX * osx >= Math.abs(values[0] * osx)) {
								double xval = (double) (mouseX / osx) + values[0];
								g2.drawString(df.format(xval), mouseX, (int) (Math.floor(osy * values[3])));
							} else {
								double xval = (double) (mouseX / osx) + values[0];
								g2.drawString(df.format(xval), mouseX, (int) (Math.floor(osy * values[3])));
							}

							if (mouseY * osy >= Math.abs(values[2] * osy)) {
								double yval = (double) ((mouseY / osy) - values[3]) * -1;
								g2.drawString(df.format(yval), (int) (Math.floor(Math.abs(values[0] * osx))), mouseY);
							} else {
								double yval = (double) ((mouseY / osy) - values[3]) * -1;
								g2.drawString(df.format(yval), (int) (Math.floor(Math.abs(values[0] * osx))), mouseY);
							}
						}
					}
				}

			}
		}
	}
}