package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testRadioStationValid() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    public void testRadioStationValidDownZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    public void testRadioStationValidUpTen() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    public void testCurrentVolumeValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void testCurrentVolumeValidDownZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void testCurrentVolumeValidUpTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void testNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    public void testNextRadioStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    public void testPreviousRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.previousRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    public void testPreviousRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        radio.previousRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    public void testNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void testNextVolume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.nextVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void testPreviousVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.previousVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void testPreviousVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.previousVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

}