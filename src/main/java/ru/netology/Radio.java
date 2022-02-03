package ru.netology;

public class Radio {

    private int radioStation = 14;

    private int maxRadioStation = radioStation - 1;
    private int initialRadioStation = 0;
    private int currentRadioStation ;
    private int maxVolume = 100;
    private int currentVolume = 100;

    public Radio() {
    }

    public Radio(int radioStation) {
        this.radioStation = radioStation;
        this.maxRadioStation = this.radioStation - 1;
    }

    public int getInitialRadioStation() {
        return initialRadioStation;
    }

    public void setInitialRadioStation(int initialRadioStation) {
        this.initialRadioStation = initialRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
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
