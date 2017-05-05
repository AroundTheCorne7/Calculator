package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

  Float data = 0f;
  int operation = 01;

  @FXML
  private Button minus;

  @FXML
  private Button nine;

  @FXML
  private Button six;

  @FXML
  private Button one;

  @FXML
  private TextField display;

  @FXML
  private Button seven;

  @FXML
  private Button cl;

  @FXML
  private Button two;

  @FXML
  private Button three;

  @FXML
  private Button plus;

  @FXML
  private Button zero;

  @FXML
  private Button four;

  @FXML
  private Button equals;

  @FXML
  private Button divide;

  @FXML
  private Button multiply;

  @FXML
  private Button five;

  @FXML
  private Button height;

  @FXML
  private void handleNumberButton(ActionEvent event) {
    Object source = event.getSource();
    if (source == one) {
      display.setText(display.getText() + "1");
    } else if (source == two) {
      display.setText(display.getText() + "2");
    } else if (source == three) {
      display.setText(display.getText() + "3");
    } else if (source == four) {
      display.setText(display.getText() + "4");
    } else if (source == five) {
      display.setText(display.getText() + "5");
    } else if (source == six) {
      display.setText(display.getText() + "6");
    } else if (source == seven) {
      display.setText(display.getText() + "7");
    } else if (source == height) {
      display.setText(display.getText() + "8");
    } else if (source == nine) {
      display.setText(display.getText() + "9");
    } else if (source == zero) {
      display.setText(display.getText() + "0");
    } else if (source == cl) {
      display.setText("");
    } else if (source == plus) {
      data = Float.parseFloat(display.getText());
      operation = 1;
      display.setText("");
    } else if (source == minus) {
      data = Float.parseFloat(display.getText());
      operation = 2;
      display.setText("");
    } else if (source == multiply) {
      data = Float.parseFloat(display.getText());
      operation = 3;
      display.setText("");
    } else if (source == divide) {
      data = Float.parseFloat(display.getText());
      operation = 4;
      display.setText("");
    } else if (source == equals) {
      Float secondOperant = Float.parseFloat(display.getText());
      Float ans;
      switch (operation) {
        case 1:
          ans = data + secondOperant;
          display.setText(String.valueOf(ans));
          break;
        case 2:
          ans = data - secondOperant;
          display.setText(String.valueOf(ans));
          break;
        case 3:
          ans = data * secondOperant;
          display.setText(String.valueOf(ans));
          break;
        case 4:
          if (secondOperant == 0) {
            display.setText("Error");
            break;
          }
          ans = data + secondOperant;
          display.setText(String.valueOf(ans));
          break;
      }
    }
  }
}
