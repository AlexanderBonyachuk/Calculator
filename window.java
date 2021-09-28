package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window extends JFrame implements ActionListener, WindowListener {
    private TextField f = new TextField();
    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton result = new JButton("=");
    private JButton ad = new JButton("+");
    private JButton sub = new JButton("-");
    private JButton cancel = new JButton("D");
    private JButton Del = new JButton("C");
    private JButton eqw = new JButton("*");
    private JButton div = new JButton("/");
    private JButton change = new JButton("+/-");
    private JButton sqr = new JButton("SQR");
    private JButton pt = new JButton(".");
    private String text = "0";
    private double a = 0;
    private double b = 0;
    private int m = 60;     // ширина кнопки
    private int n = 60;     // высота кнопки
    private char z;

    public window() {
        Font ex = new Font("Impact", Font.BOLD, 40);     // шрифт
        setLayout(null);                 // зануляем слои
        setSize(400,600);   // устанавливаем размеры экрана калькулятора
        setVisible(true);                // отображаемость
        setLocation(1600,300);     // позиционирование на рабочем столе

        f.setFont(ex);              // задаем форматирование текстового поля
        f.setLocation(25,25);   // позиционирование поля текст
        f.setVisible(true);
        f.setSize(330,60);
        add(f);
        f.setText(text);                  // отображаем 0 на экране ввода
        addWindowListener(this);        // для остановки программы крестиком

        // задание кнопок нужно сделать через конструктор

        button0.setSize(m,n);    // размеры кнопки 0
        button0.setLocation(105,465);     // расположение кнопки в окне
        button0.setVisible(true);              // показывать кнопку на экране
        button0.setFont(ex);                   // задали фортирование текста кнопки
        add(button0);                          // прикрепили кнопку в окне
        button0.addActionListener(this);    // фиксирование нажатия кнопки

        button1.setSize(m,n);
        button1.setLocation(25,385);
        button1.setVisible(true);
        button1.setFont(ex);
        add(button1);
        button1.addActionListener(this);

        button2.setSize(m,n);
        button2.setLocation(105,385);
        button2.setVisible(true);
        button2.setFont(ex);
        add(button2);
        button2.addActionListener(this);

        button3.setSize(m,n);
        button3.setLocation(185,385);
        button3.setVisible(true);
        button3.setFont(ex);
        add(button3);
        button3.addActionListener(this);

        button4.setSize(m,n);
        button4.setLocation(25,305);
        button4.setVisible(true);
        button4.setFont(ex);
        add(button4);
        button4.addActionListener(this);

        button5.setSize(m,n);
        button5.setLocation(105,305);
        button5.setVisible(true);
        button5.setFont(ex);
        add(button5);
        button5.addActionListener(this);

        button6.setSize(m,n);
        button6.setLocation(185,305);
        button6.setVisible(true);
        button6.setFont(ex);
        add(button6);
        button6.addActionListener(this);

        button7.setSize(m,n);
        button7.setLocation(25,225);
        button7.setVisible(true);
        button7.setFont(ex);
        add(button7);
        button7.addActionListener(this);

        button8.setSize(m,n);
        button8.setLocation(105,225);
        button8.setVisible(true);
        button8.setFont(ex);
        add(button8);
        button8.addActionListener(this);

        button9.setSize(m,n);
        button9.setLocation(185,225);
        button9.setVisible(true);
        button9.setFont(ex);
        add(button9);
        button9.addActionListener(this);

        cancel.setSize(m,n);
        cancel.setLocation(265,305);
        cancel.setVisible(true);
        cancel.setFont(ex);
        add(cancel);
        cancel.addActionListener(this);

        result.setSize(m,140);
        result.setLocation(265,385);
        result.setVisible(true);
        result.setFont(ex);
        add(result);
        result.addActionListener(this);

        ad.setSize(m,n);
        ad.setLocation(25,145);
        ad.setVisible(true);
        ad.setFont(ex);
        add(ad);
        ad.addActionListener(this);

        sub.setSize(m,n);
        sub.setLocation(105,145);
        sub.setVisible(true);
        sub.setFont(ex);
        add(sub);
        sub.addActionListener(this);

        eqw.setSize(m,n);
        eqw.setLocation(185,145);
        eqw.setVisible(true);
        eqw.setFont(ex);
        add(eqw);
        eqw.addActionListener(this);

        div.setSize(m,n);
        div.setLocation(265,145);
        div.setVisible(true);
        div.setFont(ex);
        add(div);
        div.addActionListener(this);

        change.setSize(m,n);
        change.setLocation(25,465);
        change.setVisible(true);
        add(change);
        change.addActionListener(this);

        sqr.setSize(m,30);
        sqr.setLocation(25,105);
        sqr.setVisible(true);
        add(sqr);
        sqr.addActionListener(this);

        pt.setSize(m,n);
        pt.setLocation(185,465);
        pt.setVisible(true);
        pt.setFont(ex);
        add(pt);
        pt.addActionListener(this);

        Del.setSize(m,n);      // кнопка Очистки
        Del.setLocation(265,225);
        Del.setVisible(true);
        Del.setFont(ex);
        add(Del);
        Del.addActionListener(this);    // фиксирование нажатия кнопки

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (text.equals("0")) {
                text = "";
            }
            if (e.getSource() == button0) {         // если нажата клавиша 0
                if (!(text.equals("0") || (text.equals("")))) {           // если в поле текст непустое место, то приписываем ноль
                    text = text + button0.getText(); // текст для отображения на экране
                    f.setText(text);                 // в текстовое поле выводится 0 и то, что ввели ранее
                }
            }
            if (e.getSource() == pt) {          // точка
                text = text + pt.getText();
                f.setText(text);
            }
            if (e.getSource() == button1) {
                text = text + button1.getText();
                f.setText(text);
            }
            if (e.getSource() == button2) {
                text = text + button2.getText();
                f.setText(text);
            }
            if (e.getSource() == button3) {
                text = text + button3.getText();
                f.setText(text);
            }
            if (e.getSource() == button4) {
                text = text + button4.getText();
                f.setText(text);
            }
            if (e.getSource() == button5) {
                text = text + button5.getText();
                f.setText(text);
            }
            if (e.getSource() == button6) {
                text = text + button6.getText();
                f.setText(text);
            }
            if (e.getSource() == button7) {
                text = text + button7.getText();
                f.setText(text);
            }
            if (e.getSource() == button8) {
                text = text + button8.getText();
                f.setText(text);
            }
            if (e.getSource() == button9) {
                text = text + button9.getText();
                f.setText(text);
            }
            if (e.getSource() == cancel) {
                if (!(text.equals(""))) {       // если есть что стирать, чтобы не выкидывало ошибки
                    text = text.substring(0, text.length() - 1);  // стереть один символ
                    f.setText(text);
                }
            }
            if (e.getSource() == Del) {     // очистка поля текст
                text = "0";
                f.setText(text);
            }
// 28.09.2021 при повторном нажатии + - не считает корректно, иногда не отображаются кнопки
            if (e.getSource() == ad) {     // кнопка +
                    a = Double.parseDouble(text);
                    f.setText(text + ad.getText());
                    text = "";
                    z = '+';
            }
            if (e.getSource() == sub) {     // кнопка -
                    a = Double.parseDouble(text);
                    f.setText(text + sub.getText());
                    text = "";
                    z = '-';
            }
            if (e.getSource() == eqw) {     // кнопка *
                    a = Double.parseDouble(text);
                    f.setText(text + eqw.getText());
                    text = "";
                    z = '*';
            }
            if (e.getSource() == div) {     // кнопка /
                    a = Double.parseDouble(text);
                    f.setText(text + div.getText());
                    text = "";
                    z = '/';
            }
            if (e.getSource() == sqr) {     // кнопка корень
                    a = Double.parseDouble(text);
                    text = String.valueOf(Math.sqrt(a));
                    f.setText(text);
            }
            if (e.getSource() == change) {     // кнопка смены знака
                double c = Integer.parseInt(f.getText());
                c = c * -1;
                text = String.valueOf(c);
                f.setText(text);
            }
            // 27.06.2021 - остановился на описании + и /, нужна смена знака
            if (e.getSource() == result) {     // кнопка =
                b = Double.parseDouble(text);
                if (z == '+') {
                    text = String.valueOf(a + b);
                }
                if (z == '-') {
                    text = String.valueOf(a - b);
                }
                if (z == '*') {
                    text = String.valueOf(a * b);
                }
                if (z == '/') {
                    text = String.valueOf(a / b);
                }
                f.setText(text);
            }
        } catch (Exception ex) {
            System.out.println("a: " + a + ", b: " + ", Text: " + text);
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(1);     // для выхода крестиком
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
