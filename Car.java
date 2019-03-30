
public class Car {

    public short speed;
    public String model;
    public float weight;
    public String color;
    public boolean iswork;

    void setAll(String model,float weight,String color,boolean iswork){
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.iswork = iswork;
    }

    void printAll (){
        String iswork = this.iswork ? "работает" : " не работает";
        System.out.println("Автомобиль марки " + this.model + " Максимальная скорость " + this.speed + " Цвет " + this.color + " Вес авто " + this.weight + " состояние " + iswork);

    }
}
