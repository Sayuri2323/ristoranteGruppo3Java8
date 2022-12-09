package it.ristoranteGruppo3.entities;

public class Cliente {
    private String name;
    private String surname;
    private int age;
    private TypeEnum type;
    private boolean hasBooked = false;

    public Cliente(String name, String surname, int age, TypeEnum type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getOrdinazione(Menu menu){
        //todo
        return "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public boolean isHasBooked() {
        return hasBooked;
    }

    public void setHasBooked(boolean hasBooked) {
        this.hasBooked = hasBooked;
    }
}
