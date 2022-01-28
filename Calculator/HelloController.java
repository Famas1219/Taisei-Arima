package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {

    public Button seven;
    public Button four;
    public Button one;
    public Button two;
    public Button five;
    public Button eight;
    public Button three;
    public Button calculate;
    public Button six;
    public Button nine;
    public Button zero;
    public Button mul;
    public Button minus;
    public Button divide;
    public Button plus;

    public Label display;
    public String numberBuilder = "";


    public int num2 = 0;
    public String action = "";
    public Button clear;

    public ArrayList<Integer> numbers = new ArrayList<>();
    public ArrayList<String> operators = new ArrayList<>();

    //calculate
    public void calculate() {
        System.out.println(numberBuilder);
        numbers.add(Integer.parseInt(display.getText()));
        if (numbers.size() < 2) {
            return;
        }

        int total = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (operators.get(i - 1).equals("+")) {
                total += num;
            } else if (operators.get(i - 1).equals("-")) {
                total -= num;
            } else if (operators.get(i - 1).equals("*")) {
                total *= num;
            } else if (operators.get(i - 1).equals("/")) {
                total /= num;
            }
        }

        String answer = Integer.toString(total);
        display.setText(answer);
        numberBuilder = answer;
        numbers.clear();
        operators.clear();
    }
    public void nine() {
        numberBuilder += "9";
        removeZero();
        display.setText(numberBuilder);
    }
    public void eight() {
        numberBuilder += "8";
        removeZero();
        display.setText(numberBuilder);
    }
    public void seven() {
        numberBuilder += "7";
        removeZero();
        display.setText(numberBuilder);
    }
    public void six() {
        numberBuilder += "6";
        removeZero();
        display.setText(numberBuilder);
    }

    public void five() {
        numberBuilder += "5";
        removeZero();
        display.setText(numberBuilder);
    }

    public void four() {
        numberBuilder += "4";
        removeZero();
        display.setText(numberBuilder);
    }

    public void three() {
        numberBuilder += "3";
        removeZero();
        display.setText(numberBuilder);
    }
    public void two() {
        numberBuilder += "2";
        removeZero();
        display.setText(numberBuilder);
    }

    public void one(ActionEvent actionEvent) {
        if (numberBuilder.length() == 8) {
            return;
        }
        numberBuilder += "1";
        removeZero();
        display.setText(numberBuilder);
    }

private void removeZero() {
    if (numberBuilder.substring(0, 1).equals("0")) {
        numberBuilder = numberBuilder.substring(1);
    }
}
public void zero(){
        numberBuilder += 0;
        removeZero();
        display.setText(numberBuilder);
}


    public void plus(ActionEvent actionEvent) {
            System.out.println(numberBuilder);
            int number = Integer.parseInt(numberBuilder);
            numberBuilder = "";
            numbers.add(number);
            operators.add("+");
        }

        public void minus () {
            System.out.println(numberBuilder);
            int number = Integer.parseInt(numberBuilder);
            numberBuilder = "";
            numbers.add(number);
            operators.add("-");
        }
        public void mul () {
            System.out.println(numberBuilder);
            int number = Integer.parseInt(numberBuilder);
            numberBuilder = "";
            numbers.add(number);
            operators.add("*");
        }
        public void divide () {
            System.out.println(numberBuilder);
            int number = Integer.parseInt(numberBuilder);
            numberBuilder = "";
            numbers.add(number);
            operators.add("/");
        }


    public void clear(ActionEvent actionEvent) {
     numberBuilder = "0";
        display.setText("0");
    }



}
