package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.RetosDesafio;
import pe.upc.edu.edia.repositories.IRetosDesafioRepository;
import pe.upc.edu.edia.servicesinterfaces.IRetosDesafioService;

import java.util.List;

@Service
public class RetoDesafioServiceImplement implements IRetosDesafioService {
    @Autowired
    private IRetosDesafioRepository rdR;


    @Override
    public List<RetosDesafio> list() {
        return rdR.findAll();
    }

    @Override
    public void insert(RetosDesafio rd) {

    }

    @Override
    public RetosDesafio listId(int idRetosDesafio) {
        return null;
    }

    @Override
    public void update(RetosDesafio rd) {

    }

    @Override
    public void delete(int idRetosDesafio) {

    }
}
