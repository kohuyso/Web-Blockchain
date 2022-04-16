package org.nitc.SmartHome;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;

import Controller.AddDivecs;
import Controller.ConnectDataBase;
import Controller.DataHandling;
import Controller.TimeNe;
import Controller.swapMode;
import Model.TVModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class tvController implements Initializable {
	
	private String maTV1, maTV2, maTV3;
	private int lockTV1, lockTV2, lockTV3;
	private float capa1, capa2, capa3;
	

    public String getMaTV1() {
		return maTV1;
	}

	public void setMaTV1(String maTV1) {
		this.maTV1 = maTV1;
	}

	public String getMaTV2() {
		return maTV2;
	}

	public void setMaTV2(String maTV2) {
		this.maTV2 = maTV2;
	}

	public String getMaTV3() {
		return maTV3;
	}

	public void setMaTV3(String maTV3) {
		this.maTV3 = maTV3;
	}

	@FXML
    private JFXButton About;

    @FXML
    private JFXButton Bill;

    @FXML
    private TextField ChannelT1;

    @FXML
    private TextField ChannelT2;

    @FXML
    private TextField ChannelT3;

    @FXML
    private JFXButton Health;

    @FXML
    private JFXButton Home;

    @FXML
    private JFXRadioButton Lock1;

    @FXML
    private JFXRadioButton Lock2;

    @FXML
    private JFXRadioButton Lock3;

    @FXML
    private Button LockB;

    @FXML
    private TextField LockT;

    @FXML
    private Text Time;

    @FXML
    private Button UnlockB;

    @FXML
    private TextField UnlockT;

    @FXML
    private Button addDeviceB;

    @FXML
    private TextField addInsurance;

    @FXML
    private TextField addManu;

    @FXML
    private TextField addMedium;

    @FXML
    private TextField addNameDevice;

    @FXML
    private TextField addRoom;

    @FXML
    private Button chooseB1;

    @FXML
    private Button chooseB2;

    @FXML
    private Button chooseB3;

    @FXML
    private JFXButton ma1;

    @FXML
    private JFXButton ma2;

    @FXML
    private JFXButton ma3;

    @FXML
    private Text manufacture1;

    @FXML
    private Text manufacture2;

    @FXML
    private Text manufacture3;

    @FXML
    private JFXRadioButton onORoff1;

    @FXML
    private JFXRadioButton onORoff2;

    @FXML
    private JFXRadioButton onORoff3;

    @FXML
    private Text room1;

    @FXML
    private Text room2;

    @FXML
    private Text room3;

    @FXML
    private TextField volume1;

    @FXML
    private TextField volume2;

    @FXML
    private TextField volume3;

    @FXML
    void AboutClick(ActionEvent event) throws IOException {
    	App.setRoot("AboutPage");
    }

    @FXML
    void BillClick(ActionEvent event) {

    }

    @FXML
    void DongTienClick(ActionEvent event) {

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
    void LocNganhClick(ActionEvent event) {

    }

    @FXML
    void LockC(ActionEvent event) throws Exception {
    	Connection con = ConnectDataBase.openConnection();
    	String sql_lockChannel = "UPDATE LISTCHANNEL SET LOCKCHANNLE = 1 WHERE CHANNLE = ?";
    	PreparedStatement ps_lockChannel = con.prepareStatement(sql_lockChannel);
    	ps_lockChannel.setString(1, DataHandling.XuLyChu(LockT.getText().toCharArray()));
    	ps_lockChannel.executeUpdate();
    }

    @FXML
    void LockChoose1(ActionEvent event) throws Exception {
    	if (Lock1.isSelected()) {
    		TVModel.updateLock(maTV1, 0);
    		lockTV1 = 1;
    	}
    	else {
    		TVModel.updateLock(maTV1, 1);
    		lockTV1 = 0;
    	}
    }

    @FXML
    void LockChoose2(ActionEvent event) throws Exception {
    	if (Lock2.isSelected()) {
    		TVModel.updateLock(maTV2, 0);
    		lockTV2 = 1;
    	}
    	else {
    		TVModel.updateLock(maTV2, 1);
    		lockTV2 = 0;
    	}
    }

    @FXML
    void LockChoose3(ActionEvent event) throws Exception {
    	if (Lock3.isSelected()) {
    		TVModel.updateLock(maTV3, 0);
    		lockTV3 = 1;
    	}
    	else {
    		TVModel.updateLock(maTV3, 1);
    		lockTV3 = 0;
    	}
    }

    @FXML
    void LockRsiClick(ActionEvent event) {

    }

    @FXML
    void Time7(MouseEvent event) {

    }

    @FXML
    void UnlockC(ActionEvent event) throws Exception {
    	Connection con = ConnectDataBase.openConnection();
    	String sql_unLockChannel = "UPDATE LISTCHANNEL SET LOCKCHANNLE = 0 WHERE CHANNLE = ?";
    	PreparedStatement ps_unlockChannel = con.prepareStatement(sql_unLockChannel);
    	ps_unlockChannel.setString(1, DataHandling.XuLyChu(UnlockT.getText().toCharArray()));
    	ps_unlockChannel.executeUpdate();
    }

    @FXML
    void addDeviceC(ActionEvent event) throws Exception {
    	String maid = AddDivecs.addElectric(DataHandling.XuLyChu(addNameDevice.getText().toCharArray()), DataHandling.XuLyChu(addManu.getText().toCharArray()), DataHandling.XuLySoThayDoi(addRoom.getText().toCharArray()), DataHandling.XuLySo(addMedium.getText().toCharArray()), 0, 0, 0, 0, DataHandling.XuLySoThayDoi(addInsurance.getText().toCharArray()), 0, "TV");
    	AddDivecs.addTV(maid);
    	App.setRoot("tvPage");
    }

    @FXML
    void chooseC1(ActionEvent event) throws Exception {
    	String channel = DataHandling.XuLyChu(ChannelT1.getText().toCharArray());
    	int vol = DataHandling.XuLySoThayDoi(volume1.getText().toCharArray());
    	if (lockTV1 == 1) {
    		if (TVModel.checkLock(channel) == true) {
    			Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("Khóa kênh");
    			alert.setHeaderText("Kênh bị khóa");
    			alert.setContentText("Mở khóa kênh để truy cập");	
    			alert.showAndWait();
    		}
    		else {
        		TVModel.swapChannel(maTV1, channel, vol);
    		}
    	}
    	else {
    		TVModel.swapChannel(maTV1, channel, vol);
    	}
    }

    @FXML
    void chooseC2(ActionEvent event) throws Exception {
    	String channel = DataHandling.XuLyChu(ChannelT2.getText().toCharArray());
    	int vol = DataHandling.XuLySoThayDoi(volume2.getText().toCharArray());
    	if (lockTV2 == 1) {
    		if (TVModel.checkLock(channel) == true) {
    			Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("Khóa kênh");
    			alert.setHeaderText("Kênh bị khóa");
    			alert.setContentText("Mở khóa kênh để truy cập");	
    			alert.showAndWait();
    		}
    		else {
        		TVModel.swapChannel(maTV1, channel, vol);
    		}
    	}
    	else {
    		TVModel.swapChannel(maTV2, channel, vol);
    	}
    }

    @FXML
    void chooseC3(ActionEvent event) throws Exception {
    	String channel = DataHandling.XuLyChu(ChannelT3.getText().toCharArray());
    	int vol = DataHandling.XuLySoThayDoi(volume3.getText().toCharArray());
    	if (lockTV3 == 1) {
    		if (TVModel.checkLock(channel) == true) {
    			Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("Khóa kênh");
    			alert.setHeaderText("Kênh bị khóa");
    			alert.setContentText("Mở khóa kênh để truy cập");	
    			alert.showAndWait();
    		}
    		else {
        		TVModel.swapChannel(maTV1, channel, vol);
    		}
    	}
    	else {
    		TVModel.swapChannel(maTV3, channel, vol);
    	}
    }

    @FXML
    void onORoffC1(ActionEvent event) throws Exception {
		String id = DataHandling.XuLyChu(ma1.getText().toCharArray());
    	if (onORoff1.isSelected()) {
	    	swapMode.swap(2, id, 120);
    	}
    	else {
	    	swapMode.swap(0, id, 0);
    	}
    }

    @FXML
    void onORoffC2(ActionEvent event) throws Exception {
		String id = DataHandling.XuLyChu(ma1.getText().toCharArray());
    	if (onORoff1.isSelected()) {
	    	swapMode.swap(2, id, 120);
    	}
    	else {
	    	swapMode.swap(0, id, 0);
    	}
    }

    @FXML
    void onORoffC3(ActionEvent event) throws Exception {
		String id = DataHandling.XuLyChu(ma1.getText().toCharArray());
    	if (onORoff1.isSelected()) {
	    	swapMode.swap(2, id, 120);
    	}
    	else {
	    	swapMode.swap(0, id, 0);
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con = ConnectDataBase.openConnection();
			String sql_getAirC = "SELECT EID, LOCK, SOUNDVOLUME, CHANNEL FROM TV";
			PreparedStatement ps_getAirC = con.prepareStatement(sql_getAirC);
			ResultSet rs_getAirC = ps_getAirC.executeQuery();
			int step = 1;
			while (step != 4 && rs_getAirC.next()) {
				con = ConnectDataBase.openConnection();
				String sql_getAirCts = "SELECT EROOM, EMANUFACTURE, ESTATUS, CAPACITYN FROM ELECTRICDIVECS WHERE EID = ?";
				PreparedStatement ps_getAirCts = con.prepareStatement(sql_getAirCts);
				ps_getAirCts.setString(1, rs_getAirC.getString("EID"));
				ResultSet rs_getAirCts = ps_getAirCts.executeQuery();
				rs_getAirCts.next();
				int status = rs_getAirCts.getInt("ESTATUS");
				if (step == 1) {
					String id = rs_getAirC.getString("EID");
					if (status == 1) {
						onORoff1.setSelected(true);
					}
					setMaTV1(id);; 
					ma1.setText(id);
					capa1 = rs_getAirCts.getFloat("CAPACITYN");
					manufacture1.setText(rs_getAirCts.getString("EMANUFACTURE"));
					room1.setText(rs_getAirCts.getString("EROOM"));
					if (rs_getAirCts.getInt("ESTATUS") == 1) {
						onORoff1.setSelected(true);
					}
					else {
						onORoff1.setSelected(false);
					}
					
					ChannelT1.setText(rs_getAirC.getString("CHANNEL"));
					volume1.setText(rs_getAirC.getString("SOUNDVOLUME"));
					
					if (rs_getAirC.getInt("LOCK") == 1) {
						Lock1.setSelected(true);
						lockTV1 = 1;
					}
					else {
						lockTV1 = 0;
					}
										
					//lock 
				}
				else if (step == 2) {
					String id = rs_getAirC.getString("EID");
					ma2.setText(id);
					setMaTV2(id);
					if (status == 1) {
						onORoff2.setSelected(true);
					}
					capa2 = rs_getAirCts.getFloat("CAPACITYN");
					manufacture2.setText(rs_getAirCts.getString("EMANUFACTURE"));
					room2.setText(rs_getAirCts.getString("EROOM"));
					if (rs_getAirCts.getInt("ESTATUS") == 1) {
						onORoff2.setSelected(true);
					}
					else {
						onORoff2.setSelected(false);
					}

					
//					lock	
					if (rs_getAirC.getInt("LOCK") == 1) {
						Lock2.setSelected(true);
						lockTV2 = 1;
					}
					else {
						lockTV2 = 0;
					}
					
					
					ChannelT2.setText(rs_getAirC.getString("CHANNEL"));
					volume2.setText(rs_getAirC.getString("SOUNDVOLUME"));
				
					
				}
				else {
					String id = rs_getAirC.getString("EID");
					ma3.setText(id);
					setMaTV3(id);
					if (status == 1) {
						onORoff3.setSelected(true);
					}
					manufacture3.setText(rs_getAirCts.getString("EMANUFACTURE"));
					room3.setText(rs_getAirCts.getString("EROOM"));
					capa3 = rs_getAirCts.getFloat("CAPACITYN");
					if (rs_getAirCts.getInt("ESTATUS") == 1) {
						onORoff3.setSelected(true);
					}
					else {
						onORoff3.setSelected(false);
					}
					
					ChannelT3.setText(rs_getAirC.getString("CHANNEL"));
					volume3.setText(rs_getAirC.getString("SOUNDVOLUME"));
					
					//lock
					if (rs_getAirC.getInt("LOCK") == 1) {
						Lock3.setSelected(true);
						lockTV3 = 1;
					}
					else {
						lockTV3 = 0;
					}
					
				}
				step += 1;
			}
			Time.setText("Time: " + TimeNe.getTime());

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
