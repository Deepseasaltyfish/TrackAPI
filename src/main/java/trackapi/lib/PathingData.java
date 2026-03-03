package trackapi.lib;

import net.minecraft.util.math.Vec3d;

/**
 * Mutable data storaging object used by stocks to query data
 */
public class PathingData {
    private Vec3d vanillaPos;
    private double roll;
    private double deltaMovement;

    public PathingData(Vec3d vanillaPos, double roll, double deltaMovement) {
        this.vanillaPos = vanillaPos;
        this.roll = roll;
        this.deltaMovement = deltaMovement;
    }

    public Vec3d getVanillaPos() {
        return vanillaPos;
    }

    public void setVanillaPos(Vec3d pos) {
        this.vanillaPos = pos;
        this.deltaMovement += this.vanillaPos.distanceTo(pos);
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public double getDeltaMovement() {
        return deltaMovement;
    }
}
