package db;

import java.util.Map;

import entities.Libro;

public interface LibroDAO {
String ADD = "insert into libro(titolo, prezzo) values(?, ?) ";
String GET_ALL = "select * from libro";
String UPDATE = "update libro set titolo = ? where id = ?";
String DELETE_ONE= "delete from libro where id = ?";

void addLibro(Libro l); 

Map<Integer, Libro> getAll();
Libro getOneByName(String nome);
Libro getOneById(int id);

void updateLibro(Libro l);
void deleteLibro(int id);

}
