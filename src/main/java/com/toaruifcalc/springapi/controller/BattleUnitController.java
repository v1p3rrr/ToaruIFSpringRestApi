package com.toaruifcalc.springapi.controller;

import com.toaruifcalc.springapi.models.BattleUnit;
import com.toaruifcalc.springapi.service.BattleUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/battleunits")
public class BattleUnitController {

    private BattleUnitService battleUnitService;

    @Autowired
    public BattleUnitController(BattleUnitService battleUnitService){
        this.battleUnitService = battleUnitService;
    }

    @GetMapping("/getallunits")
    public List<BattleUnit> getAllUnits(){
        return battleUnitService.getAllUnits();
    }

    @PostMapping("/setnewunit")
    public Long setNewUnit(@RequestBody BattleUnit battleUnit){
        return battleUnitService.addUnit(battleUnit);
    }

    @PostMapping("/setmultipleunits")
    public List<BattleUnit> setMultipleUnit(@RequestBody List<BattleUnit> battleUnits){
        return battleUnitService.addMultipleUnit(battleUnits);
    }

    @GetMapping("/getunit")
    public Optional<BattleUnit> getUnitById(@RequestParam Long id){
        return battleUnitService.getUnit(id);
    }

    @PostMapping("/setrandomunit")
    public Long setNewUnit(){
        return battleUnitService.addUnit(new BattleUnit("abobus", "amogus"));
    }

    @PostMapping("/deleteunit")
    public void deleteUnit(@RequestParam Long id){
        battleUnitService.deleteUnit(id);
    }

    @GetMapping("/getfirstunit")
    public Optional<BattleUnit> getFirstUnit(){
        return battleUnitService.getFirstUnit();
    }

}
