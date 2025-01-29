package lolaso;

import java.util.Random;

public class Hero {
    private String nombreheroe;
    private int level;
    private int health;
    private int maxhealth;
    private int experiencia;
    private int ataque;
    private int defensa;
    private int velocidad;

    public Hero() {
        this.health = 0;
        this.level = 0;
        this.nombreheroe = "";
        this.maxhealth = 0;
        this.experiencia = 0;
        this.ataque = 0;
        this.defensa = 0;
        this.velocidad = 0;

    }

    public Hero(String nombreheroe, int level, int health, int maxhealth, int experiencia, int ataque, int defensa, int velocidad) {
        this.nombreheroe = nombreheroe;
        this.level = level;
        this.health = health;
        this.maxhealth = maxhealth;
        this.experiencia = experiencia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;

    }

    public String getNombreheroe() {
        return nombreheroe;
    }

    public void setNombreheroe(String nombreheroe) {
        this.nombreheroe = nombreheroe;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public void drinkpotion(){
        this.health = Math.min(this.health + 10, this.maxhealth);
        System.out.println("LA VIDA RESULTANTE ES: " + this.health);
    }

    public void rest(){
        this.health = Math.min(this.health + 50, this.maxhealth);
        System.out.println("LA VIDA RESULTANTE ES: " + this.health);
    }

    public void toStringg(){
        System.out.println("EL NOMBRE DEL HEROE ES: " +  this.nombreheroe);
        System.out.println("LA VIDA DEL HEROE ES: " +  this.health);
        System.out.println("EL ATAQUE DEL HEROE ES: " +  this.ataque);
        System.out.println("LA DEFENSA DEL HEROE ES: " +  this.defensa);
        System.out.println("EL NIVEL DEL HEROE ES: " +  this.level);
        System.out.println("LA VIDA MÁXIMA DEL HEROE ES: " +  this.maxhealth);
        System.out.println("LA EXPERIENCIA DEL HEROE ES: " +  this.experiencia);
        System.out.println();
    }

    public void attack(Hero enemigo){
        Random random = new Random();
        int dano = Math.max((this.ataque - enemigo.getDefensa()), 10);
        dano = random.nextInt(dano);
        enemigo.health = enemigo.health - dano;
        System.out.println("CONSIGUE ASESTAR UN GOLPE CAUSANDO " + dano + " PUNTOS DE DAÑO");

        this.experiencia += 10;
    }

    public void levelUp(){
        this.health += 5;
        this.ataque += 1;
        this.defensa += 1;
        System.out.println("HAS SUBIDO DE NIVEL " + this.getNombreheroe());
    }


}
