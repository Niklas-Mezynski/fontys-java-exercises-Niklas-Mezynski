package main;

import main.Behaviors.AxeBehavior;
import main.Behaviors.BowAndArrowBehavior;
import main.Behaviors.KnifeBehavior;
import main.Behaviors.SwordBehavior;
import main.Characters.*;
import main.Characters.Character;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Character c1 = new King(new KnifeBehavior());
        Character c2 = new Queen(new BowAndArrowBehavior());
        Character c3 = new Knight(new SwordBehavior());
        Character c4 = new Troll(new AxeBehavior());

        List<Character> characters = List.of(c1, c2, c3, c4);

        characters.forEach(Character::fight);
    }
}
