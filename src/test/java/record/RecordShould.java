package record;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import player.Player;
import player.PlayerRecord;

public class RecordShould {
    @Test
    void be_immutable() {
        Player player = new Player("Ali",150);
        PlayerRecord playerRecord = new PlayerRecord("Ali",150);

        Assertions.assertThat(player.getGoal()).isEqualTo(playerRecord.goal());
        Assertions.assertThat(player.getName()).isEqualTo(playerRecord.name());

        final PlayerRecord hasan = playerRecord.changeName("hasan");

        Assertions.assertThat(hasan).isNotEqualTo(playerRecord);
    }
}
