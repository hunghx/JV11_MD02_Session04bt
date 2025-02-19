import java.util.List;

public interface IGenericCRUD <T,E>{ // T là đối tượng thao tác, E là id của đổi tượng
    List<T> findAll(); // trả về danh sách cả phần tử T
    T findById(E id); // trả về phần tử T theo id
    void save(T value); // vừa thm moi vua chinh sua
    void deleteById(E id);
}
