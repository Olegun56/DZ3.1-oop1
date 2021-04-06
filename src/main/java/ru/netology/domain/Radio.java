package ru.netology.domain;

public class Radio {
    int currentStation;
    int maxStation = 9;
    int minStation = 0;
    int currentVolume;
    int maxVolume = 10;
    int minVolume = 0;

    public void SwitchRadioStation() {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
    }
    public void SwitchVolume() {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
    }
}
