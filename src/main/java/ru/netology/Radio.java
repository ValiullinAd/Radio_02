package ru.netology;

public class Radio {

    private int radioStation = 14;

    private int maxRadioStation = radioStation - 1;
    private int currentRadioStation = 0;
    private int maxVolume = 100;
    private int currentVolume = 100;

//    public Radio(int maxRadioStation, int currentRadioStation, int maxVolume, int currentVolume) {
//        this.maxRadioStation = maxRadioStation;
//        this.currentRadioStation = currentRadioStation;
//        this.maxVolume = maxVolume;
//        this.currentVolume = currentVolume;
//    }


    // С одним параметром
    public Radio(int radioStation) {
        this.radioStation = radioStation;
    }
    // Без параметров
    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation == maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation <= maxRadioStation - 1) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void previousRadioStation() {
        if (currentRadioStation > 1) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume == 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        } /*else {
            return;
        }*/
    }

    public void previousVolume() {
        if (currentVolume > 1) {
            currentVolume -= 1;
        } /*else {
            return;
        }*/
    }
}
