package gptcalc;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GPACalc extends Application{
     int totalH=0;
     double totalW=0,total=0;
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage prime){
     VBox sub = new VBox(10);
     HBox subCom1 = new HBox(10);
     HBox subCom2 = new HBox(10);
     HBox subCom3 = new HBox(10);
     HBox subCom4 = new HBox(10);
     HBox subCom5 = new HBox(10);
     HBox subCom6 = new HBox(10);
     HBox subCom7 = new HBox(10);
     /////////////////////////////////////////////////////////////////////////////
     HBox subComX = new HBox(10);
     Label subNameX = new Label("your previous hours:");
     subNameX.setFont(Font.font("Comic Sans MS",15));
     TextField txtX = new TextField("Cumulative passing hours");
     txtX.setPrefWidth(160);
     Label subNameXX = new Label("Your previous GPA:");
     subNameXX.setFont(Font.font("Comic Sans MS",15));
     TextField txtXX = new TextField("previous GPA");
     subComX.getChildren().addAll(subNameX,txtX,subNameXX,txtXX);
     /////////////////////////////////////////////////////////////////////////////
     Label subName1 = new Label("Subject #1");
     subName1.setFont(Font.font("Comic Sans MS",15));
     CheckBox subCheck1 = new CheckBox();
     Label symbol1 = new Label("expected symbol:");
     symbol1.setFont(Font.font("Comic Sans MS",15));
     TextField txt1 = new TextField("e.g (4.00 , 3.75 , ...)");
     Label weight1 = new Label("The Subject weight");
     weight1.setFont(Font.font("Comic Sans MS",15));
     TextField Hours1 = new TextField("e.g (1 , 2 , ...)");
     symbol1.setDisable(true);
     txt1.setDisable(true);
     weight1.setDisable(true);
     Hours1.setDisable(true);
     subCheck1.setOnAction(e->{
     if(subCheck1.isSelected()){
          symbol1.setDisable(false); 
          txt1.setDisable(false);     
          weight1.setDisable(false);
          Hours1.setDisable(false);}
     else {
          symbol1.setDisable(true); 
          txt1.setDisable(true);
          weight1.setDisable(true);
          Hours1.setDisable(true);}});
     subCom1.getChildren().addAll(subName1,subCheck1,weight1,Hours1,symbol1,txt1);
     ///////////////////////////////////////////////////////////////////////////////
     Label subName2 = new Label("Subject #2");
     subName2.setFont(Font.font("Comic Sans MS",15));
     CheckBox subCheck2 = new CheckBox();
     Label symbol2 = new Label("expected symbol:");
     symbol2.setFont(Font.font("Comic Sans MS",15));
     TextField txt2 = new TextField("e.g (4.00 , 3.75 , ...)");
     Label weight2 = new Label("The Subject weight");
     weight2.setFont(Font.font("Comic Sans MS",15));
     TextField Hours2 = new TextField("e.g (1 , 2 , ...)");
     symbol2.setDisable(true);
     txt2.setDisable(true);
     weight2.setDisable(true);
     Hours2.setDisable(true);
     subCheck2.setOnAction(e->{
     if(subCheck2.isSelected()){
         symbol2.setDisable(false); 
         txt2.setDisable(false);
         weight2.setDisable(false);
         Hours2.setDisable(false);}
     else {
         symbol2.setDisable(true); 
         txt2.setDisable(true);
         weight2.setDisable(true);
         Hours2.setDisable(true);}});
     subCom2.getChildren().addAll(subName2,subCheck2,weight2,Hours2,symbol2,txt2);
     ////////////////////////////////////////////////////////////////////////////////
     Label subName3 = new Label("Subject #3");
     subName3.setFont(Font.font("Comic Sans MS",15));
     CheckBox subCheck3 = new CheckBox();
     Label symbol3 = new Label("expected symbol:");
     symbol3.setFont(Font.font("Comic Sans MS",15));
     TextField txt3 = new TextField("e.g (4.00 , 3.75 , ...)");
     Label weight3 = new Label("The Subject weight");
     weight3.setFont(Font.font("Comic Sans MS",15));
     TextField Hours3 = new TextField("e.g (1 , 2 , ...)");
     symbol3.setDisable(true);
     txt3.setDisable(true);
     weight3.setDisable(true);
     Hours3.setDisable(true);
     subCheck3.setOnAction(e->{
     if(subCheck3.isSelected()){
         symbol3.setDisable(false); 
         txt3.setDisable(false);
         weight3.setDisable(false);
         Hours3.setDisable(false);}
     else {
         symbol3.setDisable(true); 
         txt3.setDisable(true);
         weight3.setDisable(true);
         Hours3.setDisable(true);}});
     subCom3.getChildren().addAll(subName3,subCheck3,weight3,Hours3,symbol3,txt3);
     //////////////////////////////////////////////////////////////////////////////
     Label subName4 = new Label("Subject #4");
     subName4.setFont(Font.font("Comic Sans MS",15));
     CheckBox subCheck4 = new CheckBox();
     Label symbol4 = new Label("expected symbol:");
     symbol4.setFont(Font.font("Comic Sans MS",15));
     TextField txt4 = new TextField("e.g (4.00 , 3.75 , ...)");
     Label weight4 = new Label("The Subject weight");
     weight4.setFont(Font.font("Comic Sans MS",15));
     TextField Hours4 = new TextField("e.g (1 , 2 , ...)");
     symbol4.setDisable(true);
     txt4.setDisable(true);
     weight4.setDisable(true);
     Hours4.setDisable(true);
     subCheck4.setOnAction(e->{
     if(subCheck4.isSelected()){
         symbol4.setDisable(false); 
         txt4.setDisable(false);
         weight4.setDisable(false);
         Hours4.setDisable(false);}
     else {
         symbol4.setDisable(true); 
         txt4.setDisable(true);
         weight4.setDisable(true);
         Hours4.setDisable(true);}});
     subCom4.getChildren().addAll(subName4,subCheck4,weight4,Hours4,symbol4,txt4);
     /////////////////////////////////////////////////////////////////////////////
     Label subName5 = new Label("Subject #5");
     subName5.setFont(Font.font("Comic Sans MS",15));
     CheckBox subCheck5 = new CheckBox();
     Label symbol5 = new Label("expected symbol:");
     symbol5.setFont(Font.font("Comic Sans MS",15));
     TextField txt5 = new TextField("e.g (4.00 , 3.75 , ...)");
     Label weight5 = new Label("The Subject weight");
     weight5.setFont(Font.font("Comic Sans MS",15));
     TextField Hours5 = new TextField("e.g (1 , 2 , ...)");
     symbol5.setDisable(true);
     txt5.setDisable(true);
     weight5.setDisable(true);
     Hours5.setDisable(true);
     subCheck5.setOnAction(e->{
     if(subCheck5.isSelected()){
         symbol5.setDisable(false); 
         txt5.setDisable(false);
         weight5.setDisable(false);
         Hours5.setDisable(false);}
     else {
         symbol5.setDisable(true); 
         txt5.setDisable(true);
         weight5.setDisable(true);
         Hours5.setDisable(true);}});
     subCom5.getChildren().addAll(subName5,subCheck5,weight5,Hours5,symbol5,txt5);
     ////////////////////////////////////////////////////////////////////////////////
     Label subName6 = new Label("Subject #6");
     subName6.setFont(Font.font("Comic Sans MS",15));
     CheckBox subCheck6 = new CheckBox();
     Label symbol6 = new Label("expected symbol:");
     symbol6.setFont(Font.font("Comic Sans MS",15));
     TextField txt6 = new TextField("e.g (4.00 , 3.75 , ...)");
     Label weight6 = new Label("The Subject weight");
     weight6.setFont(Font.font("Comic Sans MS",15));
     TextField Hours6 = new TextField("e.g (1 , 2 , ...)");
     symbol6.setDisable(true);
     txt6.setDisable(true);
     weight6.setDisable(true);
     Hours6.setDisable(true);
     subCheck6.setOnAction(e->{
     if(subCheck6.isSelected()){
         symbol6.setDisable(false); 
         txt6.setDisable(false);
         weight6.setDisable(false);
         Hours6.setDisable(false);}
     else {
         symbol6.setDisable(true); 
         txt6.setDisable(true);
         weight6.setDisable(true);
         Hours6.setDisable(true);}});
     subCom6.getChildren().addAll(subName6,subCheck6,weight6,Hours6,symbol6,txt6);
     //////////////////////////////////////////////////////////////////////////////
     Label subName7 = new Label("Subject #7");
     subName7.setFont(Font.font("Comic Sans MS",15));
     CheckBox subCheck7 = new CheckBox();
     Label symbol7 = new Label("expected symbol:");
     symbol7.setFont(Font.font("Comic Sans MS",15));
     TextField txt7 = new TextField("e.g (4.00 , 3.75 , ...)");
     Label weight7 = new Label("The Subject weight");
     weight7.setFont(Font.font("Comic Sans MS",15));
     TextField Hours7 = new TextField("e.g (1 , 2 , ...)");
     symbol7.setDisable(true);
     txt7.setDisable(true);
     weight7.setDisable(true);
     Hours7.setDisable(true);
     subCheck7.setOnAction(e->{
     if(subCheck7.isSelected()){
         symbol7.setDisable(false); 
         txt7.setDisable(false);
         weight7.setDisable(false);
         Hours7.setDisable(false);}
     else {
         symbol7.setDisable(true); 
         txt7.setDisable(true);
         weight7.setDisable(true);
         Hours7.setDisable(true);}});
     subCom7.getChildren().addAll(subName7,subCheck7,weight7,Hours7,symbol7,txt7);
     ////////////////////////////////////////////////////////////////////////////////
     HBox finBox1 = new HBox(5);
     Label finName1 = new Label("your semester average:");
     finName1.setFont(Font.font("Comic Sans MS",15));
     TextField fintxt1 = new TextField("0.00");
     fintxt1.setPrefWidth(100);
     Label finName2 = new Label("Your cumulative GPA:");
     finName2.setFont(Font.font("Comic Sans MS",15));
     TextField fintxt2 = new TextField("0.00");
     fintxt2.setPrefWidth(100);
     Button finButton1 = new Button("Calculate the GPA");
     //------------------------------------------------------------------------//
     finButton1.setOnAction(e->{
     if(subCheck1.isSelected()){total+= Double.parseDouble(txt1.getText()) * Integer.parseInt(Hours1.getText()); totalH+= Integer.parseInt(Hours1.getText());}
     if(subCheck2.isSelected()){total+= Double.parseDouble(txt2.getText()) * Integer.parseInt(Hours2.getText()); totalH+= Integer.parseInt(Hours2.getText());}
     if(subCheck3.isSelected()){total+= Double.parseDouble(txt3.getText()) * Integer.parseInt(Hours3.getText()); totalH+= Integer.parseInt(Hours3.getText());}
     if(subCheck4.isSelected()){total+= Double.parseDouble(txt4.getText()) * Integer.parseInt(Hours4.getText()); totalH+= Integer.parseInt(Hours4.getText());}
     if(subCheck5.isSelected()){total+= Double.parseDouble(txt5.getText()) * Integer.parseInt(Hours5.getText()); totalH+= Integer.parseInt(Hours5.getText());}
     if(subCheck6.isSelected()){total+= Double.parseDouble(txt6.getText()) * Integer.parseInt(Hours6.getText()); totalH+= Integer.parseInt(Hours6.getText());}
     if(subCheck7.isSelected()){total+= Double.parseDouble(txt7.getText()) * Integer.parseInt(Hours7.getText()); totalH+= Integer.parseInt(Hours7.getText());}
     double semester = total/totalH;
     fintxt1.setText(Double.toString(semester));
     double PreGPA = Double.parseDouble(txtXX.getText());
     int PreHours = Integer.parseInt(txtX.getText());
     double cumulative = PreGPA*PreHours;
     double finalCumulative = (cumulative+(semester*totalH))/(PreHours+totalH);
     String numR = Double.toString(finalCumulative);
     double ad =(Double.parseDouble((numR.charAt(3)+"")))+1;
     String numRou = numR.charAt(0)+""+numR.charAt(1)+""+numR.charAt(2)+""+(int)ad;
     fintxt2.setText(numRou);
     });
     //------------------------------------------------------------------------//
     Button finButton2 = new Button("Clear!!!");
     finButton2.setOnAction(e->{
     prime.close();
     Platform.runLater(()-> new GPACalc().start(prime));
     //prime.setScene(new Scene(new StackPane()));
     prime.show();});
     //------------------------------------------------------------------------//
     finBox1.getChildren().addAll(finName1,fintxt1,finName2,fintxt2,finButton1,finButton2);
     /////////////////////////////////////////////////////////////////////////////
     Label titile = new Label("BAU GPA Calculator");
     titile.setFont(Font.font("Comic Sans MS",18));
     titile.setTranslateX(380);
     sub.getChildren().addAll(titile,subComX,subCom1,subCom2,subCom3,subCom4,subCom5,subCom6,subCom7,finBox1);
     Label all = new Label("The Symbols numeric values\n\n         A = 4.00\tA- = 3.75\n\nB+ = 3.50\tB = 3.00\tB- = 2.75\n\nC+ = 2.50\tC = 2.00\t C- =1.75\n\n D+= 1.50\tD = 1.00\tD- = 0.75\n\n         F = 0.50\tF* = 0.50"); 
     all.setFont(Font.font("Comic Sans MS",15));
     all.setTextFill(Color.RED);
     all.setTranslateY(65);
     HBox allBox = new HBox();
     allBox.getChildren().addAll(sub,all);
     Scene scene = new Scene(allBox,927,350);
     prime.setTitle("BAU GPA Calculator");
     prime.setScene(scene);
     prime.show();
    }
}

