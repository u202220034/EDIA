package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.upc.edu.edia.entities.DesafioTemporal;

import java.util.List;

public interface IDesafioTemporalRepository extends JpaRepository<DesafioTemporal,Integer> {

    //Ver los desafios que ya expiraron para asi ya poder ser eliminados
    @Query(value = "SELECT \n" +
            "    id_desafio_temporal,\n" +
            "    nombre_desafio,\n" +
            "    fecha_inicio,\n" +
            "    fecha_culminacion\n" +
            "FROM \n" +
            "    desafio_temporal\n" +
            "WHERE \n" +
            "    fecha_culminacion < CURRENT_DATE",
            nativeQuery = true)
    public List<String[]> verDesafioExpirtado();


}
