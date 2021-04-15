package ru.netology.domain;

public class Radio {
    private int currentStation;
    private final int maxStation = 9;
    private final int minStation = 0;
    private int currentVolume;
    private final int maxVolume = 10;
    private final int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <= maxStation) {
           if (currentStation >= minStation) {
               this.currentStation = currentStation;
            }
        }
        this.currentStation = currentStation;
    }


    public int switchCurrentStationNext() {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        } else {
            currentStation++;
        }
        return currentStation;
    }

    public int switchCurrentStationPrev() {
        if (currentStation < minStation) {
            this.currentStation = maxStation;
        } else {
            currentStation--;
        }
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= maxVolume) {
            if (currentVolume >= minVolume) {
                this.currentVolume = currentVolume;
            }
       }
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            currentVolume++;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            currentVolume--;
        }
        return currentVolume;
    }
}
