package player;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class PlayerShould {
    @Test
    void have_a_name() {
        String name = null;

        ThrowingCallable newPlayer = () -> new PlayerRecord(name, 50);

        assertThatExceptionOfType(PlayerShouldHaveNameException.class)
                .isThrownBy(newPlayer);
    }
}
