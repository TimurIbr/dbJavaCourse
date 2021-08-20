package homework.lab5.task2;

public class RadioAlarm implements Radio, Alarm{
    @Override
    public void alarmMethodC() {
        System.out.println("Alarm method c");
    }

    @Override
    public void alarmMethodD() {
        System.out.println("Alarm method D");
    }

    @Override
    public void radioMethodA() {
        System.out.println("radio method A");
    }

    @Override
    public void radioMethodB() {
        System.out.println("radio method B");
    }
}
