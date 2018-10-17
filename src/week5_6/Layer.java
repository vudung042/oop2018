package week5_6;

import java.util.Vector;

    public class Layer extends Vector<Shape> {

        public void deleteTriagle (){
            for (int i=0;i<this.size();i++){
                if (this.elementAt(i) instanceof Triangle){
                    this.remove(i);
                    i--;
                }
            }
        }

    }


