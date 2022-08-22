package chapter07;

public class Chapter07_10 {

    public static void main(String args[]) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH : "+t.getChannel());
        t.setChannel(20);
        System.out.println("CH : "+t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH : "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : "+t.getChannel());
    }
}

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    // 이전 채널
    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
