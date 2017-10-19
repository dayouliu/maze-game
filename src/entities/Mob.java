package entities;

import models.TextureModel;
import org.lwjgl.util.vector.Vector3f;

public class Mob extends Entity {

    protected int health;
    protected int damage;

    public Mob(TextureModel model, Vector3f position, float rotX, float rotY, float rotZ, float scale, int health, int damage) {
        super(model, position, rotX, rotY, rotZ, scale);
        this.health = health;
        this.damage = damage;
    }

    public void heal(int hp) {
        this.health += hp;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}