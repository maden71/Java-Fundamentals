import java.util.*;

public class HeroesofCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            heroes.put(data[0], new ArrayList<>());
            heroes.get(data[0]).add(Integer.parseInt(data[1]));
            heroes.get(data[0]).add(Integer.parseInt(data[2]));
        }
        String[] data = scanner.nextLine().split(" - ");
        while (!data[0].equals("End")) {
            switch (data[0]) {
                case "CastSpell": {
                    String heroName = data[1];
                    int mpNeeded = Integer.parseInt(data[2]);
                    String spellName = data[3];

                    if (heroes.get(heroName).get(1) > mpNeeded) {
                        heroes.get(heroName).set(1, heroes.get(heroName).get(1) - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %s MP!%n", heroName, spellName, heroes.get(heroName).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                }
                case "TakeDamage": {
                    String heroName = data[1];
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    heroes.get(heroName).set(0, heroes.get(heroName).get(0) - damage);
                    if (heroes.get(heroName).get(0) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, heroes.get(heroName).get(0));
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroes.remove(heroName);
                    }
                    break;
                }
                case "Recharge": {
                    String heroName = data[1];
                    int rechargeAmount = Integer.parseInt(data[2]);
                    if ((heroes.get(heroName).get(1) + rechargeAmount) > 200) {
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - heroes.get(heroName).get(1));
                        heroes.get(heroName).set(1, 200);
                    } else {
                        System.out.printf("%s recharged for %d MP!%n", heroName, rechargeAmount);
                        heroes.get(heroName).set(1, heroes.get(heroName).get(1) + rechargeAmount);
                    }
                    break;
                }
                case "Heal": {
                    String heroName = data[1];
                    int healAmount = Integer.parseInt(data[2]);
                    if ((heroes.get(heroName).get(0) + healAmount) > 100) {
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - heroes.get(heroName).get(0));
                        heroes.get(heroName).set(0, 100);
                    } else {
                        System.out.printf("%s healed for %d HP!%n", heroName, healAmount);
                        heroes.get(heroName).set(0, heroes.get(heroName).get(0) + healAmount);
                    }
                    break;
                }
            }
            data = scanner.nextLine().split(" - ");
        }

        for (Map.Entry<String, List<Integer>> stats : heroes.entrySet()) {
            System.out.printf("%s%n HP: %d%n MP: %d%n",stats.getKey(),stats.getValue().get(0),stats.getValue().get(1));

        }
    }
}
