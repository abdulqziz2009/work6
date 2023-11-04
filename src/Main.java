interface HavingSuperAbility {
    void applySuperAbility();
}

// Шаг 2: Создаем абстрактный класс Hero с полями здоровье, урон и тип суперспособности и реализуем интерфейс HavingSuperAbility
abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected int damage;
    protected String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    // Шаг 3: Абстрактный метод applySuperAbility будет реализован в подклассах
    public abstract void applySuperAbility();
}

// Шаг 3: Создаем классы героев Magic, Medic, Warrior и наследуем их от класса Hero
class Magic extends Hero {
    public Magic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbility);
    }
}

class Medic extends Hero {
    public Medic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbility);
    }
}

class Warrior extends Hero {
    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbility);
    }
}

// Шаг 4: В классе Main создаем массив из 3х разных героев и применяем суперспособность каждого героя через цикл
public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "Mystic Spell"),
                new Medic(120, 15, "Healing Touch"),
                new Warrior(150, 30, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}
