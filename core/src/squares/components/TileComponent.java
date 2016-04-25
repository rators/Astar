package squares.components;

import com.badlogic.ashley.core.Component;
import squares.components.Enums.TileTypes;

/**
 * A tile component representation.
 */
public class TileComponent implements Component {
    private TileTypes defaultType;
    private TileTypes currentType;

    public void setDefaultType(TileTypes defaultType) {
        this.defaultType = defaultType;
    }

    public TileComponent(TileTypes defaultType) {
        this.defaultType = defaultType;
    }

    public TileTypes getDefaultType() {
        return defaultType;
    }

    public TileTypes getCurrentType() {
        return currentType;
    }

    public void setCurrentType(TileTypes currentType) {
        this.currentType = currentType;
    }

}