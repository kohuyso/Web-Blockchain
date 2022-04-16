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
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class BillController implements Initializable {

    @FXML
    private JFXButton About;

    @FXML
    private JFXButton DauTu;

    @FXML
    private JFXButton Home;

    @FXML
    private Text Time;

    @FXML
    private JFXButton Update;

    @FXML
    private PieChart pieChart;

    @FXML
    private Text totalMoney;

    @FXML
    void AboutClick(ActionEvent event) throws IOException {
    	App.setRoot("AboutPage");
    }

    @FXML
    void DauTuClick(ActionEvent event) {

    }

    @FXML
    void HomeClick(ActionEvent event) throws IOException {
    	App.setRoot("secondary");
    }

    @FXML
    void Time7(MouseEvent event) {

    }

    @FXML
    void UpdateClick(ActionEvent event) throws IOException {
    	App.setRoot("FamilyMemberPage");

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
//		// TODO Auto-generated method stub
		try {
			
			
			
			Connection con = ConnectDataBase.openConnection();
			String sql_getTimeT = "SELECT TIMET, CAPACITY FROM HISTORY WHERE EID = ? ORDER BY TIMET DESC";
			PreparedStatement ps_getTimeT = con.prepareStatement(sql_getTimeT);
			System.out.println("AGGGG");
			ps_getTimeT.setString(1, "TV7");
			ResultSet rs_getTimeT = ps_getTimeT.executeQuery();
			rs_getTimeT.next();
			String getTimeT = rs_getTimeT.getString("TIMET");
			float getCapacity = rs_getTimeT.getFloat("CAPACITY");
			String sql_soDien = "UPDATE HISTORY SET TIMES = ? WHERE EID = ? AND TIMET = ?";
			PreparedStatement ps_soDien = con.prepareStatement(sql_soDien);
			ps_soDien.setString(1, TimeNe.getTime());
			ps_soDien.setString(2, "TV7");
			ps_soDien.setString(3, getTimeT);
			ps_soDien.executeUpdate();
			
			String sql_soDien1 = "UPDATE HISTORY SET SODIEN = ? / 60 / 1000 * (SELECT DATEDIFF(MINUTE, TIMET, TIMES) FROM HISTORY WHERE EID = ? AND TIMET = ?) WHERE EID = ? AND TIMET = ?";
			PreparedStatement ps_soDien1 = con.prepareStatement(sql_soDien1);
			ps_soDien1.setFloat(1, 120);
			ps_soDien1.setString(2, "TV7");
			ps_soDien1.setString(3, getTimeT);
			ps_soDien1.setString(4, "TV7");
			ps_soDien1.setString(5, getTimeT);
			ps_soDien1.executeUpdate();
			
			
			String layMasql = "SELECT EID, SUM(SODIEN) AS SODIEN FROM V_HIS GROUP BY EID";
			PreparedStatement psLayMa = con.prepareStatement(layMasql);
			ResultSet rsCL = psLayMa.executeQuery();
			int sum = 0;
			while (rsCL.next()) {
				sum +=  Math.ceil(rsCL.getFloat("SODIEN"))*2134;
				ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
						new PieChart.Data(rsCL.getString("EID") + ": ", (Math.ceil(rsCL.getFloat("SODIEN"))*2134)));
//						while (rsCL.next()) {
//							new PieChart.Data("Tiền mặt: ", rsCL.getFloat("TIENMAT")),
//							new PieChart.Data("Cổ phiếu: ", rsCL.getFloat("TIENCP")));
//						}
						
					pieChartData.forEach(data -> 
						data.nameProperty().bind(
								Bindings.concat(
										data.getName(), data.pieValueProperty())));
					pieChart.getData().addAll(pieChartData);
			}
			totalMoney.setText("Tiền điện tháng này: " + sum + " VND");
			Time.setText("Time: " + TimeNe.getTime());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub



		
	}

}
