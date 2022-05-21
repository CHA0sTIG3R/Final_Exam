package edu.cuny.citytech.cst.finals.controller;

import edu.cuny.citytech.cst.finals.FinalExamLogic;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class FinalExamController implements Initializable {
    public Label lblTitle;
    public FlowPane fpNum;
    public TextField txtInput;
    public AnchorPane apContain;
    public Button btnCount;
    public Label lblMessage;
    public ToggleGroup tgRadio;
    public Label lblField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        FinalExamLogic guiLogic = new FinalExamLogic(lblTitle, fpNum, txtInput, apContain, btnCount, lblMessage, tgRadio, lblField);
        guiLogic.loadNumbers();
        btnCount.setText("Count to: "+ txtInput.getText());
        btnCount.setOnAction(t -> guiLogic.count());
        guiLogic.loadRadio();

    }

}
