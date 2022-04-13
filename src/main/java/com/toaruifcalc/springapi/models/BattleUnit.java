package com.toaruifcalc.springapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BattleUnit implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String charName;
    private String cardName;
    private String imageUrl;

    public BattleUnit() {

    }

    public BattleUnit(Long id, String charName, String cardName, String imageUrl) {
        this.id = id;
        this.charName = charName;
        this.cardName = cardName;
        this.imageUrl = imageUrl;
    }

    public BattleUnit(String charName, String cardName, String imageUrl) {
        this.charName = charName;
        this.cardName = cardName;
        this.imageUrl = imageUrl;
    }

    public BattleUnit(String charName) {
        this.charName=charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getCharName() {
        return charName;
    }

    public String getCardName() {
        return cardName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    /*String imageBias;

    String color;
    String primaryAttack;

    int skillAtkMultiplier;
    int skillBonusMagic;
    int skillBonusScience;


    int spAtkMultiplier;
    String spBonusType;
    int spBonusMultiplier;


    // alternative
    int spBonusMagic;
    int spBonusScience;
    int spBonusStacks;
    int spBonusFullHp;
    int spBonusLessHalfHp;
    int spBonusMoreHalfHp;
    int spBonusMoreHp;
    boolean spBonusLessHp;
    int spBonusMoreBossHp;


    String passive1Type;
    String passive1Activation;
    String passive1Flat;

    String passive2Type;
    String passive2Activation;
    String passive2Flat;*/

}
