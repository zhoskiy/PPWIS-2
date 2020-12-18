package model;

import javax.swing.*;
import java.awt.*;

public class GraphicInterface extends JFrame {
    private Controller controller;

    private JPanel schedulePanel;
    private JPanel visualPanel;
    private JPanel editPanel;
    private JPanel mainPanel;
    private JPanel editDriverPanel;
    private JPanel editBusPanel;
    private JPanel editRoadPanel;
    private JButton speedUp;
    private JButton speedDown;
    private JButton start;
    private JLabel speed;
    private JLabel needWaitingTime;
    private JLabel averageWaitingTime;

    private JButton busParkButton;
    private JButton addBus;
    private JButton addDriver;
    private JButton addRoad;
    private JPanel infoPanel;
    private JLabel countFiuelBuss;
    private JLabel countFreeBuss;
    private JLabel countFreeDrivers;
    private boolean playing;

    public GraphicInterface(Controller controller) throws HeadlessException {
        super("City transport simulation");
        this.controller = controller;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280, 720);

        createSchedulePanel();
        createVisualPanel();
        createEditPanel();
        createMainPanel();

        createListener();

        setVisible(true);
        start();
    }

    public void setTime(int time){
        averageWaitingTime.setText(Integer.toString(time));
    }
    public void setMoneyPark(BusPark busPark){
        busPark.calculate();
    }
    public void start(){ updateWindow();}
    public void updateWindow(){
        while (playing) {
            visualPanel.repaint();
        }
    }
    public void openBusParkSubWindow(){infoPanel.setVisible(true);}
    public void closeBusParkSubWindow(){infoPanel.setVisible(false);}
    public void openAddDriverSubWin(){addDriver.setVisible(true);}
    public void closeAddDriverSubWin(){addDriver.setVisible(false);}
    public void openAddRoadSubWin(){addRoad.setVisible(true);}
    public void closeAddRoadSubWin(){addRoad.setVisible(false);}
    public void openAddBusSubWin(){addBus.setVisible(true);}
    public void closeAddBusSubWin(){addBus.setVisible(false);}
    public void stop(){
        playing = false;
    }

    private void createMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        mainPanel.add(schedulePanel);
        mainPanel.add(Box.createHorizontalGlue());
        mainPanel.add(visualPanel);
        mainPanel.add(Box.createHorizontalGlue());
        mainPanel.add(editPanel);

        add(mainPanel);
    }

    private void createEditPanel() {
        editPanel = new JPanel();
        editPanel.setLayout(new BoxLayout(editPanel, BoxLayout.Y_AXIS));
        busParkButton = new JButton("Автопарк 1");

        countFiuelBuss = new JLabel("");
        countFreeBuss = new JLabel("");
        countFreeDrivers = new JLabel("");

        infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 2));
        infoPanel.add(new JLabel("Автобусов на заправке:"));
        infoPanel.add(countFiuelBuss);
        infoPanel.add(new JLabel("Автобусов свободно:"));
        infoPanel.add(countFreeBuss);
        infoPanel.add(new JLabel("Водителей свободно:"));
        infoPanel.add(countFreeDrivers);
        infoPanel.setMaximumSize(new Dimension(500, 100));
        infoPanel.setVisible(false);

        addBus = new JButton("+автобус");
        addDriver = new JButton("+водитель");
        addRoad = new JButton("+маршрут");

        editBusPanel = new JPanel();
        editDriverPanel = new JPanel();
        editRoadPanel = new JPanel();

        editPanel.add(busParkButton);
        editPanel.add(infoPanel);
        editPanel.add(addBus);
        editPanel.add(addDriver);
        editPanel.add(addRoad);
        editPanel.add(editBusPanel);
        editPanel.add(editDriverPanel);
        editPanel.add(editRoadPanel);
    }

    private void createVisualPanel() {
        visualPanel = new JPanel();
        visualPanel.setBackground(Color.GRAY);
    }

    private void createSchedulePanel() {
        schedulePanel = new JPanel();
        schedulePanel.setLayout(new BoxLayout(schedulePanel, BoxLayout.Y_AXIS));
        speedUp = new JButton(" -> ");
        speedDown = new JButton(" <- ");
        speed = new JLabel("1");
        start = new JButton("Старт");
        averageWaitingTime = new JLabel("3:04");
        needWaitingTime = new JLabel("5:00");

        JPanel timePanel = new JPanel();
        timePanel.setLayout(new BoxLayout(timePanel, BoxLayout.X_AXIS ));
        timePanel.add(Box.createHorizontalGlue());
        timePanel.add(averageWaitingTime);
        timePanel.add(Box.createHorizontalGlue());
        timePanel.add(needWaitingTime);
        timePanel.add(Box.createHorizontalGlue());

        JPanel speedPanel = new JPanel();
        speedPanel.setLayout(new BoxLayout(speedPanel, BoxLayout.X_AXIS ));
        speedPanel.add(Box.createHorizontalGlue());
        speedPanel.add(speedDown);
        speedPanel.add(Box.createHorizontalGlue());
        speedPanel.add(speed);
        speedPanel.add(Box.createHorizontalGlue());
        speedPanel.add(speedUp);
        speedPanel.add(Box.createHorizontalGlue());

        schedulePanel.add(Box.createVerticalGlue());
        schedulePanel.add(timePanel);
        schedulePanel.add((speedPanel));
        schedulePanel.add(Box.createVerticalGlue());
        schedulePanel.add(start);
    }

    private void createListener(){
        busParkButton.addActionListener(actionEvent -> {
            if(!infoPanel.isVisible())
                openBusParkSubWindow();
            else closeBusParkSubWindow();
        });

        addBus.addActionListener(actionEvent -> {
            if(!infoPanel.isVisible())
                openAddBusSubWin();
            else closeAddBusSubWin();
        });

        addDriver.addActionListener(actionEvent -> {
            if(!infoPanel.isVisible())
                openAddDriverSubWin();
            else closeAddDriverSubWin();
        });

        addRoad.addActionListener(actionEvent -> {
            if(!infoPanel.isVisible())
                openAddRoadSubWin();
            else closeAddRoadSubWin();
        });

        speedUp.addActionListener(actionEvent -> {
            int newSpeed = Integer.parseInt(speed.getText());
            newSpeed++;
            speed.setText(Integer.toString(newSpeed));
        });

        speedDown.addActionListener(actionEvent -> {
            int newSpeed = Integer.parseInt(speed.getText());
            newSpeed--;
            speed.setText(Integer.toString(newSpeed));
        });

        start.addActionListener(actionEvent -> {
            playing=true;
        });
    }

}
