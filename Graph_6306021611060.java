import javax.swing.JOptionPane;
import java.util.Random;

public class Graph_6306021611060 {
    Random rand = new Random();
    String mainmenu;
    int year;
    public Graph_6306021611060() {
        mainmenu = "";
        year = 1;
    }
    public static void main(String[] args) {
        Graph_6306021611060 object = new Graph_6306021611060();
        object.start();
    }

    public void mainMenu() {
        String choice;
        mainmenu += "MainMenu" + "\n";
        mainmenu += "=".repeat(15) + "\n";
        mainmenu += "1. Input amount of years" + "\n";
        mainmenu += "2. Show Graph" + "\n";
        mainmenu += "3. Exit" + "\n";
        mainmenu += "Input Choice : ";

        do {

            choice = JOptionPane.showInputDialog(null, mainmenu, "input", JOptionPane.QUESTION_MESSAGE);
            if (choice.isEmpty()) 
                JOptionPane.showMessageDialog(null, "Input is Empty, please try again.", "Result", JOptionPane.ERROR_MESSAGE);
            else if (!(choice.equals("1") || choice.equals("2") || choice.equals("3"))) 
                JOptionPane.showMessageDialog(null, "Incorrect choice, please try again", "Result", JOptionPane.ERROR_MESSAGE);

        } while (!(choice.equals("1") || choice.equals("2") || choice.equals("3")));

        switch (choice) {
            case "1":
                inputYear();
                break;
            case "2":
                showHistogram();
                break;
            case "3":
                exitProgram();
                break;
        }

        if (!choice.equals("3")) {
            mainmenu = "";
            mainMenu();
        }
    }

    public void start() {
        mainMenu();
    }

    public void inputYear() {
        
        do {
            year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input amount of years (1 - 9)", "Input", JOptionPane.QUESTION_MESSAGE));
            if (year < 1 || year > 9) 
                JOptionPane.showMessageDialog(null, "Incorrect input, please try again.", "Result", JOptionPane.ERROR_MESSAGE);
        } while(year < 1 || year > 9 || Integer.toString(year).isEmpty());
    }

    public void showHistogram() {
        String graph = "";
        int y = 2563;

        graph += "Graph Report The amount of students in " + year + " years" + "\n";
        graph += "-".repeat(70) + "\n";
        
        for (int i = 0; i < year; i++) {
            int randnum = rand.nextInt(70);
            graph += y-- + " : " + "*".repeat(randnum) + "(" + randnum + ")" + "\n";
        }

        JOptionPane.showMessageDialog(null, graph, ">>> Show Graph <<<", JOptionPane.INFORMATION_MESSAGE);
    }

    public void exitProgram() {
        JOptionPane.showMessageDialog(null, "Exit Program", "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
