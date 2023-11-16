package bai2;

import java.util.ArrayList;
import java.util.List;

public class Manage  {
    List<Library> list = new ArrayList<>();


    void add(Library library) {
        list.add(library);
    }

    void delete(int id) {
        int index = -1;
        for (int i = 0; i < this.list.size(); i++) {
            if (id == this.list.get(i).getId()) {
                index = i;

            }
        } this.list.remove(index);

    }

    void showList() {
        for (Library sach : this.list
        ) {
            System.out.println(sach);
        }
    }

    Library findById(int id){
        for (Library item:this.list
             ) {if(item.getId()==id){
                 return item;
        }

        }
        return null;
    }
}




