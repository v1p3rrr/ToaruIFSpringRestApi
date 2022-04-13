package com.toaruifcalc.springapi.service;

import com.toaruifcalc.springapi.models.BattleUnit;
import com.toaruifcalc.springapi.repository.BattleUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattleUnitService {

    private BattleUnitRepository battleUnitRepository;

    @Autowired
    public BattleUnitService(BattleUnitRepository battleUnitRepository){
        this.battleUnitRepository = battleUnitRepository;
    }

    public List<BattleUnit> getAllUnits(){
        return battleUnitRepository.findAll();
    }

    public Long addUnit(BattleUnit battleUnit){
        //battleUnitRepository.save(battleUnit);
        return battleUnitRepository.saveAndFlush(battleUnit).getId();
    }

    public BattleUnit getUnit(Long id){
        return battleUnitRepository.getById(id);
    }
}
