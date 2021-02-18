package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.JdbcDao;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class CreateController {
    private Stage primaryStage;

    @FXML
    private TextField emailTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField balanceTextField;
    @FXML
    private TextField countryTextField;
    @FXML
    private TextField bankTextField;
    @FXML
    private TextField full_nameTextField;



    @FXML
    private void create()throws SQLException, IOException {
        String email = emailTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String phone = phoneTextField.getText();

        String balance =  balanceTextField.getText();
        int balanceInt = Integer.parseInt(balance);


        String country = countryTextField.getText();
        String bank = bankTextField.getText();
        String full_name = full_nameTextField.getText();

        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.addDataOwner(email,username, password,phone, balanceInt, country, bank, full_name);
    }







    @FXML
    private void clickBack() throws IOException {
        URL location = getClass().getResource("/fxml/ownerChoice.fxml");

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
