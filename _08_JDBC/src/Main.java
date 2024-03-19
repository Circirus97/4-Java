import controller.CoderController;
import database.ConfigDB;

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

            }

        }while (!option.equals("6"));
    }
}