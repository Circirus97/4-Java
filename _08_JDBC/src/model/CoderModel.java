package model;

import database.CRUD;
import database.ConfigDB;
import entity.Coder;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoderModel implements CRUD {


    @Override
    public Object insert(Object object) {

        //1. Abrir la connexión
        Connection objConnection = ConfigDB.openConnection();

        //2. Castear el objeto
        Coder objCoder = (Coder) object;

        try{

            //3. Crear el SQL
            String sql = "INSERT INTO coder(name, age, clan) VALUE(?, ?, ?);";

            //4. Preparar el statement
            PreparedStatement objPrepareStatement = (PreparedStatement) objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            //5.Asignar los ?
            objPrepareStatement.setString(1, objCoder.getName());
            objPrepareStatement.setInt(2, objCoder.getAge());
            objPrepareStatement.setString(3, objCoder.getClan());

            //6. Ejecutamos el Query
            objPrepareStatement.execute();

            //7. Obtener el resultado
            ResultSet objResult = objPrepareStatement.getGeneratedKeys();
            while(objResult.next()){
                objCoder.setId(objResult.getInt(1));
            }

            //8. Cerramos el prepareStatement
            objPrepareStatement.close();
            JOptionPane.showMessageDialog(null, "Coder insertion was successful.");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error adding Coder " + e.getMessage());
        };

        //9. Cerramos la conexión

        return objCoder;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }

    @Override
    public List<Object> findAll() {

        //1. Abrir conexion
        Connection objConnection = ConfigDB.openConnection();

        //2. Inicializar la lista donde se almacenaran los registros que devuelve la BD
        List<Object> listCoders = new ArrayList<>();

        try {

            //3. Escribir la sentencia SQl
            String sql = "SELECT * FROM coder ORDER BY coder.id ASC;";

            //4. Utilizar PrepareStatement
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //5. Ejecutar la Query o el prepare
            ResultSet objResult = (ResultSet) objPreparedStatement.executeQuery();

            //6. Obtener los resultados
            while (objResult.next()) {
                Coder objCoder = new Coder();

                objCoder.setId(objResult.getInt("id"));
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("clan"));

                //7. Finalmente, agregamos el coder a la lista
                listCoders.add(objCoder);
            }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data acquisition Error");
        }

        //8. Cerramos la conexión
        ConfigDB.closeConnection();


        return listCoders;
    }

    @Override
    public Object findById(int id) {
        return null;
    }
}
