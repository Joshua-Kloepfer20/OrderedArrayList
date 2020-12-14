import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int capacity) {
    super(capacity);
  }
  public boolean add(T e) {
    if (e == null) {
      throw new IllegalArgumentException();
    }
    if (size() > 0) {
    for (int i = 0; i < size(); i++) {
      if (e.compareTo(get(i)) < 0) {
        super.add(i, e);
        return true;
      }
    }
  }
    return super.add(e);
  }
  public void add(int index, T element) {
    add(element);
  }
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    T previous = get(index);
    this.remove(index);
    this.add(element);
    return previous;
  }
}
