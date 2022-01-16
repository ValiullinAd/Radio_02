package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // Radio radio = new Radio();

    @Test
    public void shouldUseConstructor() {
        Radio radio =
                new Radio(20,7,50,20);


        assertEquals(7, radio.getCurrentRadioStation());


    }
    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();


        assertEquals(7, radio.getCurrentRadioStation());

    }
    @Test
    public void testRadioStationDownZero() {
        Radio radio = new Radio(20,0,50,20);
        radio.previousRadioStation();

        assertEquals(20, radio.getCurrentRadioStation());

    }
    @Test
    public void testRadioStationUpMax() {
        Radio radio = new Radio(20,20,50,20);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }
    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.previousRadioStation();

        assertEquals(5, radio.getCurrentRadioStation());

    }
    @Test
    public void shouldUseConstructorVolume() {
        Radio radio =
                new Radio(20,7,50,20);

        assertEquals(20, radio.getCurrentVolume());

    }
    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.nextVolume();

        assertEquals(100, radio.getCurrentVolume());

    }
    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.previousVolume();

        assertEquals(99, radio.getCurrentVolume());

    }

    @Test
    public void testNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();

        assertEquals(100, radio.getCurrentVolume());


    }

    @Test
    public void testNextVolume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.nextVolume();

        assertEquals(9, radio.getCurrentVolume());


    }
    @Test
    public void testPreviousVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.previousVolume();

        assertEquals(0, radio.getCurrentVolume());


    }

    @Test
    public void testPreviousVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.previousVolume();

        assertEquals(1, radio.getCurrentVolume());


    }
    @Test
    public void testCurrentVolumeValidDownZero() {
        Radio radio = new Radio(20,-1,100,0);
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testCurrentVolumeValidUpHundr() {
        Radio radio = new Radio(20,7,100,100);
        radio.nextVolume();

        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void testCurrentStationZero() {
        Radio radio = new Radio(20,0,100,100);
        radio.setCurrentRadioStation(0);
        radio.previousRadioStation();

        assertEquals(20, radio.getCurrentRadioStation());
    }
    @Test
    public void testCurrentStationUp() {
        Radio radio = new Radio(20,20,100,100);
        radio.setCurrentRadioStation(20);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void testCurrentStationDownZero() {
        Radio radio = new Radio(20,-1,100,100);
        radio.setCurrentRadioStation(-1);
        radio.previousRadioStation();

        assertEquals(20 , radio.getCurrentRadioStation());
    }


}