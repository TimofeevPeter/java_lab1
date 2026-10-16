package ru.timofeev.gun;

public class Gun extends Weapon {
    private final int fullammo;

    public Gun(int fullammo, int ammo) {
        super(ammo < 1 ? 1 : ammo);  // ru.timofeev.gun.Weapon требует ammo >= 1
        if (fullammo <= 0) {
            throw new IllegalArgumentException("Максимальное количество патронов должно быть больше 0.");
        }
        if (ammo < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным.");
        }
        if (ammo > fullammo) {
            throw new IllegalArgumentException("Начальное количество патронов не может превышать максимальное.");
        }
        this.fullammo = fullammo;
        // Если ammo был 0, обнуляем через getAmmo() родителя
        if (ammo == 0) {
            getAmmo();
        }
    }

    @Override
    public void shoot() {
        if (ammo() > 0) {
            System.out.println("Бах!");
            getAmmo();  // метод родителя: уменьшает ammo на 1
        } else {
            System.out.println("Клац!");
        }
    }

    public int reload(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Нельзя зарядить отрицательное количество патронов.");
        }
        int current = ammo();
        int freeSpace = fullammo - current;
        if (count <= freeSpace) {
            load(current + count);  // метод родителя: устанавливает ammo
            return 0;
        } else {
            load(fullammo);
            return count - freeSpace;
        }
    }

    public int unload() {
        int taken = ammo();
        while (ammo() > 0) {
            getAmmo();  // уменьшаем пока не станет 0
        }
        return taken;
    }

    public int getFullammo() {
        return fullammo;
    }

    public boolean isLoaded() {
        return ammo() > 0;
    }
}
