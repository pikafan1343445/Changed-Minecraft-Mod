package net.ltxprogrammer.changed.client.renderer.animate;

import net.ltxprogrammer.changed.entity.LatexEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;

public abstract class AbstractQuadrupedalAnimator<T extends LatexEntity, M extends EntityModel<T>> extends LatexAnimator.Animator<T, M> {
    public final ModelPart torso;
    public final ModelPart frontLeftLeg;
    public final ModelPart frontRightLeg;
    public final ModelPart backLeftLeg;
    public final ModelPart backRightLeg;

    public AbstractQuadrupedalAnimator(ModelPart torso, ModelPart frontLeftLeg, ModelPart frontRightLeg, ModelPart backLeftLeg, ModelPart backRightLeg) {
        this.torso = torso;
        this.frontLeftLeg = frontLeftLeg;
        this.frontRightLeg = frontRightLeg;
        this.backLeftLeg = backLeftLeg;
        this.backRightLeg = backRightLeg;
    }
}
