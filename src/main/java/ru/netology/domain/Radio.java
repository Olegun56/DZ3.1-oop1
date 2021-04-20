package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public Radio(int maxStation, int minStation, int maxVolume, int minVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <= maxStation && currentStation >= minStation) {
            this.currentStation = currentStation;
        }
    }

    public void switchCurrentStationNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else
            currentStation++;

    }

    public void switchCurrentStationPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else currentStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= maxVolume && currentVolume >= minVolume) {
            this.currentVolume = currentVolume;
        }

    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        } else currentVolume++;
    }

    public void reduceVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        } else currentVolume--;
    }

}

