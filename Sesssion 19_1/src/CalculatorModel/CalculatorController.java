package CalculatorModel;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController
{
    @FXML
    private TextField input;

    private CalculatorModel model;

    public void setModel(CalculatorModel model)
    {
        this.model = model;
        input.setText(model.getStatus());
    }

    public void addDigit(Event event)
    {
        String textOnButton = ((Button) event.getSource()).getText();
        int digit = Integer.parseInt(textOnButton);
        model.addDigit(digit);
        input.setText(model.getStatus());
    }

    public void clearAll()
    {
        model.clearAll();
        input.setText(model.getStatus());
    }

    public void clear()
    {
        model.clear();
        input.setText(model.getStatus());
    }

    public void back()
    {
        model.removeLast();
        input.setText(model.getStatus());
    }

    public void divide()
    {
        model.divide();
        input.setText(model.getStatus());
    }

    public void multiply()
    {
        model.times();
        input.setText(model.getStatus());
    }

    public void subtract()
    {
        model.minus();
        input.setText(model.getStatus());
    }

    public void add()
    {
        model.plus();
        input.setText(model.getStatus());
    }

    public void result()
    {
        model.equals();
        input.setText(model.getStatus());
    }

    public void changeSign()
    {
        model.addSign();
        input.setText(model.getStatus());
    }

    public void comma()
    {
        model.addComma();
        input.setText(model.getStatus());
    }
}
