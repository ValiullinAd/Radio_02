package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldUseConstructor() {
        Radio radio =
                new Radio(14);


        assertEquals(0, radio.getCurrentRadioStation());


    }

    @Test
    public void newMaxRadioStation() {
        Radio radio = new Radio(20);

        assertEquals(19, radio.getMaxRadioStation());
    }
    @Test
    public void newMaxRadioStationV2() {
        Radio radio = new Radio(50);

        assertEquals(49, radio.getMaxRadioStation());
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());

    }

    @Test
    public void testRadioStationDownZero() {
        Radio radio = new Radio();
        radio.previousRadioStation();

        assertEquals(13, radio.getCurrentRadioStation());

    }

    @Test
    public void testRadioStationUpMax() {
        Radio radio = new Radio();

        radio.nextRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());

    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.previousRadioStation();

        assertEquals(13, radio.getCurrentRadioStation());

    }

    //    @Test
//    public void shouldUseConstructorVolume() {
//        Radio radio =
//                new Radio(20,7,50,20);
//
//        assertEquals(20, radio.getCurrentVolume());
//
//    }
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
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    //
//    @Test
//    public void testCurrentVolumeValidUpHundr() {
//        Radio radio = new Radio(20,7,100,100);
//        radio.nextVolume();
//
//        assertEquals(100, radio.getCurrentVolume());
//    }
    @Test
    public void testCurrentStationUpMax() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(20);
        //radio.previousRadioStation();
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void testCurrentStationUpOne() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(2);
        radio.previousRadioStation();
        //radio.nextRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void testCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(13);
        //radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void testCurrentStationDownZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.previousRadioStation();

        assertEquals(13, radio.getCurrentRadioStation());
    }


}
