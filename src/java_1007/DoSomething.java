package java_1007;

import java.util.List;

public interface DoSomething<T> {
    // T 는 구현체이기 때문에 교체 가능 (유연한 설계가 가능하다)
    List<T> work(String str);
}
