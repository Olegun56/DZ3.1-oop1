package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void earlyExit() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void earlyExitTwo() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void radioStation() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
    public void switchRadioStationMax() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentStation(10);
        radio.switchCurrentStationNext();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void switchRadioStationMin() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentStation(0);
        radio.switchCurrentStationPrev();
        assertEquals(10, radio.getCurrentStation());

    }

    @Test
    public void switchRadioStationNext() {
        Radio radio = new Radio(10,0,100,0);
        radio.switchCurrentStationNext();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void switchRadioStationPrev() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentStation(3);
        radio.switchCurrentStationPrev();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void earlyExitVolume() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void earlyExitVolumeTwo() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentVolume(111);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void radioVolume() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }


    @Test
    public void increaseVolume() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void underMinVolume() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void overMaxVolume() {
        Radio radio = new Radio(10,0,100,0);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    void SwitchNextStationOnOne () {
        Radio radio = new Radio(10,0,100,0);
        for (int i = 0; i < 11; i++) {
            radio.switchCurrentStationNext();
        }
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void IncreaseVolumeOnOneStep () {
        Radio radio = new Radio(10,0,100,0);

        for (int i = 0; i < 101; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getCurrentVolume());
    }

}
