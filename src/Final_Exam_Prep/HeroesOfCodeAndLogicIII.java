package Final_Exam_Prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfHeroes = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> heroHealth = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> heroMana = new LinkedHashMap<>();
        for (int h = 0; h < numOfHeroes; h++) {
            String[] heroes = scanner.nextLine().split(" ");
            String hero = heroes[0];
            int health = Integer.parseInt(heroes[1]);
            int mana = Integer.parseInt(heroes[2]);
            heroHealth.put(hero, health);
            heroMana.put(hero, mana);
        }
        while (true) {
            String[] input = scanner.nextLine().split(" - ");
            String command = input[0];

            if (command.equals("End")) {
                break;
            }
            String heroName = input[1];
            switch (command) {
                case "CastSpell":
                    int manaNeeded = Integer.parseInt(input[2]);
                    String spellName = input[3];

                    if (heroMana.get(heroName) >= manaNeeded) {
                        heroMana.put(heroName, heroMana.get(heroName) - manaNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroMana.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damageTaken = Integer.parseInt(input[2]);
                    String attacker = input[3];

                    heroHealth.put(heroName, heroHealth.get(heroName) - damageTaken);
                    if (heroHealth.get(heroName) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damageTaken, attacker, heroHealth.get(heroName));
                    } else {
                        heroHealth.remove(heroName);
                        heroMana.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;

                case "Recharge":
                    int manaAmount = Integer.parseInt(input[2]);

                    if (heroMana.get(heroName) + manaAmount >= 200) {
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - heroMana.get(heroName));
                        heroMana.put(heroName, 200);
                    } else {
                        heroMana.put(heroName, heroMana.get(heroName) + manaAmount);
                        System.out.printf("%s recharged for %d MP!%n", heroName, manaAmount);
                    }
                    break;

                case "Heal":
                    int healAmount = Integer.parseInt(input[2]);

                    if (heroHealth.get(heroName) + healAmount >= 100) {
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - heroHealth.get(heroName));
                        heroHealth.put(heroName, 100);
                    } else {
                        heroHealth.put(heroName, heroHealth.get(heroName) + healAmount);
                        System.out.printf("%s healed for %d HP!%n", heroName, healAmount);
                    }
                    break;
            }
        }
        for (Map.Entry<String, Integer> kvp : heroHealth.entrySet()) {
            System.out.println(kvp.getKey());
            System.out.printf("  HP: %d%n",kvp.getValue());
            System.out.printf("  MP: %d%n", heroMana.get(kvp.getKey()));
        }
    }
}

