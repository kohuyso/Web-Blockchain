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
import Model.HumanModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class FamilyMemberController implements Initializable {
	HumanModel dad, mom, kid1, kid2;
	
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
    private Text bloodPressure1;

    @FXML
    private Text bloodPressure2;

    @FXML
    private Text bloodPressure3;

    @FXML
    private Text bloodPressure4;

    @FXML
    private Text bmi1;

    @FXML
    private Text bmi2;

    @FXML
    private Text bmi3;

    @FXML
    private Text heartBeat1;

    @FXML
    private Text heartBeat2;

    @FXML
    private Text heartBeat3;

    @FXML
    private Text heartBeat4;

    @FXML
    private Text height1;

    @FXML
    private Text height2;

    @FXML
    private Text height3;

    @FXML
    private Text height4;

    @FXML
    private JFXButton ma1;

    @FXML
    private JFXButton ma2;

    @FXML
    private JFXButton ma3;

    @FXML
    private JFXButton ma4;

    @FXML
    private Text spo2_1;

    @FXML
    private Text spo2_2;

    @FXML
    private Text spo2_3;

    @FXML
    private Text spo2_4;

    @FXML
    private Text weight1;

    @FXML
    private Text weight2;

    @FXML
    private Text weight3;

    @FXML
    private Text weight4;

    @FXML
    void AboutClick(ActionEvent event) throws IOException {
    	App.setRoot("AboutPage");
    }

    @FXML
    void BillClick(ActionEvent event) throws IOException {
    	App.setRoot("BillPage");
    }

    @FXML
    void DinhGiaClick(ActionEvent event) {

    }

    @FXML
    void DongTienClick(ActionEvent event) {

    }

    @FXML
    void HealthClick(ActionEvent event) {
    }

    @FXML
    void HomeClick(ActionEvent event) throws IOException {
    	App.setRoot("secondary");
    }

    @FXML
    void LocNganhClick(ActionEvent event) {

    }

    @FXML
    void LockRsiClick(ActionEvent event) {

    }

    @FXML
    void Time7(MouseEvent event) {

    }
    @FXML
    private Text bmi4;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		bloodPressure1.setStyle("-fx-text-fill: green; -fx-font-size: 16px;");
		weight1.setStyle("-fx-text-inner-color: red;");
		spo2_1.setStyle("-fx-base: #D50100;");
	
		try {
			Connection con = ConnectDataBase.openConnection();
			String sql_getMember = "SELECT SPO2, BLOODPRESSURE, HEIGHT, WEIGHT, BMI, HEARTBEAT FROM HUMAN";
			PreparedStatement ps_getMember = con.prepareStatement(sql_getMember);
			ResultSet rs_getMember = ps_getMember.executeQuery();
			int i = 0;
			while (rs_getMember.next() && i != 4) {
				if (i == 0) {
					dad = new HumanModel("DAD", Math.round(rs_getMember.getFloat("SPO2")), Math.round(rs_getMember.getFloat("BLOODPRESSURE")), Math.round(rs_getMember.getFloat("HEIGHT")), Math.round(rs_getMember.getFloat("WEIGHT")), Math.round(rs_getMember.getFloat("BMI")*100), rs_getMember.getInt("HEARTBEAT"));
					weight1.setText(String.valueOf(dad.getWeight()) + " kg");
					height1.setText(String.valueOf(dad.getHeight()) + " m");
					bmi1.setText(String.valueOf("BMI: " + dad.getBMI()));
					bloodPressure1.setText("Huyết áp: "+ String.valueOf(dad.getBloodPressure()));
					spo2_1.setText(String.valueOf("Spo2: " + dad.getSpo2()));
					heartBeat1.setText(String.valueOf("Nhịp tim: " + dad.getHeartBeat()));
					
					if (dad.getBloodPressure() < 81) {
						bloodPressure1.setFill(Color.RED);
					}
					else if (dad.getBloodPressure() > 129) {
						bloodPressure1.setFill(Color.RED);
					}
					else {
						bloodPressure1.setStyle("-fx-base: #4CAF50;");
					}
					
					if (dad.getSpo2() <= 92) {
						spo2_1.setFill(Color.RED);
					}
					else {
						spo2_1.setStyle("-fx-base: #4CAF50;");
					}
					
					if (dad.getHeartBeat() < 60) {
						heartBeat1.setFill(Color.RED);
					}
					else if (dad.getHeartBeat() > 100) {
						heartBeat1.setFill(Color.RED);
					}

				}
				else if (i == 1) {
					mom = new HumanModel("MOM", Math.round(rs_getMember.getFloat("SPO2")), Math.round(rs_getMember.getFloat("BLOODPRESSURE")), Math.round(rs_getMember.getFloat("HEIGHT")), Math.round(rs_getMember.getFloat("WEIGHT")), Math.round(rs_getMember.getFloat("BMI")*100), rs_getMember.getInt("HEARTBEAT"));
					weight2.setText(String.valueOf(mom.getWeight()) + " kg");
					height2.setText(String.valueOf(mom.getHeight()) + " m");
					bmi2.setText("BMI: " + String.valueOf(mom.getBMI()));
					bloodPressure2.setText("Huyết áp: " + String.valueOf(mom.getBloodPressure()));
					spo2_2.setText("Spo2: " + String.valueOf(mom.getSpo2()));
					heartBeat2.setText("Nhịp tim: " + String.valueOf(mom.getHeartBeat()));
					
					if (mom.getBloodPressure() < 81) {
						bloodPressure2.setFill(Color.RED);
					}
					else if (mom.getBloodPressure() > 129) {
						bloodPressure2.setFill(Color.RED);
					}
					else {
						bloodPressure2.setStyle("-fx-base: #4CAF50;");
					}
					
					if (mom.getSpo2() <= 92) {
						spo2_2.setFill(Color.RED);
					}
					else {
						spo2_2.setStyle("-fx-base: #4CAF50;");
					}
					
					if (mom.getHeartBeat() < 60) {
						heartBeat2.setFill(Color.RED);;
					}
					else if (mom.getHeartBeat() > 100) {
						heartBeat2.setFill(Color.RED);;
					}

					
				}
				else if (i == 2) {
					kid1 = new HumanModel("KID1", Math.round(rs_getMember.getFloat("SPO2")), Math.round(rs_getMember.getFloat("BLOODPRESSURE")), Math.round(rs_getMember.getFloat("HEIGHT")), Math.round(rs_getMember.getFloat("WEIGHT")), Math.round(rs_getMember.getFloat("BMI")*100), rs_getMember.getInt("HEARTBEAT"));
					weight3.setText(String.valueOf(kid1.getWeight()) + " kg");
					height3.setText(String.valueOf(kid1.getHeight()) + " m");
					bmi3.setText("BMI: " + String.valueOf(kid1.getBMI()));
					bloodPressure3.setText("Huyết áp: " + String.valueOf(kid1.getBloodPressure()));
					spo2_3.setText("Spo2: " + String.valueOf(kid1.getBloodPressure()));
					heartBeat3.setText("Nhịp tim: " + String.valueOf(kid1.getBloodPressure()));
					if (kid1.getBloodPressure() < 81) {
						bloodPressure3.setFill(Color.RED);;
					}
					else if (kid1.getBloodPressure() > 129) {
						bloodPressure3.setFill(Color.RED);;
					}
					else {
						bloodPressure3.setStyle("-fx-base: #4CAF50;");
					}
					
					if (kid1.getSpo2() <= 92) {
						spo2_3.setFill(Color.RED);;
					}
					else {
						spo2_3.setStyle("-fx-base: #4CAF50;");
					}
					
					if (kid1.getHeartBeat() < 60) {
						heartBeat3.setFill(Color.RED);
					}
					else if (kid1.getHeartBeat() > 100) {
						heartBeat3.setFill(Color.RED);
					}

				}
				else {
					kid2 = new HumanModel("KID2", Math.round(rs_getMember.getFloat("SPO2")), Math.round(rs_getMember.getFloat("BLOODPRESSURE")), Math.round(rs_getMember.getFloat("HEIGHT")), Math.round(rs_getMember.getFloat("WEIGHT")), Math.round(rs_getMember.getFloat("BMI")*100), rs_getMember.getInt("HEARTBEAT"));
					weight4.setText(String.valueOf(kid2.getWeight()) + " m");
					height4.setText(String.valueOf(kid2.getHeight()) + " kg");
					bmi4.setText("BMI: " +String.valueOf(kid2.getBMI()));
					bloodPressure4.setText("Huyết áp: " + String.valueOf(kid2.getBloodPressure()));
					spo2_4.setText(String.valueOf("Spo2: " + kid2.getBloodPressure()));
					heartBeat4.setText(String.valueOf("Nhịp tim: " + kid2.getBloodPressure()));
					
					if (kid2.getBloodPressure() < 81) {
						bloodPressure4.setFill(Color.RED);
					}
					else if (kid2.getBloodPressure() > 129) {
						bloodPressure4.setFill(Color.RED);
					}
					else {
						bloodPressure4.setStyle("-fx-base: #4CAF50;");
					}
					
					if (kid2.getSpo2() <= 92) {
						spo2_4.setFill(Color.RED);
					}
					else {
						spo2_4.setStyle("-fx-base: #4CAF50;");
					}
					
					if (kid2.getHeartBeat() < 60) {
						heartBeat4.setFill(Color.RED);
					}
					else if (kid2.getHeartBeat() > 100) {
						heartBeat4.setFill(Color.RED);
					}

				}
				i += 1;
			}
			Time.setText("Time: " + TimeNe.getTime());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
