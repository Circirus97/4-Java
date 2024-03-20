package database;

import entity.Coder;

import java.util.List;

public interface CRUD {

    //Object es una clase genérica para los objetos, donde cualquier objeto de java puede ser un object.
    Object insert(Object object);

    Object update(Object object);

    void delete(Object object);

    List<Object> findAll();

    Object findById(int id);

    List<Coder> findByName(String name);


}
