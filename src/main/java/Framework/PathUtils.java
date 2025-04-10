package Framework;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

// All paths related to the project are stored here
@UtilityClass
public class PathUtils {

    @SneakyThrows
    public void applySleep(long time ){
        Thread.sleep(time);
    }
}
