package ch14.sec06.exam02;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject workOBject = new WorkObject();

        ThreadA threadA = new ThreadA(workOBject);
        ThreadB threadB = new ThreadB(workOBject);

        threadA.start();
        threadB.start();
    }
}
