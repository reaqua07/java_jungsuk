package chapter07;

public class Chapter07_17 {
}

class Marine extends Unit{
    void stimPack(){}
}

class Tank extends Unit{
    void changeMode(){}
}

class Dropship extends Unit{
    void load(){}
    void unload(){}
}

class Unit{
    int x, y;
    void move(int x, int y){}
    void stop(){}
}
