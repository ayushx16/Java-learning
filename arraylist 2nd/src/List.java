import java.util.ArrayList;

public class List {
    ArrayList<String> groceryList=new ArrayList<String>();
    public void additems(String item){
        groceryList.add(item);
    }
    public void display(){
        System.out.println("Total items = "+groceryList.size());
        for(int i=0;i<groceryList.size();i++){
            System.out.println(i+ ")  "+groceryList.get(i));
        }
    }
    public void update(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("item at position "+position+" is updated");
    }
    public void delete(int position){
        groceryList.remove(position);
        System.out.println("item deleted at position "+ position);
    }
    public String findItem(String searchItem){
       int position = groceryList.indexOf(searchItem);
       if(position >=0){
           return groceryList.get(position);
       }
       return null;
    }
}
