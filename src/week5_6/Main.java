package week5_6;

public class Main {
    public static void main(String[] args) {
        Diagram dia = new Diagram();
        Layer lay = new Layer();
        
        XY xy1 = new XY(1,1);
        XY xy2 = new XY(2,2);
        XY xy3 = new XY(3,3);
        XY xy4 = new XY(4,5);
        
        lay.shapes.add(new Triangle(xy1, xy2, xy3));
        lay.shapes.add(new Rectangle("blue", true, xy4, 4, 5));
//        lay.shapes.add(new Circle(2.0));
        
        dia.layers.add(lay);
        System.out.println("Before");
        for(int i = 0; i<lay.shapes.size();i++){
            System.out.println(lay.shapes.get(i).toString());
        }
        
        System.out.println("After");
        dia.deleteCircle();
        lay.deleteTriagle();
        for(int i = 0; i<lay.shapes.size();i++){
            System.out.println(lay.shapes.get(i).toString());
        }
    }

}
