package com.campusdual.classroom;

public class FuelTank {

    private int actualFuel = 10;

    public void showDetails() {

        System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
    }

    public int getActualFuel() {
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {

        //En caos de que el valor enviado sea negativo, no se modifica y se manda un mensaje
        if (actualFuel < 0) {
            System.out.println("El valor no puede ser negativo");
        } else {
            this.actualFuel = actualFuel;
        }
    }
}
