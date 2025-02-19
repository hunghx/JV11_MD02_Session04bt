import java.util.ArrayList;
import java.util.List;

public class ClassesCRUD implements IGenericCRUD<Classes, Long>{
    List<Classes> classes = new ArrayList<>();
    @Override
    public List<Classes> findAll() {
        return classes;
    }

    @Override
    public Classes findById(Long id) {
       for(Classes c : classes){
           // ...
       }
    }

    @Override
    public void save(Classes value) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
