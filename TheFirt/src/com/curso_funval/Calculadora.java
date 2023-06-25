package com.curso_funval;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.curso_funval.Aritmetica;

public class Calculadora extends Application  {
	public static double resultado = 0;
	public static double valor1 = 0;
	public static double valor2 = 0;
	public static String entrada1 = "";
	public static String entrada2= "";
	public static String entra_punto = "";
	public static String operacion_anterior = "";
	public static String mensaje_error = "No dividir entre Cero";
	static Label lb = new Label("0");
	public static void setAccion(Button btn) {
		btn.setOnAction(new EventHandler<ActionEvent>() {  
            
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
            	String ec = btn.getText();
            	if(lb.getText().equals(mensaje_error)) {lb.setText("0");}
            	if(operacion_anterior == "") {
	            	switch(ec) {
	            		case "C":
	            			lb.setText("0");
	            			entrada1 = "";
	            			entrada2 = "";
	            			entra_punto = "";
	            			operacion_anterior = "";
	            			valor1 = 0;
	            			valor2 = 0;
	            			resultado = 0;
	            			break;
	            		case "+":case "-":case "*":case "/":case "=":
	            			if(entrada1.equals("")) {
	            				resultado = Double.parseDouble(lb.getText());
	            				operacion_anterior = "";
	            				entra_punto = "";
	            			}else { 
	            				resultado = Double.parseDouble(lb.getText());
	            				operacion_anterior = ec.equals("") ? "" : ec;
	            				entra_punto = "";
	            			}
	            			break;
	            		default:
	            			if(ec == ".") {
	            				if(entra_punto != ".") {
	            					entrada1 = entrada1+ec;
	                    			lb.setText(entrada1);
	                    			entra_punto = ec;
	                			}else {
	                				entra_punto =ec;
	                			}
	            			}else {
	            				entrada1 = entrada1+ec;
	                			lb.setText(entrada1);
	            			}
	            			break;
	            	}
            	}else {
            		switch(ec) {
	            		case "C":
	            			lb.setText("0");
	            			entrada1 = "";
	            			entrada2 = "";
	            			entra_punto = "";
	            			operacion_anterior = "";
	            			valor1 = 0;
	            			valor2 = 0;
	            			resultado = 0;
	            			break;
	            		case "+":case "-":case "*":case "/":case "=":
	            			evalua(operacion_anterior, ec);
	            			break;
	            		default:
	            			if(ec == ".") {
	            				if(entra_punto != ".") {
	            					entrada2 = entrada2+ec;
	                    			lb.setText(entrada2);
	                    			entra_punto = ec;
	                			}else {
	                				entra_punto =ec;
	                			}
	            			}else {
	            				entrada2 = entrada2+ec;
	                			lb.setText(entrada2);
	            			}
	            			break;
	            	}
            	}
            }  
        });
	}
	
	public static void evalua(String operacion_ant, String entrada_actual) {
		String error="";
		Aritmetica calc = new Aritmetica();
		switch (operacion_ant) {
			case "=":
			// resultado = calc.suma(resultado, Double.parseDouble(lb.getText()));
			break;
			case "+":
				resultado = calc.suma(resultado, Double.parseDouble(lb.getText()));
    			break;
			case "-":
				resultado = calc.resta(resultado, Double.parseDouble(lb.getText()));
    			break;
			case "*":
				resultado = calc.multiplicacion(resultado, Double.parseDouble(lb.getText()));
    			break;
			case "/":
				Double check0 = Double.parseDouble(lb.getText());
				if(check0 == 0) {
					resultado = 0;
					error = mensaje_error;
				}else {
					resultado = calc.division(resultado , Double.parseDouble(lb.getText()));
				}
    			break;
		}
		entrada1="";
		entrada2="";
		entra_punto = "";
		if(error.equals("")) {
			lb.setText(resultado+"");
				operacion_anterior = entrada_actual;// entrada_actual.equals("=") ? "": entrada_actual;
		}else {
			lb.setText(error);
			operacion_anterior = "";
		}
		
	}

    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
    	// create a label
        
        lb.setPrefSize(300, 200);
        lb.setStyle("-fx-border-color: gray;");
        Button btnIgual=new Button("="); 
        Button btn1=new Button("1");  
        Button btn2=new Button("2");  
        Button btn3=new Button("3");  
        Button btn4=new Button("4");  
        Button btn5=new Button("5");  
        Button btn6=new Button("6");  
        Button btn7=new Button("7");  
        Button btn8=new Button("8");  
        Button btn9=new Button("9");  
        Button btnPunto=new Button(".");  
        Button btn0=new Button("0");  
        Button btnClear=new Button("C"); 
        Button btnSuma=new Button("+");  
        Button btnResta=new Button("-");  
        Button btnMulti=new Button("*");  
        Button btnDiv=new Button("/");
        int ancho = 100, alto =100;
        btnIgual.setPrefSize(100, 200);
        btn1.setPrefSize(ancho, alto);  
        btn2.setPrefSize(ancho, alto);
        btn3.setPrefSize(ancho, alto);
        btn4.setPrefSize(ancho, alto);
        btn5.setPrefSize(ancho, alto);  
		btn6.setPrefSize(ancho, alto);  
		btn7.setPrefSize(ancho, alto);  
		btn8.setPrefSize(ancho, alto);  
		btn9.setPrefSize(ancho, alto);  
		btnPunto.setPrefSize(ancho, alto);  
		btn0.setPrefSize(ancho, alto);  
		btnClear.setPrefSize(ancho, alto); 
		btnSuma.setPrefSize(ancho, alto);  
		btnResta.setPrefSize(ancho, alto);  
		btnMulti.setPrefSize(ancho, alto);  
		btnDiv.setPrefSize(ancho, alto);  
        setAccion(btn1);
        setAccion(btn2);
        setAccion(btn3);
        setAccion(btn4);
        setAccion(btn5);
        setAccion(btn6);
        setAccion(btn7);
        setAccion(btn8);
        setAccion(btn9);
        setAccion(btn0);
        setAccion(btnPunto);
        setAccion(btnClear);
        setAccion(btnSuma);
        setAccion(btnResta);
        setAccion(btnDiv);
        setAccion(btnMulti);
        setAccion(btnIgual);

        HBox hboxlb = new HBox(lb,btnIgual);
        HBox hbox1 = new HBox(btn1, btn2, btn3, btnSuma);
        HBox hbox2 = new HBox(btn4, btn5, btn6, btnResta);
        HBox hbox3 = new HBox(btn7, btn8, btn9, btnMulti);
        HBox hbox4 = new HBox(btnPunto, btn0, btnClear, btnDiv);
        VBox vbox = new VBox(hboxlb,hbox1,hbox2,hbox3,hbox4);

        BorderPane borderPane = new BorderPane(vbox);
        BorderPane.setMargin(vbox, new Insets(10, 10, 10, 10));
        
        Scene scene=new Scene(borderPane,300,200);      
        primaryStage.setTitle("Calculadora");  
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }  
    
    public static void main (String[] args)  
    {  
        launch(args);  
    }  
  
}