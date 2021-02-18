package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ControllerTransition {

    private Stage primaryStage;
    private FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    private void clickClient() throws IOException {
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
    @FXML
    private void clickClientChoiceLogin() throws IOException{
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
    private void clickClientChoiceJoin() throws IOException{
        URL location = getClass().getResource("/fxml/joinClient.fxml") ;

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

        Parent root = (Parent) fxmlLoader.load(location.openStream());



        JoinController controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
    }
    @FXML
    private void clickClientChoiceBack() throws IOException{
        URL location = getClass().getResource("/fxml/windowStart.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

        Parent root = (Parent) fxmlLoader.load(location.openStream());



        ControllerTransition controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
    }

    @FXML
    private void clickOwner() throws IOException {
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
    @FXML
    private void clickOwnerChoiceBack() throws IOException{
        URL location = getClass().getResource("/fxml/windowStart.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

        Parent root = (Parent) fxmlLoader.load(location.openStream());



        ControllerTransition controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
    }
    @FXML
    private void clickOwnerChoiceLogin() throws IOException{
        URL location = getClass().getResource("/fxml/loginOwner.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

        Parent root = (Parent) fxmlLoader.load(location.openStream());



        ControllerTransition controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
    }
    @FXML
    private void clickOwnerChoiceCreate() throws IOException{
        URL location = getClass().getResource("/fxml/createOwner.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

        Parent root = (Parent) fxmlLoader.load(location.openStream());



        CreateController controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
    }
    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }



}
