package basics;

class Medicine{
    public void manufacture(){
        System.out.println("Manufacturing in progress.....");
    }
}

class Paracetamol extends Medicine{
    @Override
    public void manufacture(){
        System.out.println("Paracetamol manufacturing in progress.....");
    }
}

public class AnnotationDemo {
    public static void main(String[] args){
        Medicine paracetamol = new Paracetamol();
        paracetamol.manufacture();
    }
}
