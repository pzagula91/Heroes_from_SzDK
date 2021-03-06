package pl.sdk.gui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatureTest {

    @Test
    void defenderShouldLost2HpBecauseOfArmor(){
        //given
        Creature student = new Creature(1,1, 1, "Student",1,512);
        Creature professor = new Creature(1000,500, 500, "Professor",11,1);
        //when
        professor.attack(student);
        //then
        assertEquals(13, student.getAmount());
    }

    @Test
    void defenderShouldLost0HpBecauseArmorIsGraterThanAttackerDamage(){
        //given
        Creature student = new Creature(1,1, 1, "Student",1,1);
        Creature professor = new Creature(1000,500, 500, "Professor",11,1);
        //when
        student.attack(professor);
        //then
        assertEquals(1000, professor.getCurrentHp());
    }

    @Test
    void behemothShouldIgnore80PercentOfDefence(){
        //given
        Creature behemoth = new Creature(100,200, 100, "behemoth",1,1, new ReduceArmorPercentageCalculateStrategy(80));
        Creature defender = new Creature(1000,100, 100, "X",11,1);
        //when
        behemoth.attack(defender);
        //then
        assertEquals(820, defender.getCurrentHp());
    }
}
