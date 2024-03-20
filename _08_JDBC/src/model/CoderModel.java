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

        try {

            //3. Crear el SQL
            String sql = "INSERT INTO coder(name, age, clan) VALUE(?, ?, ?);";

            //4. Preparar el statement
            PreparedStatement objPrepareStatement = (PreparedStatement) objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            //5.Asignar los "?"
            objPrepareStatement.setString(1, objCoder.getName());
            objPrepareStatement.setInt(2, objCoder.getAge());
            objPrepareStatement.setString(3, objCoder.getClan());

            //6. Ejecutamos el Query
            objPrepareStatement.execute();

            //7. Obtener el resultado
            ResultSet objResult = objPrepareStatement.getGeneratedKeys();
            while (objResult.next()) {
                objCoder.setId(objResult.getInt(1));
            }

            //8. Cerramos el prepareStatement
            objPrepareStatement.close();
            JOptionPane.showMessageDialog(null, "Coder insertion was successful.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error adding Coder " + e.getMessage());
        }

        //9. Cerramos la conexión
        ConfigDB.closeConnection();

        return objCoder;
    }

    @Override
    public Object update(Object object) {

        Connection objConnection = ConfigDB.openConnection();

        //2. Castear el objeto
        Coder objCoder = (Coder) object;

        try{

            String sql = "UPDATE `coder` SET `name` = ?, `age` = ?, `clan` = ? WHERE (`id` = ?);";

            PreparedStatement objPrepareStatement = (PreparedStatement) objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            //5.Asignar los "?"
            objPrepareStatement.setString(1, objCoder.getName());
            objPrepareStatement.setInt(2, objCoder.getAge());
            objPrepareStatement.setString(3, objCoder.getClan());
            objPrepareStatement.setInt(4, objCoder.getId());


            //6. Ejecutamos el Query
            objPrepareStatement.execute();

            //7. Obtener el resultado
            //ResultSet objResult = objPrepareStatement.getGeneratedKeys();
            //while (objResult.next()) {
            //    objCoder.setId(objResult.getInt(1));
            //}

            //8. Cerramos el prepareStatement
            objPrepareStatement.close();
            JOptionPane.showMessageDialog(null, "Coder updated was successful.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error updated Coder " + e.getMessage());
        }

        //9. Cerramos la conexión
        ConfigDB.closeConnection();

        return objCoder;
    }

    @Override
    public void delete(Object object) {

        //1. Convertir el objeto a la entidad
        Coder objCoder = (Coder) object;

        //2. Variable booleana para medir el estado de la eliminación
        boolean isDeleted = false;

        //3. Abrir la conexión
        Connection objConnection = ConfigDB.openConnection();

        try {

            //4. Escribir la sentencia sql
            String sql = "DELETE FROM coder WHERE coder.id = ?;";

            //5. Preparamos el statement
            PreparedStatement objPrepare = objConnection.prepareStatement(
                    sql, PreparedStatement.RETURN_GENERATED_KEYS);

            //6. Asignamos el valor al ?
            objPrepare.setInt(1, objCoder.getId());

            //7. ExecuteUpdate devuelve la cantidad de filas afectadas por la sentencia ejecutada
            int totalAffectedRows = objPrepare.executeUpdate();

            if (totalAffectedRows > 0) {
                isDeleted = true;
                JOptionPane.showMessageDialog(null, "The delete was successful!");
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //8. Cerramos conexión
        ConfigDB.closeConnection();

    }

    @Override
    public List<Object> findAll() {

        //1. Abrir conexión
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

        //1. Abrir la conexión
        Connection objConnection = ConfigDB.openConnection();
        Coder objCoder = null;

        try {

            //2. Sentencia SQL
            String sql = "SELECT * FROM coder WHERE id = ?;";

            //3. Preparar el Statement
            PreparedStatement objPrepared = objConnection.prepareStatement(sql);

            //4. Damos valor al ?
            objPrepared.setInt(1, id);

            //5.Ejecutamos la query
            ResultSet objResult = objPrepared.executeQuery();

            //6. Mientras haya un registro siguiente entonces:
            while (objResult.next()) {
                objCoder = new Coder();

                objCoder.setId(objResult.getInt("id"));
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("clan"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //7. Se cierra la conexión
        ConfigDB.closeConnection();

        return objCoder;
    }

    public List<Coder> findByName(String nameCoder) {

        Connection objConnection = ConfigDB.openConnection();

        List<Coder> listCoders = new ArrayList<>();

        try {

            String sql = "SELECT * FROM coder WHERE name LIKE ?;";

            PreparedStatement objPreparedStatement = objConnection.prepareStatement(sql);

            objPreparedStatement.setString(1, "%" + nameCoder + "%");

            ResultSet objResult = objPreparedStatement.executeQuery();

            while (objResult.next()) {

                Coder objCoder = new Coder();
                objCoder.setId(objResult.getInt("id"));
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("clan"));
                listCoders.add(objCoder);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "The coder does not exist");
        } finally {
            ConfigDB.closeConnection();
        }

        return listCoders;
    }


}
