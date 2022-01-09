package ru.netology;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 10) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation <= 8) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void previousRadioStation() {
        if (currentRadioStation > 1) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        if (currentVolume < 10) {
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
