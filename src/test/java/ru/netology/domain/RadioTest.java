package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void radioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void switchRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.switchCurrentStationNext());

    }

    @Test
    public void switchRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(9, radio.switchCurrentStationPrev());

    }

    @Test
    public void switchRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        assertEquals(4, radio.switchCurrentStationNext());
    }

    @Test
    public void switchRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        assertEquals(2, radio.switchCurrentStationPrev());
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
        assertEquals(6, radio.increaseVolume());
    }
    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(4, radio.reduceVolume());
    }
    @Test
    public void underMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.reduceVolume());
    }
    @Test
    public void overMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.increaseVolume());
    }
}
