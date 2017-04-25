package th.co.ptg.punthai.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import th.co.ptg.punthai.entities.VGl001PunInterfaceCostEntity;

import java.util.List;

public interface VGl001PunInterfaceCostRepository  extends CrudRepository<VGl001PunInterfaceCostEntity, Long> {

    List<VGl001PunInterfaceCostEntity> findAllByArtnr(String artnr);

}
