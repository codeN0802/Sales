/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.pojo.HoaDon;
import com.mycompany.mavenproject1.service.HangHoaService;
import com.mycompany.mavenproject1.service.HoaDonService;
import com.mycompany.mavenproject1.service.jdbcUtil;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class StaticController implements Initializable {

    private PieChart staticChart;
    @FXML
    private Button btnThongKeTheoThang;
    @FXML
    private Button btnThongKeTheoNam;
    @FXML
    private Button btnThongKeTheoQuy;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnThongKeTheoThang.setOnMouseClicked(e -> {
            try {
//                StackPane secondaryLayout = new StackPane();
                Parent root = FXMLLoader.load(getClass().getResource("StaticByMonth.fxml"));
                Scene secondScene = new Scene(root);
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Th???ng K?? Theo Th??ng");
                newWindow.setScene(secondScene);

                // Specifies the modality for new window.
                newWindow.initModality(Modality.WINDOW_MODAL);

                newWindow.show();
            } catch (IOException ex) {
                Logger.getLogger(StaticController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btnThongKeTheoQuy.setOnMouseClicked(e -> {
            try {
//                StackPane secondaryLayout = new StackPane();
                Parent root = FXMLLoader.load(getClass().getResource("StaticByQuy.fxml"));
                Scene secondScene = new Scene(root);
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Th???ng K?? Theo Qu??");
                newWindow.setScene(secondScene);

                // Specifies the modality for new window.
                newWindow.initModality(Modality.WINDOW_MODAL);

                newWindow.show();
            } catch (IOException ex) {
                Logger.getLogger(StaticController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btnThongKeTheoNam.setOnMouseClicked(e -> {
            try {
//                StackPane secondaryLayout = new StackPane();
                Parent root = FXMLLoader.load(getClass().getResource("StaticByYear.fxml"));
                Scene secondScene = new Scene(root);
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Th???ng K?? Theo N??m");
                newWindow.setScene(secondScene);

                // Specifies the modality for new window.
                newWindow.initModality(Modality.WINDOW_MODAL);

                newWindow.show();
            } catch (IOException ex) {
                Logger.getLogger(StaticController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
//        staticChart.setTitle("CoronaVirus Statistics COVID-19");
//        ObservableList<PieChart.Data> ol = FXCollections.observableArrayList(getListData());
//        staticChart.setData(ol);
//
//        for (PieChart.Data data : staticChart.getData()) {
//            data.nameProperty().set(data.getName() + " : " + (int) data.getPieValue());
//            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    Utils.getBox(data.getName(), Alert.AlertType.INFORMATION).show();
//                }
//            });
//        }
    }

//    public List<HoaDon> getListHoaDon() {
//         List<HoaDon> listHH;
//        try {
//            Connection conn = jdbcUtil.getConn();
//            HoaDonService s = new HoaDonService(conn);
//            listHH = s.getListHoaDonByMonth(4);
//            for (HoaDon hd : listHH) {
//                System.out.println(hd);
//            };
//             return listHH;
//        } catch (SQLException ex) {
//            Logger.getLogger(StaticController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//    }
}
