package com.toaruifcalc.springapi.repository;

import com.toaruifcalc.springapi.models.BattleUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BattleUnitRepository extends JpaRepository<BattleUnit, Long> {
    Optional<BattleUnit> findFirstBy();
}
