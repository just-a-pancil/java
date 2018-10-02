package VoronCalc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoronCalc extends JFrame 
{
  private int voron = 0;
  private JLabel countLabel;
  private JButton addCrow;
  private JButton removeCrow;

  public VoronCalc()
  {
    super("Voron calculator");
    setSize(900,900);
    setBounds(500, 500, 500, 500);
    //Подготавливаем компоненты объекта
    countLabel = new JLabel("Crows:" + voron);
    addCrow = new JButton("Add Crow");
    removeCrow = new JButton("Remove Crow");

    //Подготавливаем временные компоненты
    JPanel buttonsPanel = new JPanel(new FlowLayout()); 
    //Расставляем компоненты по местам
    add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже

    buttonsPanel.add(addCrow);
    buttonsPanel.add(removeCrow);

    add(buttonsPanel, BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}