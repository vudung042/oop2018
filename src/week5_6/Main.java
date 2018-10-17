package week5_6;

public class Main {
    public static void main(String[] args) {

        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        layer.add(new Triangle());
        layer.add(new Rectangle(10, 2));
        layer.add(new Triangle());
        layer.add(new Circle(2.4));
        System.out.println("Before");
        for (int i=0;i<layer.size();i++){
            System.out.println(layer.elementAt(i).toString());
        }
        System.out.println("After");
        layer.deleteTriagle();
        for (int i=0;i<layer.size();i++){
            System.out.println(layer.elementAt(i).toString());
        }
        System.out.println("Before");
        diagram.add(layer);
        for (int i=0;i<layer.size();i++){
            System.out.println(diagram.elementAt(0).elementAt(i).toString());
        }

        diagram.deleteCircle();
        System.out.println("Aftet");
        for (int i=0;i<layer.size();i++){
            System.out.println(diagram.elementAt(0).elementAt(i).toString());
        }


    }

}
