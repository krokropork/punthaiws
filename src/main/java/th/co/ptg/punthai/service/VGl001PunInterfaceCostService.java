package th.co.ptg.punthai.service;

import th.co.ptg.punthai.entities.VGl001PunInterfaceCostEntity;

import java.util.List;

/**
 * Created by user on 25/4/2560.
 */
public interface VGl001PunInterfaceCostService {

    List<VGl001PunInterfaceCostEntity> findAll();

    List<VGl001PunInterfaceCostEntity> findAllByArtnr(String artnr);

}
