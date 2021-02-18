package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.JdbcDao;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class JoinController {
    private Stage primaryStage;

    @FXML
    TextField emailTextField;
    @FXML
    TextField usernameTextField;
    @FXML
    TextField passwordTextField;

    @FXML
    public void join() throws SQLException, IOException {
        System.out.println(emailTextField.getText());
        System.out.println(usernameTextField.getText());
        System.out.println(passwordTextField.getText());

        if (emailTextField.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Form error!");
            alert.setHeaderText(null);
            alert.setContentText("error your email");
            alert.showAndWait();
        }


        String email = emailTextField.getText();
        String password = passwordTextField.getText();
        String username = usernameTextField.getText();

        JdbcDao jdbcDao = new JdbcDao();

        jdbcDao.addData(username, email, password);

        URL location = getClass().getResource("/fxml/loginClient.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

        Parent root = (Parent) fxmlLoader.load(location.openStream());



        LoginController controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);


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
