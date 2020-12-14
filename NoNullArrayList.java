import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int capacity) {
    super(capacity);
  }
  public boolean add(T e) {
    if (e == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.add(e);
    }
  }
  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      super.add(index, element);
    }
  }
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.set(index, element);
    }
  }
}
