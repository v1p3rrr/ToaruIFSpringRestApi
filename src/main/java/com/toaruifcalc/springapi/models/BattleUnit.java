package com.toaruifcalc.springapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
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

    public BattleUnit(String charName, String cardName) {
        this.charName=charName;
        this.cardName=cardName;
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

    String imageBias;

    String color;
    String primaryAttack;

    int skillAtkMultiplier;
    int skillBonusMagic;
    int skillBonusScience;


    int spAtkMultiplier;
    String spBonusType;
    int spBonusMultiplier;


    // alternative
    /*
    int spBonusMagic;
    int spBonusScience;
    int spBonusStacks;
    int spBonusFullHp;
    int spBonusLessHalfHp;
    int spBonusMoreHalfHp;
    int spBonusMoreHp;
    boolean spBonusLessHp;
    int spBonusMoreBossHp;*/


    String passive1Type;
    String passive1Activation;
    String passive1Flat;

    String passive2Type;
    String passive2Activation;
    String passive2Flat;

    public BattleUnit(Long id, String charName, String cardName, String imageUrl, String imageBias, String color, String primaryAttack, int skillAtkMultiplier, int skillBonusMagic, int skillBonusScience, int spAtkMultiplier, String spBonusType, int spBonusMultiplier, String passive1Type, String passive1Activation, String passive1Flat, String passive2Type, String passive2Activation, String passive2Flat) {
        this.id = id;
        this.charName = charName;
        this.cardName = cardName;
        this.imageUrl = imageUrl;
        this.imageBias = imageBias;
        this.color = color;
        this.primaryAttack = primaryAttack;
        this.skillAtkMultiplier = skillAtkMultiplier;
        this.skillBonusMagic = skillBonusMagic;
        this.skillBonusScience = skillBonusScience;
        this.spAtkMultiplier = spAtkMultiplier;
        this.spBonusType = spBonusType;
        this.spBonusMultiplier = spBonusMultiplier;
        this.passive1Type = passive1Type;
        this.passive1Activation = passive1Activation;
        this.passive1Flat = passive1Flat;
        this.passive2Type = passive2Type;
        this.passive2Activation = passive2Activation;
        this.passive2Flat = passive2Flat;
    }

    public BattleUnit(String charName, String cardName, String imageUrl, String imageBias, String color, String primaryAttack, int skillAtkMultiplier, int skillBonusMagic, int skillBonusScience, int spAtkMultiplier, String spBonusType, int spBonusMultiplier, String passive1Type, String passive1Activation, String passive1Flat, String passive2Type, String passive2Activation, String passive2Flat) {
        this.charName = charName;
        this.cardName = cardName;
        this.imageUrl = imageUrl;
        this.imageBias = imageBias;
        this.color = color;
        this.primaryAttack = primaryAttack;
        this.skillAtkMultiplier = skillAtkMultiplier;
        this.skillBonusMagic = skillBonusMagic;
        this.skillBonusScience = skillBonusScience;
        this.spAtkMultiplier = spAtkMultiplier;
        this.spBonusType = spBonusType;
        this.spBonusMultiplier = spBonusMultiplier;
        this.passive1Type = passive1Type;
        this.passive1Activation = passive1Activation;
        this.passive1Flat = passive1Flat;
        this.passive2Type = passive2Type;
        this.passive2Activation = passive2Activation;
        this.passive2Flat = passive2Flat;
    }

    public String getImageBias() {
        return imageBias;
    }

    public void setImageBias(String imageBias) {
        this.imageBias = imageBias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrimaryAttack() {
        return primaryAttack;
    }

    public void setPrimaryAttack(String primaryAttack) {
        this.primaryAttack = primaryAttack;
    }

    public int getSkillAtkMultiplier() {
        return skillAtkMultiplier;
    }

    public void setSkillAtkMultiplier(int skillAtkMultiplier) {
        this.skillAtkMultiplier = skillAtkMultiplier;
    }

    public int getSkillBonusMagic() {
        return skillBonusMagic;
    }

    public void setSkillBonusMagic(int skillBonusMagic) {
        this.skillBonusMagic = skillBonusMagic;
    }

    public int getSkillBonusScience() {
        return skillBonusScience;
    }

    public void setSkillBonusScience(int skillBonusScience) {
        this.skillBonusScience = skillBonusScience;
    }

    public int getSpAtkMultiplier() {
        return spAtkMultiplier;
    }

    public void setSpAtkMultiplier(int spAtkMultiplier) {
        this.spAtkMultiplier = spAtkMultiplier;
    }

    public String getSpBonusType() {
        return spBonusType;
    }

    public void setSpBonusType(String spBonusType) {
        this.spBonusType = spBonusType;
    }

    public int getSpBonusMultiplier() {
        return spBonusMultiplier;
    }

    public void setSpBonusMultiplier(int spBonusMultiplier) {
        this.spBonusMultiplier = spBonusMultiplier;
    }

    public String getPassive1Type() {
        return passive1Type;
    }

    public void setPassive1Type(String passive1Type) {
        this.passive1Type = passive1Type;
    }

    public String getPassive1Activation() {
        return passive1Activation;
    }

    public void setPassive1Activation(String passive1Activation) {
        this.passive1Activation = passive1Activation;
    }

    public String getPassive1Flat() {
        return passive1Flat;
    }

    public void setPassive1Flat(String passive1Flat) {
        this.passive1Flat = passive1Flat;
    }

    public String getPassive2Type() {
        return passive2Type;
    }

    public void setPassive2Type(String passive2Type) {
        this.passive2Type = passive2Type;
    }

    public String getPassive2Activation() {
        return passive2Activation;
    }

    public void setPassive2Activation(String passive2Activation) {
        this.passive2Activation = passive2Activation;
    }

    public String getPassive2Flat() {
        return passive2Flat;
    }

    public void setPassive2Flat(String passive2Flat) {
        this.passive2Flat = passive2Flat;
    }
}
