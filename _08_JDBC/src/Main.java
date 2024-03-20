import controller.CoderController;
import database.ConfigDB;
import model.CoderModel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CoderController objCoderController = new CoderController();
        String option = "";

        do {
            option = JOptionPane.showInputDialog("""
                        MENU
                        1. List Coders
                        2. Insert Coder
                        3. Update Coder
                        4. Delete Coder
                        5. Get by name
                        6. EXIT
                        
                        Choose an option
                    """);

            switch (option){

                case "1": //List coders
                    objCoderController.getAll();
                    break;

                case "2": //Insert coders
                    objCoderController.create();
                    break;

                case "4": //Delete coders
                    objCoderController.delete();
                    break;

                case "5": //Find by name coders
                    objCoderController.find();
                    break;


            }
        }while (!option.equals("6"));
    }
}