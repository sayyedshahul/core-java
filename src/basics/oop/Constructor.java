package basics.oop;

class Table{
    private int height;
    private int width;
    private String colour;

    public Table(){
        this.height = 20;
        this.width = 10;
        this.colour = "brown";
    }

    public Table(int height, int width, String colour){
        this.height = height;
        this.width = width;
        this.colour = colour;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public String getColour(){
        return colour;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
}

public class Constructor {
    public static void main(String[] args){
        Table table = new Table();
        System.out.println(table.getHeight() + " " + table.getWidth() + " " + table.getColour());

        Table table2 = new Table(34, 23, "Black");
        System.out.println(table2.getHeight() + " " + table2.getWidth() + " " + table2.getColour());
    }
}
