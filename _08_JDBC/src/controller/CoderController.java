package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;
import java.security.PublicKey;

public class CoderController {

    CoderModel objCoderModel;

    public CoderController() {

        //Crear una instancia del modelo
        this.objCoderModel = new CoderModel();
    }

    public void find(){

        String nameCoder = JOptionPane.showInputDialog(null, "Enter the name of the coder for search");

        String list = "List Coders: \n";


        for (Object obj : this.objCoderModel.findByName(nameCoder)){

            Coder objCoder = (Coder) obj;
            list += objCoder.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, list);

    }



    public void delete() {

        String listCoderString = "CODER LIST \n";

        for (Object obj : this.objCoderModel.findAll()) {
            Coder objCoder = (Coder) obj;
            listCoderString += objCoder.toString() + "\n";
        }

        int confirm = 1;

        int idDelete = Integer.parseInt(JOptionPane.showInputDialog(listCoderString + "Enter the ID of the coder to delete"));

        Coder objCoder = (Coder) this.objCoderModel.findById(idDelete);

        if (objCoder == null) {
            JOptionPane.showMessageDialog(null, "Coder not found.");

        } else {
            confirm = JOptionPane.showConfirmDialog(null, "Are your sure want to delete the coder: \n  " + objCoder.toString() + "?");

            //Si el usuario escogió que si entonces eliminamos
        }
        if (confirm == 0) {
            this.objCoderModel.delete((objCoder));
        }
    }

    //Método para listar todos los coders
    public void getAll() {

        String list = "List Coders: \n";

        //Iteramos sobre la lista que devuelve el método findAll
        for (Object obj : this.objCoderModel.findAll()) {

            // Convertimos el objeto tipo Object a un coder
            Coder objCoder = (Coder) obj;

            //Concatenamos la información
            list += objCoder.toString() + "\n";
        }

        //Mostramos la información
        JOptionPane.showMessageDialog(null, list);

    }

    public void create() {


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
