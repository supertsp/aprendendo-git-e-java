//<editor-fold defaultstate="collapsed" desc="initial program settings...">

import java.awt.Color;
import java.awt.Font;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Exercicio3F {

	public static void main(String[] args) {
// </editor-fold>
		// Your code starts here :)
		
		Integer numeroA = readInteger("Digite o valor do número A");
		Integer numeroB = readInteger("Digite o valor do número B");
		Integer numeroC = readInteger("Digite o valor do número C");
		
		String auxMensagem = 
				"EXIBIÇÃO DOS VALORES\n"
				+ "Ordem original: " + numeroA + ", " + numeroB + ", " + numeroC + "\n"
				+ "Ordem crescente: ";
		
		//CASO 1
		if (numeroC > numeroB && numeroB > numeroA) {
			auxMensagem = auxMensagem + numeroA + ", " + numeroB + ", " + numeroC + "\n";
		}
		
		//CASO 2
		if (numeroB > numeroC && numeroC > numeroA) {
			auxMensagem = auxMensagem + numeroA + ", " + numeroC + ", " + numeroB + "\n";
		}
		
		//CASO 3
		if (numeroC > numeroA && numeroA > numeroB) {
			auxMensagem = auxMensagem + numeroB + ", " + numeroA + ", " + numeroC + "\n";
		}
		
		//CASO 4
		if (numeroB > numeroA && numeroA > numeroC) {
			auxMensagem = auxMensagem + numeroC + ", " + numeroA + ", " + numeroB + "\n";
		}
		
		//CASO 5
		if (numeroA > numeroC && numeroC > numeroB) {
			auxMensagem = auxMensagem + numeroB + ", " + numeroC + ", " + numeroA + "\n";
		}
		
		//CASO 6
		if (numeroA > numeroB && numeroB > numeroC) {
			auxMensagem = auxMensagem + numeroC + ", " + numeroB + ", " + numeroA + "\n";
		}
		
		//CASO 7
		if (numeroC > numeroA && numeroA == numeroB) {
			auxMensagem = auxMensagem + numeroA + ", " + numeroB + ", " + numeroC + "\n";
		}
		
		//CASO 8
		if (numeroC == numeroB && numeroC > numeroA) {
			auxMensagem = auxMensagem + numeroA + ", " + numeroB + ", " + numeroC + "\n";
		}
		
		//CASO 9
		if (numeroA == numeroB && numeroA > numeroC) {
			auxMensagem = auxMensagem + numeroC + ", " + numeroA + ", " + numeroB + "\n";
		}	
		
		//CASO 10
		if (numeroA > numeroB && numeroB == numeroC) {
			auxMensagem = auxMensagem + numeroB + ", " + numeroC + ", " + numeroA + "\n";
		}	
		
		//CASO 11
		if (numeroB > numeroA && numeroA == numeroC) {
			auxMensagem = auxMensagem + numeroA + ", " + numeroC + ", " + numeroB + "\n";
		}	
		
		//CASO 12
		if (numeroA == numeroC && numeroA > numeroB) {
			auxMensagem = auxMensagem + numeroB + ", " + numeroA + ", " + numeroC + "\n";
		}	
		
		//CASO 13
		if (numeroA == numeroB && numeroB == numeroC) {
			auxMensagem = auxMensagem + numeroA + ", " + numeroB + ", " + numeroC + "\n";
		}	
		
		write(auxMensagem);
		
		// Your code ends here :(
//<editor-fold defaultstate="collapsed" desc="final program settings...">
	}
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static Integer calculateSizeOfLongestLine(Object messageToUser) {
		String[] slicesOfMessage = messageToUser.toString().split("\n");
		Integer bigger = 0;

		for (Integer index = 0; index < slicesOfMessage.length; index++) {
			if (slicesOfMessage[index].length() > bigger) {
				bigger = slicesOfMessage[index].length();
			}
		}

		return bigger;
	}

	public static String drawBorderLines(Object messageToUser, Integer sidePaddingSize) {
		String border = "+";
		Integer spaces = calculateSizeOfLongestLine(messageToUser) + (2 * sidePaddingSize);
		for (Integer count = 0; count < spaces; count++) {
			border += "-";
		}
		border += "+";
		return border;
	}

	public static void write(Object messageToUser) {
		String border = drawBorderLines(messageToUser, 2);
		String[] slicesOfMessage = messageToUser.toString().split("\n");

		String finalMessage = "\n" + border + "\n";
		for (int count = 0; count < slicesOfMessage.length; count++) {
			finalMessage += "|  " + (String.format("%-" + (border.length() - 6) + "s", slicesOfMessage[count])) + "  |\n";
		}
		finalMessage += border + "\n";

		System.out.println(finalMessage);
	}

	public static String readString(Object messageToUser) {
		String readValue = null;

		String border = drawBorderLines(messageToUser, 2);
		String[] slicesOfMessage = messageToUser.toString().split("\n");

		String headerMessage = "\n" + border + "\n";
		for (int count = 0; count < slicesOfMessage.length; count++) {
			headerMessage += "|  " + (String.format("%-" + (border.length() - 6) + "s", slicesOfMessage[count])) + "  |\n";
		}
		System.out.print(headerMessage + "|  ");

		try {
			readValue = scanner.nextLine();
		} catch (Exception e) {
		}

		System.out.println(border + "\n");

		return readValue;
	}

	public static Integer readInteger(Object messageToUser) {
		try {
			return parseInt(readString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Float readFloat(Object messageToUser) {
		try {
			return parseFloat(readString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Double readDouble(Object messageToUser) {
		try {
			return parseDouble(readString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static void writeWindow(Object messageToUser) {
		// <editor-fold defaultstate="collapsed" desc="customizing JOptionPane...">
		//Changing Font new Font(nomeFonte, espessura.valorEspessura, tamanhoCaractere);
		Font fontMonospaced = new Font("Consolas", Font.BOLD, 18);

		//Preparing the text message
		JTextArea textMessage = new JTextArea();
		textMessage.setEditable(false);
		textMessage.setBackground(Color.decode("0x3c3f41"));
		textMessage.setForeground(Color.decode("0xdee4e5"));
		textMessage.setFont(fontMonospaced);
		textMessage.setText(messageToUser.toString());

		//Changing JOptionPane colors
		UIManager.put("OptionPane.background", textMessage.getBackground());
		UIManager.put("Panel.background", textMessage.getBackground());
		UIManager.put("Button.background", Color.decode("0x727A7C"));
		UIManager.put("Button.foreground", textMessage.getForeground());
		UIManager.put("Button.font", fontMonospaced);

		//Changin JOptionPane OK button
		UIManager.put("OptionPane.okButtonText", "Close");
		// </editor-fold>

		JOptionPane.showMessageDialog(null, textMessage, "Write Operation", JOptionPane.PLAIN_MESSAGE);
	}

	public static String readWindowString(Object messageToUser) {
		// <editor-fold defaultstate="collapsed" desc="customizing JOptionPane...">
		//Changing Font new Font(nomeFonte, espessura.valorEspessura, tamanhoCaractere);
		Font fontMonospaced = new Font("Consolas", Font.BOLD, 18);

		//Preparing the text message
		JTextArea textMessage = new JTextArea();
		textMessage.setEditable(false);
		textMessage.setBackground(Color.decode("0x3c3f41"));
		textMessage.setForeground(Color.decode("0xdee4e5"));
		textMessage.setFont(fontMonospaced);
		textMessage.setText(messageToUser.toString());

		//Changing JOptionPane colors
		UIManager.put("OptionPane.background", textMessage.getBackground());
		UIManager.put("Panel.background", textMessage.getBackground());
		UIManager.put("Button.background", Color.decode("0x727A7C"));
		UIManager.put("Button.foreground", textMessage.getForeground());
		UIManager.put("Button.font", fontMonospaced);

		Border inputBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.gray);
		UIManager.put("TextField.background", textMessage.getBackground());
		UIManager.put("TextField.foreground", Color.white);
		UIManager.put("TextField.border", inputBorder);
		UIManager.put("TextField.font", fontMonospaced);

		//Changin JOptionPane OK button
		UIManager.put("OptionPane.okButtonText", "Insert");
		UIManager.put("OptionPane.cancelButtonText", "Cancel");
		// </editor-fold>

		String readValue = null;
		try {
			readValue = JOptionPane.showInputDialog(null, textMessage, "Read Operation", JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e) {
		}
		return readValue;
	}

	public static Integer readWindowInteger(Object messageToUser) {
		try {
			return parseInt(readWindowString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Float readWindowFloat(Object messageToUser) {
		try {
			return parseFloat(readWindowString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Double readWindowDouble(Object messageToUser) {
		try {
			return parseDouble(readWindowString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

}
// </editor-fold>
