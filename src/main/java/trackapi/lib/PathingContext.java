package trackapi.lib;

import net.minecraft.util.math.Vec3d;

/**
 * Packaged variables for pathing rail.
 */
public class PathingContext {
    /**
     * nextPosition or currentPosition.
     */
    public Vec3d pos;
    /**
     * Vector between nextPosition and currentPosition.
     */
    public Vec3d deltaMovement;
    /**
     * nextRoll or currentRoll.
     */
    public double roll;

    public PathingContext(Vec3d pos) {
        this.pos = pos;
    }

    public PathingContext(Vec3d pos, double roll) {
        this.pos = pos;
        this.roll = roll;
    }

    public PathingContext(Vec3d pos, Vec3d deltaMovement, double roll) {
        this.pos = pos;
        this.roll = roll;
        this.deltaMovement = deltaMovement;
    }

    public PathingContext(PathingContext pathingContext) {
        this (
                pathingContext.pos,
                pathingContext.deltaMovement,
                pathingContext.roll
        );
    }

    public PathingContext clone() {
        return new PathingContext(this);
    }
}
