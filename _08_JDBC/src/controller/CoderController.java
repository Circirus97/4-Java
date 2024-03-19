package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;

public class CoderController {

    CoderModel objCoderModel;

    public CoderController() {

        //Crear una instancia del modelo
        this.objCoderModel = new CoderModel();
    }

    //Método para listar todos los coders
    public void getAll() {

        String list = "List Coders: \n";

        //Iteramos sobre la lista que devuelve el método findAll
        for (Object obj : this.objCoderModel.findAll()) {

            // Convertimos o casteamos el objeto tipo Object a un coder
            Coder objCoder = (Coder) obj;

            //Concatenamos la información
            list += objCoder.toString() + "\n";
        }

        //Mostramos la información
        JOptionPane.showMessageDialog(null, list);

    }

    public void create(){


        Coder objCoder = new Coder();

        String name = JOptionPane.showInputDialog("Insert name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Insert age: "));
        String clan = JOptionPane.showInputDialog("Insert name clan: ");

        objCoder.setName(name);
        objCoder.setAge(age);
        objCoder.setClan(clan);

        objCoder = (Coder) this.objCoderModel.insert(objCoder);

        JOptionPane.showMessageDialog(null, objCoder.toString());


    }

}
