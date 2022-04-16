package org.nitc.SmartHome;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Controller.ConnectDataBase;
import Controller.DataHandling;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private Button AboutButton;

    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void AboutClick(ActionEvent event) throws IOException {
    	App.setRoot("primary");
    }

    @FXML
    void LoginClick(ActionEvent event) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_getAirC = "SELECT USERNAME, PASSWORDAC FROM ACCOUNT";
		PreparedStatement ps_getAirC = con.prepareStatement(sql_getAirC);
		ResultSet rs_getAirC = ps_getAirC.executeQuery();
		rs_getAirC.next();
		System.out.println(username.getText().toCharArray());
		System.out.println(rs_getAirC.getString("USERNAME"));
		if (DataHandling.XuLyChu(username.getText().toCharArray()).equals(rs_getAirC.getString("USERNAME")) && DataHandling.XuLyChu(password.getText().toCharArray()).equals(rs_getAirC.getString("PASSWORDAC"))) {
	    	App.setRoot("secondary");
		}
		else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Đăng nhập thất bại");
			alert.setHeaderText("Sai tài khoản hoặc mật khẩu");
			alert.setContentText("Mời bạn thử lại sau");	
			alert.showAndWait();
		}
    }

}
