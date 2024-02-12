import java.util.List;


/**
 * Интерфейс для нашего калькулятора.
 * @param <T>
 */

public interface Calculator<T>{
    Double sum(List<T> list);

    Double product(List<T> list);

    Double div(List<T> list);

    Long fromBinary(T num);
    
    String toBinary(T num);

    List<T> getNumbers();

    Object getNumber();

}