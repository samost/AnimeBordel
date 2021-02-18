package controller;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.JdbcDao;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class LoginController {

    @FXML
    private TextField emailTextField;
    @FXML
    private TextField passwordTextField;

    private Stage primaryStage;


    @FXML
    public void login() throws SQLException {
        String email = emailTextField.getText();
        String password = passwordTextField.getText();

        JdbcDao jdbcDao = new JdbcDao();

        boolean flag = jdbcDao.validate(email, password);

        if (!flag){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Form error!");
            alert.setHeaderText(null);
            alert.setContentText("error your data");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("GOOOOOOOOD");
            alert.setHeaderText(null);
            alert.setContentText("YOU ARE LOGIN");
            alert.showAndWait();
        }
    }



















    @FXML
    private void clickBack() throws IOException {
        URL location = getClass().getResource("/fxml/clientChoice.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

        Parent root = (Parent) fxmlLoader.load(location.openStream());



        ControllerTransition controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
