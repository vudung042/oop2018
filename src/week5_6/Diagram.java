package week5_6;

import java.util.ArrayList;


public class Diagram 
{   
    ArrayList<Layer> layers = new ArrayList<Layer>();
    public void deleteCircle (){
        for (int i=0;i<layers.size();i++){
            for (int j=0;j<layers.get(i).shapes.size();j++)
                if (layers.get(i).shapes.get(j) instanceof Circle){
                    layers.get(i).shapes.remove(j);
                    j--;
                }
        }
    }


}