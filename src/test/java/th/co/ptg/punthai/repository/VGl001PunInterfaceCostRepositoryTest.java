package th.co.ptg.punthai.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import th.co.ptg.punthai.config.ApplicationConfig;
import th.co.ptg.punthai.entities.VGl001PunInterfaceCostEntity;

import java.util.List;

/**
 * Created by user on 25/4/2560.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class VGl001PunInterfaceCostRepositoryTest {

    @Autowired
    VGl001PunInterfaceCostRepository gl001PunInterfaceCostRepository;

    @Test
    public  void  vGl001() {
        List<VGl001PunInterfaceCostEntity> vGl001PunInterfaceCostEntities = (List<VGl001PunInterfaceCostEntity>) gl001PunInterfaceCostRepository.findAllByArtnr("200073");
        if(!vGl001PunInterfaceCostEntities.isEmpty())
            assert (vGl001PunInterfaceCostEntities.get(0).getArtnr()).equals("200073");
    }
}