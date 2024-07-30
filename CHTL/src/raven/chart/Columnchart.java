package raven.chart;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;
import raven.chart.blankchart.BlankPlotChart;
import raven.chart.blankchart.BlankPlotChatRender;
import raven.spline.SplinePoint;

public class Columnchart extends JComponent {

    private final List<ModelLegend> legends = new ArrayList<>();
    private final List<ModelChart> model = new ArrayList<>();
    private Animator animator;
    private Animator animatorChange;
    private Animator animatorLabel;
    private float animate;
    private float animateChange;
    private int index = 0;
    private Color color1;
    private Color color2;
    private boolean fillColor = false;
    private TimingTarget timingColor1;
    private TimingTarget timingColor2;
    private int selectedIndex = -1;
    private float currentPoint = -1;
    private float oldPoint = -1;
    private float targetPoint = -1;
    private float alphaLable;


    public Columnchart() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill, inset 0", "[fill]", "[]10[fill,100%]5"));
        setForeground(new Color(120, 120, 120));
        createPanelLegend();
        createBlankChart();
        createChart();
        createAnimatorChart();
        initAnimatorChange();
        initAnimatorLabel();
    }

    private void createAnimatorChart() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                animate = fraction;
                repaint();
            }
        };
        animator = new Animator(1500, target);
        animator.setResolution(5);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }

    private void initAnimatorChange() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                animateChange = fraction;
                repaint();
            }
        };
        animatorChange = new Animator(800, target);
        animatorChange.setResolution(5);
        animatorChange.setAcceleration(0.5f);
        animatorChange.setDeceleration(0.5f);
    }

    private void initAnimatorLabel() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                currentPoint = oldPoint + ((targetPoint - oldPoint) * fraction);
                if (alphaLable != 1) {
                    alphaLable = fraction;
                }
                repaint();
            }
        };
        animatorLabel = new Animator(500, target);
        animatorLabel.setResolution(5);
    }

    private void createBlankChart() {
        blankPlotChart = new BlankPlotChart();
        add(blankPlotChart);
    }

    private void createChart() {
        blankPlotChart.setBlankPlotChatRender(new BlankPlotChatRender() {

            @Override
            public String getLabelText(int index) {
                return model.get(index).getLabel();
            }

            @Override
            public void renderGraphics(BlankPlotChart chart, Graphics2D g2, Rectangle2D rectangle) {
                if (!model.isEmpty() && animate > 0 && index >= 0 && index <= legends.size() - 1) {
                    draw(g2, rectangle, index, chart.getNiceScale().getTickSpacing() * chart.getNiceScale().getMaxTicks());
                }
            }

            @Override
            public void mouseMove(Rectangle2D rectangle, MouseEvent mouse) {
                if (!model.isEmpty()) {
                    int per = (int) (rectangle.getWidth() / model.size());
                    int index = -1;
                    for (int i = 0; i < per; i++) {
                        double x = i * per + rectangle.getX();
                        if (mouse.getX() >= x && mouse.getX() <= x + per && mouse.getY() >= rectangle.getY() && mouse.getY() <= rectangle.getY() + rectangle.getHeight()) {
                            index = i;
                            break;
                        }
                    }
                    if (index >= model.size() - 1) {
                        index = model.size() - 1;
                    }
                    if (index != selectedIndex) {
                        changeSelectedIndex(index);
                    }
                }
            }
        });
    }

    private void changeSelectedIndex(int index) {
        if (index != -1) {
            this.selectedIndex = index;
            if (animatorLabel.isRunning()) {
                animatorLabel.stop();
            }
            if (selectedIndex >= model.size() - 1) {
                oldPoint = currentPoint;
                targetPoint = model.size() - 1 - 0.01f;
                animatorLabel.start();
            } else if (selectedIndex >= 0) {
                oldPoint = currentPoint;
                targetPoint = selectedIndex;
                animatorLabel.start();
            } else {
                repaint();
            }
        }
    }

    private void draw(Graphics2D g2, Rectangle2D rec, int index, double maxValue) {
    String yAxisUnit = "USD";
    g2.drawString(yAxisUnit,  20,  20);
    double barWidth = 30;
    int numberMonth = model.get(index).getValues().length;
    int numberOfBars = model.size();
    double totalWidth = 627 - 15;
    double spacing = totalWidth / model.size();
        for (int i = 0; i < numberOfBars; i++) {
            double x = spacing + i * (spacing + 15)+10;
            double y = rec.getY() + rec.getHeight() - (model.get(i).getValues()[index] / maxValue) * rec.getHeight();
            double height = (model.get(i).getValues()[index] / maxValue) * rec.getHeight();
            g2.setPaint(new GradientPaint((int) x, 0, color1, (int) (x + barWidth), 0, color2));
            g2.fill(new Rectangle2D.Double(x, y, barWidth, height));
        }

}
    private void createPanelLegend() {
        panelLegend = new JPanel();
        panelLegend.setOpaque(false);
        panelLegend.setLayout(new MigLayout("filly, center, inset 0", "[]10[]"));
        labelTitle = new JLabel();
        labelTitle.setForeground(new Color(229, 229, 229));
        labelTitle.setFont(labelTitle.getFont().deriveFont(Font.BOLD, 15));
        panelLegend.add(labelTitle, "push, gap left 10");
        add(panelLegend, "wrap");
    }

    public void addLegend(String name, Color color1, Color color2) {
        ModelLegend data = new ModelLegend(name, color1, color2);
        legends.add(data);
        LegendItem legend = new LegendItem(data, legends.size() - 1);
        legend.setForeground(getForeground());
        legend.addActionListener((ActionEvent e) -> {
            if (animate > 0) {
                startChange(legend.getIndex());
                clearLegendSelected(legend);
            }
        });
        if (legends.size() - 1 == index) {
            legend.setSelected(true);
        }
        panelLegend.add(legend);
        panelLegend.repaint();
        panelLegend.revalidate();
    }

    private void clearLegendSelected(LegendItem item) {
        item.setSelected(true);
        for (Component com : panelLegend.getComponents()) {
            if (com instanceof LegendItem) {
                LegendItem l = (LegendItem) com;
                if (l != item) {
                    l.setSelected(false);
                }
            }
        }
    }

    public void addData(ModelChart data) {
        model.add(data);
        blankPlotChart.setLabelCount(model.size());
        double max = data.getMaxValues();
        if (max > blankPlotChart.getMaxValues()) {
            blankPlotChart.setMaxValues(max);
        }
    }

    public void clear() {
        animate = 0;
        blankPlotChart.setLabelCount(0);
        model.clear();
        selectedIndex = -1;
        alphaLable = 0f;
        currentPoint = 0f;
        animator.stop();
        animatorChange.stop();
        animatorLabel.stop();
        repaint();
    }

    public void start() {
        if (!animator.isRunning()) {
            color1 = legends.get(index).getColor1();
            color2 = legends.get(index).getColor2();
            animator.removeTarget(timingColor1);
            animator.removeTarget(timingColor2);
            animatorChange.stop();
            animatorLabel.stop();
            selectedIndex = -1;
            alphaLable = 0f;
            currentPoint = 0;
                        animator.start();
        }
    }

    private void startChange(int index) {
        if (this.index != index) {
            if (animatorChange.isRunning()) {
                animatorChange.stop();
            }
            animateChange = 0;
            this.index = index;
            animatorChange.removeTarget(timingColor1);
            animatorChange.removeTarget(timingColor2);
            timingColor1 = new PropertySetter(this, "color1", color1, legends.get(index).getColor1());
            timingColor2 = new PropertySetter(this, "color2", color2, legends.get(index).getColor2());
            animatorChange.addTarget(timingColor1);
            animatorChange.addTarget(timingColor2);
            animatorChange.start();
        }
    }

    public void resetAnimation() {
        animate = 0;
        repaint();
    }

    public void setTitle(String title) {
        labelTitle.setText(title);
    }

    public String getTitle() {
        return labelTitle.getText();
    }

    public void setTitleFont(Font font) {
        labelTitle.setFont(font);
    }

    public Font getTitleFont() {
        return labelTitle.getFont();
    }

    public void setTitleColor(Color color) {
        labelTitle.setForeground(color);
    }

    public Color getTitleColor() {
        return labelTitle.getForeground();
    }

    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
        if (blankPlotChart != null) {
            blankPlotChart.setForeground(fg);
            labelTitle.setForeground(fg);
        }
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private BlankPlotChart blankPlotChart;
    private JPanel panelLegend;
    private JLabel labelTitle;
}
