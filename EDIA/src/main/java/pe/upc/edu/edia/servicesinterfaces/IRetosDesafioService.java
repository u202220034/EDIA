package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.RetosDesafio;

import java.util.List;

public interface IRetosDesafioService {

    public List<RetosDesafio> list();
    public void insert(RetosDesafio rd);
    public RetosDesafio listId(int idRetosDesafio);
    public void update(RetosDesafio rd);
    public void delete(int idRetosDesafio);
}
