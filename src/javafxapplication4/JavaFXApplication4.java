/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author khatib
 */
public class JavaFXApplication4 extends Application {
    
//    @Override
//    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root, 300, 250);
//        
//        primaryStage.setTitle("Hello Worliiid!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
    private Label labelTitle, labelError;
    private TextField textFieldLodIn;
    private PasswordField passWordField;
    private Button buttonSubmit, buttonCancel;

    @Override
    public void start(Stage stage) throws Exception {
        labelTitle = new Label("Login information");
        textFieldLodIn = new TextField();
        textFieldLodIn.setPromptText("LogIn name");//هو عبارة عن نص يظهر داخله
        passWordField = new PasswordField();
        passWordField.setPromptText("LogIn PassWord");//هو عبارة عن نص يظهر داخله
        labelError = new Label("Initial Text");
        VBox vbox1 = new VBox(10, labelTitle, textFieldLodIn, passWordField);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setStyle("-fx-border-color:red");
        buttonSubmit = new Button("Submit");
        buttonSubmit = new Button("Cancel");
        vbox1.setStyle("-fx-border-color:blue");

        //اضافة الازرار على لاي اوت جديد 
        HBox hbox1 = new HBox();
        hbox1.setStyle("-fx-border-color:navy");

        //طريقة إضافة بعد انشاء الأوبجكت 
//        hbox1.getChildren().addAll(buttonCancel, buttonSubmit);
        hbox1.setSpacing(10);
        hbox1.setAlignment(Pos.CENTER);
        VBox vbox2 = new VBox(10, vbox1, hbox1);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(2));//ممكن اعطيه رقم واحد لكل الجهات او كل جهة الها رقم 

        //A new Layout To learn....
        //add controls in its constructor....
        //اعتبار انه هوا عبارة عن الRoot
        //بدي أضيفها على ال scene
        FlowPane flowPane = new FlowPane(vbox2);
        flowPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(flowPane, 400, 300);//ضفنا الأبعاد عليه
        //scene setting on stage..
        stage.setScene(scene);

        stage.setTitle("Login scene");
        stage.show();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
