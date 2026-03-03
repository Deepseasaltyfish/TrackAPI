package trackapi.lib;

import net.minecraft.util.math.Vec3d;

/**
 * Mutable data storaging object used by stocks to query data
 */
public class PathingData {
    private Vec3d vanillaPos;
    private double roll;
    private double deltaMovement;
    private boolean updated;

    public PathingData(Vec3d vanillaPos, double roll, double deltaMovement) {
        this.vanillaPos = vanillaPos;
        this.roll = roll;
        this.deltaMovement = deltaMovement;
        this.updated = false;
    }

    public Vec3d getVanillaPos() {
        return vanillaPos;
    }

    public void setVanillaPos(Vec3d pos) {
        if(this.vanillaPos.equals(pos)) return;
        updated = true;
        this.vanillaPos = pos;
        this.deltaMovement += this.vanillaPos.distanceTo(pos);
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        if(Double.compare(this.roll, roll) == 0) return;
        updated = true;
        this.roll = roll;
    }

    public double getDeltaMovement() {
        return deltaMovement;
    }

    public boolean isUpdated() {
        return updated;
    }
}
