package week5_6;

import java.util.Vector;

public class Diagram extends Vector<Layer>
{
    public void deleteCircle (){
        for (int i=0;i<this.size();i++){
            for (int j=0;j<this.elementAt(i).size();j++)
                if (this.elementAt(i).elementAt(j) instanceof Circle){
                    this.elementAt(i).remove(j);
                    j--;
                }
        }
    }


}