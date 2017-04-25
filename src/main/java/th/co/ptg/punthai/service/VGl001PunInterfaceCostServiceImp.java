package th.co.ptg.punthai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import th.co.ptg.punthai.entities.VGl001PunInterfaceCostEntity;
import th.co.ptg.punthai.repository.VGl001PunInterfaceCostRepository;

import java.util.List;

/**
 * Created by user on 25/4/2560.
 */

@Service
public class VGl001PunInterfaceCostServiceImp implements VGl001PunInterfaceCostService {

    @Autowired
    private VGl001PunInterfaceCostRepository gl001PunInterfaceCostRepository;


    @Transactional(readOnly = true)
    public List<VGl001PunInterfaceCostEntity> findAll() {
       return (List<VGl001PunInterfaceCostEntity>) gl001PunInterfaceCostRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<VGl001PunInterfaceCostEntity> findAllByArtnr(String artnr) {
        return gl001PunInterfaceCostRepository.findAllByArtnr(artnr);
    }


}
