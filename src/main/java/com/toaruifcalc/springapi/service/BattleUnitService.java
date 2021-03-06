package com.toaruifcalc.springapi.service;

import com.toaruifcalc.springapi.models.BattleUnit;
import com.toaruifcalc.springapi.repository.BattleUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    public List<BattleUnit> addMultipleUnit(List<BattleUnit> battleUnits){
        //battleUnitRepository.save(battleUnit);
        return battleUnitRepository.saveAllAndFlush(battleUnits);
    }

    public Optional<BattleUnit> getUnit(Long id){
        if (id == -1){
            return getFirstUnit();
        }
        return battleUnitRepository.findById(id);
    }

    public void deleteUnit(Long id) {
        battleUnitRepository.deleteById(id);
    }

    public Optional<BattleUnit> getFirstUnit(){
        return battleUnitRepository.findFirstBy();
    }
}
