package trackapi.lib;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.function.Consumer;

/**
 * Packaged variables for pathing rail.
 * Notice that this uses minecraft Vec3d.
 * @see net.minecraft.util.math.Vec3d
 */
public class PathingContext {
    /**
     * nextPosition or currentPosition.
     */
    public final Vec3d pos;

    /**
     * Distance between nextPosition and currentPosition.
     */
    public final double deltaMovement;

    /**
     * nextRoll or currentRoll.
     */
    public final double roll;

    public PathingContext(Vec3d pos, double deltaMovement, double roll) {
        this.pos = pos;
        this.roll = roll;
        this.deltaMovement = deltaMovement;
    }

    private PathingContext(PathingContext pathingContext) {
        this (
                pathingContext.pos,
                pathingContext.deltaMovement,
                pathingContext.roll
        );
    }

    public PathingContext copy() {
        return new PathingContext(this);
    }
}
