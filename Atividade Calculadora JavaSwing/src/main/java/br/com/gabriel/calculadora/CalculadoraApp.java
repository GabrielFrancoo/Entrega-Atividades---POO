package br.com.gabriel.calculadora;

import javax.swing.*;
import java.awt.*;

public class CalculadoraApp{
    private Calculadora calc = new Calculadora();
    private JTextField num1, num2, resultado;
    private JTextField campoAtivo;

    public CalculadoraApp(){
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5, 5, 5);

        num1 = new JTextField(7);
        num2 = new JTextField(7);
        resultado = new JTextField(20);
        resultado.setEditable(false);

        num1.addFocusListener((new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                campoAtivo = num1;
            }
        }));
        num2.addFocusListener(new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt){
                campoAtivo = num2;
            }
        });

        JButton btnSomar = new JButton("+");
        JButton btnSubtrair = new JButton("-");
        JButton btnMultiplicar = new JButton("x");
        JButton btnDividir = new JButton("Divisão");

        btnSomar.addActionListener(e -> calcular('+'));
        btnSubtrair.addActionListener(e -> calcular('-'));
        btnMultiplicar.addActionListener(e -> calcular('*'));
        btnDividir.addActionListener(e -> calcular('/'));
       
        c.gridx = 0; c.gridy = 0;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.anchor = GridBagConstraints.LINE_START;
        frame.add(new JLabel("Número 1:"), c);

        c.gridx = 1; c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        frame.add(num1, c);

        c.gridx = 0; c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        frame.add(new JLabel("Número 2:"), c);

        c.gridx = 1; c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        frame.add(num2, c);

        c.gridx = 0; c.gridy = 2;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        frame.add(new JLabel("Resultado:"), c);

        c.gridx = 1; c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        frame.add(resultado, c);

        JPanel painelOperacoes = new JPanel(new GridLayout(1, 4, 5, 5));
        painelOperacoes.add(btnSomar);
        painelOperacoes.add(btnSubtrair);
        painelOperacoes.add(btnMultiplicar);
        painelOperacoes.add(btnDividir);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 4; 
        c.weightx = 1.0;
        c.fill = GridBagConstraints.BOTH;
        frame.add(painelOperacoes, c);

        JPanel painelNumeros = new JPanel(new GridLayout(2,6,5,5));
        for(int i = 0; i < 10; i++){
            JButton btnNum = new JButton(String.valueOf(i));
            btnNum.addActionListener(e ->{
                if(campoAtivo != null){
                    if(campoAtivo != null){
                        campoAtivo.setText(campoAtivo.getText() + btnNum.getText());
                    }
                }
            });
            painelNumeros.add(btnNum);
        }

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 4;
        c.fill = GridBagConstraints.BOTH;
        frame.add(painelNumeros, c);

        c.gridx = 0; c.gridy = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        JPanel filler = new JPanel();
        filler.setOpaque(false);
        frame.add(filler, c);

        frame.pack();
        frame.setSize(500,250);
        frame.setVisible(true);
    }
    private void calcular(char operador){
        try{
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double res = calc.calcular(a, b, operador);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite um número válido!");
        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public static void main(String[] args){
         new CalculadoraApp();
    }
}