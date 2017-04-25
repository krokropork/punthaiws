package th.co.ptg.punthai.web.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.co.ptg.punthai.bean.ResponseData;
import th.co.ptg.punthai.constant.AppConstant;
import th.co.ptg.punthai.constant.AppEnum;
import th.co.ptg.punthai.service.VGl001PunInterfaceCostService;

/**
 * Created by user on 25/4/2560.
 */

@RestController
@RequestMapping(AppConstant.API_GL001)
public class VGl001PunInterfaceCostApiRestController {

    @Autowired
    private  VGl001PunInterfaceCostService vGl001PunInterfaceCostService;

    @GetMapping(value = AppConstant.GL001.FindAll)
    public ResponseEntity  findAll(){
        return new ResponseEntity(new ResponseData( HttpStatus.OK,AppEnum.OK.des(),vGl001PunInterfaceCostService.findAll()), HttpStatus.OK);
    }


    @GetMapping(value = AppConstant.GL001.findAllBy +"/{artnr}")
    public ResponseEntity  findByArtnr(@PathVariable String artnr){
        return new ResponseEntity(new ResponseData(HttpStatus.OK,AppEnum.OK.des(),vGl001PunInterfaceCostService.findAllByArtnr(artnr)), HttpStatus.OK);
    }

}
