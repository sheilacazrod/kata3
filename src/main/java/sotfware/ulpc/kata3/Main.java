package sotfware.ulpc.kata3;


import sotfware.ulpc.kata3.swing.MainFrame;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GameLoader loader = new CsvFileLoader(new File("dato.csv"));
        List<Game> games = loader.load();
        Map<String,Integer> result = new GameProcessor().process(games);
        Chart chart = new Chart("Plataformas de los juegos más vendidos", "Plataformas", "Cantidad de juegos", result);
        MainFrame mainFrame = new MainFrame();
        mainFrame.getChartDisplay().show(chart);
        mainFrame.setVisible(true);
    }
}