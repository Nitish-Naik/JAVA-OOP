// getters = to return the value;
// setters = to modify the value;
// this: this keyword is used to refer to the current object
public class getters_setters 
{   
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(3);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}


class Pen 
{
    private String color;
    private int tip;

    String getColor()
    {
        return this.color;
    }

    int getTip()
    {
        return this.tip;
    }
    void setColor(String newColor)
    {
        this.color = newColor;
    }

    void setTip(int newTip)
    {
        this.tip = newTip;
    }
}