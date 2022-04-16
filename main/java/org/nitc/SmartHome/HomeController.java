package org.nitc.SmartHome;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Controller.TimeNe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class HomeController implements Initializable {

    @FXML
    private JFXButton About;

    @FXML
    private JFXButton AirCondition;

    @FXML
    private JFXButton CoTuc;

    @FXML
    private JFXButton DauTu;

    @FXML
    private JFXButton DinhGia;

    @FXML
    private JFXButton DongTien;

    @FXML
    private JFXButton Home;

    @FXML
    private JFXButton LocRSI;

    @FXML
    private JFXButton Penny;

    @FXML
    private Text Time;

    @FXML
    private JFXButton Update;

    @FXML
    void AboutClick(ActionEvent event) throws IOException {
    	App.setRoot("AboutPage");
    }

    @FXML
    void AirConditionClick(ActionEvent event) throws IOException {
    	App.setRoot("AirConditionPage");
    }

    @FXML
    void CoTucClick(ActionEvent event) {

    }

    @FXML
    void DauTuClick(ActionEvent event) throws IOException {
    	App.setRoot("BillPage");
    }

    @FXML
    void DinhGiaClick(ActionEvent event) throws IOException {
    	App.setRoot("LightPage");
    }

    @FXML
    void DongTienClick(ActionEvent event) throws IOException {
    	App.setRoot("WWPage");
    }

    @FXML
    void HomeClick(ActionEvent event) {

    }

    @FXML
    void LockRsiClick(ActionEvent event) throws IOException {
    	App.setRoot("tvPage");
    }

    @FXML
    void PennyClick(ActionEvent event) {

    }

    @FXML
    void Time7(MouseEvent event) {

    }

    @FXML
    void UpdateClick(ActionEvent event) throws IOException {
    	App.setRoot("FamilyMemberPage");
    }
//    @FXML
//    private Line line;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Time.setText("Time: " + TimeNe.getTime());
		//line.setStyle("-fx-base: #FFFF00;");
	}

}
