import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Zadanie17 {

	private JTextArea text = new JTextArea();
	private String title = "Simple editor - ";
	private String currentFile = "Untitled";
	private JFrame jf = new JFrame();
	//private File file;

	public static void main(String[] args) {
		new Zadanie17().edytor();
	}

	public void edytor() {

		jf.setTitle(title + currentFile);

		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JFrame frame = (JFrame) e.getSource();

				int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?",
						"Exit Editor", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION)
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		
		jf.setJMenuBar(createMenuBar());
		jf.add(text);
		jf.setVisible(true);
		jf.setPreferredSize(new Dimension(800, 600));
		jf.pack();
	}

	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		String[] names = { "File", "Edit", "Options" };

		for (int i = 0; i < names.length; i++) {
			if (i == 0) {
				JMenu menu = new JMenu(names[i]);
				final JFileChooser fc = new JFileChooser();
				JMenuItem open = new JMenuItem("Open");

				open.addActionListener(e -> {
					if (fc.showOpenDialog(menu) == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						try {
							BufferedReader reader = new BufferedReader(new FileReader(file));
							text.read(reader, null);
							currentFile = file.getName();
							jf.setTitle(currentFile);
						} catch (IOException z) {
							Toolkit.getDefaultToolkit().beep();
						}
					}
				});
				open.setBorder(BorderFactory.createRaisedBevelBorder());
				open.setAccelerator(KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
				open.setMnemonic(KeyEvent.VK_O);
				menu.add(open);

				JMenuItem save = new JMenuItem("Save");
				save.addActionListener(e -> {
					if (!currentFile.equals("Untitled")) {
						File file = fc.getSelectedFile();
						try {
							FileWriter writer = new FileWriter(file);
					        text.write(writer);
					        writer.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}

					} else {
						if (fc.showSaveDialog(menu) == JFileChooser.APPROVE_OPTION) {
							File file = fc.getSelectedFile();
							file = fc.getSelectedFile();
							try {
								FileWriter writer = new FileWriter(file);
					            text.write(writer);
					            writer.close();
								currentFile = file.getName();
								jf.setTitle(title + currentFile);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}
				});
				save.setBorder(BorderFactory.createRaisedBevelBorder());
				save.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
				save.setMnemonic(KeyEvent.VK_S);
				menu.add(save);

				JMenuItem saveAs = new JMenuItem("Save As");
				saveAs.addActionListener(e -> {
					if (fc.showSaveDialog(menu) == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						       try {
					                file = fc.getSelectedFile();
					                FileWriter writer = new FileWriter(file);
					                text.write(writer);
					                writer.close();
					            } catch (Exception ex) {
					                ex.printStackTrace();
					            }
					}
				});
				saveAs.setBorder(BorderFactory.createRaisedBevelBorder());
				saveAs.setAccelerator(
						KeyStroke.getKeyStroke('A', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
				saveAs.setMnemonic(KeyEvent.VK_A);
				menu.add(saveAs);
				JMenuItem red = new JMenuItem("");
				red.add(new MyPanel());
				red.setBorder(BorderFactory.createRaisedBevelBorder());
				menu.add(red);

				JMenuItem exit = new JMenuItem("Exit");
				exit.addActionListener(e -> System.exit(0));
				exit.setBorder(BorderFactory.createRaisedBevelBorder());
				exit.setAccelerator(KeyStroke.getKeyStroke('X', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
				exit.setMnemonic(KeyEvent.VK_X);
				menu.add(exit);

				menuBar.add(menu);
			}

			if (i == 1) {
				JMenu menu = new JMenu(names[i]);
				JMenu menu1 = new JMenu("Adresy");
				menu1.setBorder(BorderFactory.createRaisedBevelBorder());
				String[] adresses = { "Dom", "Szko³a", "Praca" };
				String[] list = { "adres domowy", "adres szko³y", "adres pracy" };
				char[] letters = { 'D', 'S', 'P' };
				int [] key = {KeyEvent.VK_D, KeyEvent.VK_S, KeyEvent.VK_P};
				for (int j = 0; j < adresses.length; j++) {
					JMenuItem mItem = new JMenuItem(adresses[j]);
					String z = list[j];
					mItem.addActionListener(e -> text.insert(z, text.getCaretPosition()));
					mItem.setBorder(BorderFactory.createRaisedBevelBorder());
					mItem.setAccelerator(
							KeyStroke.getKeyStroke(letters[j], java.awt.Event.CTRL_MASK | java.awt.Event.SHIFT_MASK));
					mItem.setMnemonic(key[j]);
					menu1.add(mItem);
				}
				menu.add(menu1);
				menuBar.add(menu);
			}

			if (i == 2) {
				JMenu menu = new JMenu(names[i]);
				String[] menu1 = { "Foreground", "Background", "Font size" };
				String[] itemColors = { "Blue", "Yellow", "Orange", "Red", "White", "Black", "Green" };
				Color[] colors = { Color.BLUE, Color.YELLOW, Color.ORANGE, Color.RED, Color.WHITE, Color.BLACK,
						Color.GREEN };
				int[] size = { 8, 10, 12, 14, 16, 18, 20, 22, 24 };

				for (int a = 0; a < menu1.length; a++) {
					JMenu mItem = new JMenu(menu1[a]);
					mItem.setBorder(BorderFactory.createRaisedBevelBorder());
					if (a <= 1) {
						for (int b = 0; b < itemColors.length; b++) {
							JMenuItem colorItem = new JMenuItem(itemColors[b]);
							colorItem.setBorder(BorderFactory.createRaisedBevelBorder());
							colorItem.setIcon(new colorIcon(colors[b]));
							if (a == 1) {
								int m = b;
								colorItem.addActionListener(e -> text.setBackground(colors[m]));
							} else {
								int m = b;
								colorItem.addActionListener(e -> text.setForeground(colors[m]));
							}
							mItem.add(colorItem);
						}

					} else {
						for (int c = 0; c < size.length; c++) {
							JMenuItem font = new JMenuItem(size[c] + " pts");
							font.setBorder(BorderFactory.createRaisedBevelBorder());
							int s = c;
							font.addActionListener(e -> text.setFont(new Font("SensSarif", Font.PLAIN, size[s])));
							mItem.add(font);
						}
					}
					menu.add(mItem);
				}

				menuBar.add(menu);
			}
		}

		return menuBar;
	}

	public void setName(String fileName) {
		fileName = this.currentFile;
	}

	public class MyPanel extends JPanel {

		MyPanel() {

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			int width = 100;
			int height = 2;

			g.setColor(Color.red);
			g.fillRect(0, 0, width, height);
		}
	}

	public class colorIcon implements Icon {

		private int r = 10;
		private Color color;

		public colorIcon(Color color) {
			this.color = color;
		}

		@Override
		public int getIconHeight() {
			return r;
		}

		@Override
		public int getIconWidth() {
			return r;
		}

		@Override
		public void paintIcon(Component c, Graphics g, int x, int y) {
			Color colour = g.getColor();
			g.setColor(color);
			g.fillOval(x, y, getIconWidth(), getIconHeight());
			g.setColor(colour);
		}

	}
}
