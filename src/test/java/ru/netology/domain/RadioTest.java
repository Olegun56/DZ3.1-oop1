package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void RadioStation() {
        Radio radio = new Radio();
        radio.currentStation = 3;
        assertEquals(3, radio.currentStation);
    }

    @Test
    public void SwitchRadioStationMax() {
        Radio radio = new Radio();
        radio.currentStation = 10;
        radio.SwitchRadioStation();
        assertEquals(0, radio.currentStation);

    }

    @Test
    public void SwitchRadioStationMin() {
        Radio radio = new Radio();
        radio.currentStation = -1;
        radio.SwitchRadioStation();
        assertEquals(9, radio.currentStation);

    }

    @Test
    public void Volume() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        assertEquals(5, radio.currentVolume);

    }
    @Test
    public void SwitchVolumeMax() {
        Radio radio = new Radio();
        radio.currentVolume = 11;
        radio.SwitchVolume();
        assertEquals(10, radio.currentVolume);

    }
    @Test
    public void SwitchVolumeMin() {
        Radio radio = new Radio();
        radio.currentVolume = -1;
        radio.SwitchVolume();
        assertEquals(0, radio.currentVolume);

    }
}