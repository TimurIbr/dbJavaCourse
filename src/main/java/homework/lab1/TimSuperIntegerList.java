package homework.lab1;

/**
 * @author Timur Ibraev
 */
public class TimSuperIntegerList implements SuperIntegerList {
    private int []values;
    private int cup;
    private int cupIncreaseStep = 10;
    private int length;

    public TimSuperIntegerList(int[] initValues) {
        this.length = initValues != null ? initValues.length : 0;
        this.cup = initValues != null ? initValues.length : 0;
        //System.out.println(this.length + " " + this.cup );
        this.values = initValues;
    }

    public int getLength(){
        return this.length;
    }

    public int getCup(){
        return this.cup;
    }

    public void setCupIncreaseScale(int scale){
        if (scale < 0){
            //rise error
            return;
        }
        if (scale > 5 ){
            //just too much
            return;
        }
        this.cupIncreaseStep = (int)Math.pow(10, scale);
    }

    public void add(int number) {
        if (this.length + 1 > this.getCup()){
            this.cup += this.cupIncreaseStep;
            int []newValues = new int[this.cup];
            for (int i = 0; i < this.length ; ++i){
                newValues[i] = this.values[i];
            }
            this.values = newValues;
        }
        this.values[this.length] = number;
        this.length += 1;
    }

    public void removeByIndex(int index) {
        if (index >= this.length || index < 0){
            //rise error
            return;
        }
        for(int i = index; i < this.length - 1; ++i){
            this.values[i] = this.values[i+1];
        }
        this.values[this.length] = 0;
        this.length -= 1;
    }

    public void removeByValue(int value) {
        for (int i = 0; i < this.length; ++i){
            if (this.values[i] == value){
                this.removeByIndex(i);
                return;
            }
        }
        //rise no such value
    }

    public int get(int index) {
        if (index >= this.getLength() || index < 0){
            //rise error
            return -1;
        }
        return this.values[index];
    }

    public void printAll(){
        for (int i = 0; i < this.length; ++i) {
            System.out.print(this.get(i) + "|");
        }
        System.out.println("");
    }
}
