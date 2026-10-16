package ru.timofeev.gun;

public class AutomatGun extends Gun {
    private final int fireRate;

    public AutomatGun() {
        super(30, 30);
        this.fireRate = 30;
    }

    public AutomatGun(int fullammo) {
        super(fullammo, fullammo);
        this.fireRate = fullammo / 2;
        if (this.fireRate <= 0) {
            throw new IllegalArgumentException("Скорострельность должна быть положительным числом. " +
                    "При вместимости " + fullammo + "скорострельность = " + this.fireRate
            );
        }
    }

    public AutomatGun(int fullammo, int fireRate) {
        super(fullammo, fullammo);
        if (fireRate <= 0) {
            throw new IllegalArgumentException("Скорострельность должна быть положительным числом, получено: " + fireRate);
        }
        this.fireRate = fireRate;
    }

    @Override
    public void shoot() {
        for (int i = 0; i < fireRate; i++) {
            super.shoot();
        }
    }

    public void shoot(int seconds) {
        if (seconds <= 0) {
            throw new IllegalArgumentException( "Время стрельбы должно быть положительным, получено: " + seconds);
        }
        int totalShots = seconds * fireRate;
        for (int i = 0; i < totalShots; i++) {
            super.shoot();
        }
    }

    public int getFireRate() {
        return fireRate;
    }

    @Override
    public String toString() {
        return "Характеристики автомата: вместимость " + getFullammo() +
                ", количество патронов " + getAmmo() + ", скорострельность " + fireRate;
    }
}
