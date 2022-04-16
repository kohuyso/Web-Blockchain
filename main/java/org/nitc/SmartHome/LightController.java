package org.nitc.SmartHome;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Controller.ConnectDataBase;
import Controller.TimeNe;
import Model.ElectricDeviceModel;
import Model.waterPurifierModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class LightController implements Initializable{
	
	ElectricDeviceModel l1, l2, l3, l4, l5, l6;

    @FXML
    private JFXButton About;

    @FXML
    private JFXButton Bill;

    @FXML
    private JFXButton Health;

    @FXML
    private JFXButton Home;

    @FXML
    private Text Time;

    @FXML
    private Button bc;

    @FXML
    private Button khach;

    @FXML
    private Button ngu1;

    @FXML
    private Button ngu2;

    @FXML
    private Button wc1;

    @FXML
    private Button wc2;

    @FXML
    void AboutClick(ActionEvent event) throws IOException {
    	App.setRoot("AboutPage");
    }

    @FXML
    void BillClick(ActionEvent event) throws IOException {
    	App.setRoot("BillPage");
    }

    @FXML
    void HealthClick(ActionEvent event) throws IOException {
    	App.setRoot("FamilyMemberPage");
    }

    @FXML
    void HomeClick(ActionEvent event) throws IOException {
    	App.setRoot("secondary");
    }

    @FXML
    void Time7(MouseEvent event) {

    }

    @FXML
    void WC1C(ActionEvent event) {

    }

    @FXML
    void WC2C(ActionEvent event) {

    }

    @FXML
    void bcC(ActionEvent event) {

    }

    @FXML
    void khachC(ActionEvent event) {

    }

    @FXML
    void ngu1C(ActionEvent event) {

    }

    @FXML
    void ngu2C(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Time.setText("Time: " + TimeNe.getTime());
		Connection con;
		try {
			con = ConnectDataBase.openConnection();
			String sql_getAirC = "SELECT EID, STT FROM LIGHT";
			PreparedStatement ps_getAirC = con.prepareStatement(sql_getAirC);
			ResultSet rs_getAirC = ps_getAirC.executeQuery();
			int step = 1;
			while (step != 2 && rs_getAirC.next()) {
				con = ConnectDataBase.openConnection();
				String sql_getAirCts = "SELECT EROOM, EMANUFACTURE, EINSURANCE, CAPACITYN, ESTATUS FROM ELECTRICDIVECS WHERE EID = ?";
				PreparedStatement ps_getAirCts = con.prepareStatement(sql_getAirCts);
				ps_getAirCts.setString(1, rs_getAirC.getString("EID"));
				ResultSet rs_getAirCts = ps_getAirCts.executeQuery();
				rs_getAirCts.next();
				int status = rs_getAirCts.getInt("ESTATUS");
				if (step == 1) {
					
				}
				else if (step == 2) {
					
				}
				else if (step == 3) {
					
				}
				else if (step == 4) {
					
				}
				else if (step == 5) {
					
				}
				else {
					
				}
			}
			Time.setText("Time: " + TimeNe.getTime());

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
