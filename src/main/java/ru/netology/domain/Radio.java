package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

// Выбор и настройка радиостанций:
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void changeOver(int currentStation) {
        if (currentStation == 9) {
            this.currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }

    public void changeBackOver(int currentStation) {
        if (currentStation == 0) {
            this.currentStation = 9;
        }
    }


// Выбор и настройка уровня громкости:
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void maxVolume(int currentVolume) {
        if (currentVolume == 10) {
            this.currentStation = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void minVolume(int currentVolume) {
        if (currentVolume == 0) {
            this.currentStation = 0;
        }
    }

}
