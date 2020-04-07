package com.company;
import com.company.entity.Dron;
import com.company.entity.Tool;

public class Main {

    public static void main(String[] args) {

        Tool tool = new Tool ();
        tool.setNameTool("Taser");
        tool.setWeight (300);

	    Dron dron = new Dron();
	    dron.setCamaraType( "Go Pro" );
        dron.setHeight(100);
	    dron.setSpeed(5);
        dron.setTool(tool);
        dron.generateFeature();
        System.out.println(dron.showFeature());
    }
}
