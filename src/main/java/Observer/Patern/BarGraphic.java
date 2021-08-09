package Observer.Patern;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class BarGraphic implements Observer {

    private final DefaultCategoryDataset dataset;
    private final JFrame frame = new JFrame();

    public BarGraphic() {
        dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart(
                "Carteira de Ações", "Siglas",
                "Quantidade", dataset, PlotOrientation.VERTICAL,
                false, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.setContentPane(chartPanel);
        frame.setSize(500, 270);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void quantityChange(String stock, Integer quantity) {
        dataset.setValue(quantity, "Quantidade",stock);
    }
}
