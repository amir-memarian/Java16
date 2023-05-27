package stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamShould {
    @Test
    void create_list_easier() {
        List<Integer> multiplyByTwo = IntStream.range(0, 10)
                .boxed()
                .map(number -> number * 2)
               // .collect(Collectors.toList());
                .toList();

        Assertions.assertThat(multiplyByTwo).isEqualTo(List.of(0,2,4,6,8,10,12,14,16,18));

    }
}
