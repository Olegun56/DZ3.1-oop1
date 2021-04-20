package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void earlyExit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void radioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void switchRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchCurrentStationNext();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void switchRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchCurrentStationPrev();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void switchRadioStationNext() {
        Radio radio = new Radio();
        radio.switchCurrentStationNext();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void switchRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.switchCurrentStationPrev();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void earlyExitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void radioVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }


    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void underMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void overMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

}
