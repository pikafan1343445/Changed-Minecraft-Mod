package net.ltxprogrammer.changed.client.renderer.model.hair;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class Legacy {
    public static LayerDefinition createMaleHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -5.25F, -3.5F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.4F))
                .texOffs(24, 0).addBox(-4.0F, -5.0F, -3.25F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.2F))
                .texOffs(0, 25).addBox(3.75F, -4.25F, -3.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.401F))
                .texOffs(32, 14).addBox(-3.5F, -3.45F, -4.35F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(0, 3).addBox(3.95F, -4.45F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(0, 0).addBox(-4.9F, -4.45F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(32, 7).addBox(3.75F, -1.0F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.4F))
                .texOffs(29, 29).addBox(-4.7F, -1.0F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.4F))
                .texOffs(16, 22).addBox(-4.7F, -4.25F, -3.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.401F))
                .texOffs(16, 16).addBox(-4.0F, -5.5F, -0.2F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
                .texOffs(24, 5).addBox(-4.0F, -4.55F, -4.6F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                .texOffs(26, 22).addBox(-4.0F, -4.25F, 4.05F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, -2.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFemaleRightBangHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 5).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 0).addBox(-4.5F, -6.0F, -4.75F, 2.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 50).addBox(-4.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 50).addBox(2.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(41, 42).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 26).addBox(3.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(51, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 18).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 30).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 36).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 37).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(44, 0).addBox(-4.0F, -0.75F, 2.0F, 8.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(24, 8).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFemaleLowerHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition LowerHair = partdefinition.addOrReplaceChild("LowerHair", CubeListBuilder.create().texOffs(60, 14).addBox(2.5F, -0.5F, -3.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(43, 14).addBox(-2.5F, -0.5F, 2.0F, 6.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(62, 16).addBox(-4.5F, -0.5F, 1.0F, 2.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(62, 16).addBox(2.5F, -0.5F, 1.0F, 2.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(60, 14).addBox(-4.5F, -0.5F, -3.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(-3.5F, 0.5F, -3.0F, 1.0F, 3.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(-4.5F, 0.5F, -3.0F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(2.5F, 0.5F, 2.0F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(3.5F, 0.5F, 2.0F, 1.0F, 3.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(-1.5F, 0.5F, 2.0F, 1.0F, 3.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(1.5F, 0.5F, 2.0F, 1.0F, 3.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(-0.5F, 0.5F, 2.0F, 2.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(-2.5F, 0.5F, 2.0F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(-4.5F, 0.5F, 2.0F, 2.0F, 3.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(3.5F, 0.5F, -3.0F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 10).addBox(2.5F, 0.5F, -3.0F, 1.0F, 3.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 1.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFemaleLeftBangHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 5).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 16).addBox(2.5F, -6.0F, -4.75F, 2.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 50).addBox(-4.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 50).addBox(2.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(41, 42).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 26).addBox(3.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(51, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 18).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 30).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 36).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 37).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(44, 0).addBox(-4.0F, -0.75F, 2.0F, 8.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(24, 8).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFemaleDualBangHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 5).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 0).addBox(-4.5F, -6.0F, -4.75F, 2.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 16).addBox(2.5F, -6.0F, -4.75F, 2.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 50).addBox(-4.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 50).addBox(2.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(41, 42).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 26).addBox(3.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(51, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 18).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 30).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 36).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 37).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(44, 0).addBox(-4.0F, -0.75F, 2.0F, 8.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(24, 8).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFemaleSideBangsHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 5).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 50).addBox(-4.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 50).addBox(2.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(41, 42).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 26).addBox(3.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(51, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 18).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 25).addBox(3.75F, -4.0F, -3.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F))
                .texOffs(16, 16).addBox(-4.75F, -4.0F, -3.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F))
                .texOffs(32, 30).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 36).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 37).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(44, 0).addBox(-4.0F, -0.75F, 2.0F, 8.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(24, 8).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFemaleTripleBangsHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 5).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 50).addBox(-4.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 50).addBox(2.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(41, 42).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 26).addBox(3.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(51, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 18).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 30).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 36).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 37).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(44, 0).addBox(-4.0F, -0.75F, 2.0F, 8.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(24, 8).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 57).addBox(3.725F, -7.25F, -4.5F, 1.0F, 4.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(13, 54).addBox(-4.725F, -7.25F, -4.5F, 1.0F, 4.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(0, 30).addBox(-1.15F, -6.5F, -4.675F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 33).addBox(-1.15F, -5.5F, -4.675F, 2.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFemaleNoBangsHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 5).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 50).addBox(-4.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 50).addBox(2.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(41, 42).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 26).addBox(3.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(51, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 18).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 30).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 36).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 37).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(44, 0).addBox(-4.0F, -0.75F, 2.0F, 8.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(24, 8).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createMohawkHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -7.75F, -3.75F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(42, 30).addBox(2.0F, -7.25F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.025F))
                .texOffs(32, 17).addBox(-3.0F, -7.0F, 3.25F, 1.0F, 5.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(25, 42).addBox(-3.0F, -7.25F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.025F))
                .texOffs(12, 25).addBox(2.0F, -7.0F, 3.25F, 1.0F, 5.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(14, 46).addBox(-2.0F, -7.025F, 3.75F, 4.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 34).addBox(-2.0F, -7.25F, -4.25F, 4.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -1.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createFlaredMohawk() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -7.75F, -3.75F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(42, 30).addBox(2.0F, -7.25F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.025F))
                .texOffs(25, 42).addBox(-3.0F, -7.25F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.025F))
                .texOffs(0, 79).addBox(-4.0F, -6.0F, 4.0F, 8.0F, 5.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(67, 1).addBox(4.0F, -4.0F, -2.0F, 1.0F, 4.0F, 6.0F, CubeDeformation.NONE)
                .texOffs(0, 86).addBox(-3.0F, -7.0F, 4.0F, 6.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(44, 84).addBox(3.75F, -6.0F, 2.0F, 1.0F, 2.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(69, 28).addBox(-4.75F, -6.0F, 2.0F, 1.0F, 2.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(44, 73).addBox(-5.0F, -4.0F, -2.0F, 1.0F, 4.0F, 6.0F, CubeDeformation.NONE)
                .texOffs(51, 34).addBox(-2.0F, -7.25F, -4.25F, 4.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createHeadFuzzHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(40, 5).addBox(-2.0F, -9.75F, -2.5F, 4.0F, 1.0F, 6.0F, CubeDeformation.NONE)
                .texOffs(40, 12).addBox(-3.5F, -9.5F, -3.5F, 7.0F, 1.0F, 3.0F, CubeDeformation.NONE)
                .texOffs(47, 51).addBox(1.5F, -9.725F, -0.5F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(51, 46).addBox(-3.5F, -9.725F, -0.525F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 1.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createMaleStandardHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(16, 17).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(25, 1).addBox(-4.0F, -7.5F, -3.5F, 8.0F, 1.0F, 3.0F, CubeDeformation.NONE)
                .texOffs(54, 5).addBox(2.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(20, 26).addBox(2.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(48, 3).addBox(-3.5F, -6.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 21).addBox(3.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 21).addBox(-4.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 45).addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(12, 26).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 25).addBox(-4.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(0, 52).addBox(-4.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(42, 24).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 17).addBox(-4.0F, -7.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createMaleStandardBangHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(16, 17).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(25, 1).addBox(-4.0F, -7.5F, -3.5F, 8.0F, 1.0F, 3.0F, CubeDeformation.NONE)
                .texOffs(54, 5).addBox(2.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(25, 43).addBox(-1.0F, -6.25F, -4.2499F, 2.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 26).addBox(2.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(48, 3).addBox(-3.5F, -6.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 21).addBox(3.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 21).addBox(-4.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 45).addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(12, 26).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 25).addBox(-4.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(0, 52).addBox(-4.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(42, 24).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 17).addBox(-4.0F, -7.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createMaleHairNWE() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(16, 17).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(-4.0F, -7.5F, -3.5F, 8.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(54, 5).addBox(2.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(20, 26).addBox(2.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(48, 3).addBox(-3.5F, -6.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 21).addBox(3.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 21).addBox(-4.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 45).addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(12, 26).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 25).addBox(-4.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(0, 52).addBox(-4.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(42, 24).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 17).addBox(-4.0F, -7.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }
    public static LayerDefinition createMaleHairFullNWE() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(16, 17).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(54, 5).addBox(2.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(20, 26).addBox(2.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(48, 3).addBox(-3.5F, -6.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 21).addBox(3.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 21).addBox(-4.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 45).addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(12, 26).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 25).addBox(-4.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(0, 52).addBox(-4.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(42, 24).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 17).addBox(-4.0F, -7.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }
    public static LayerDefinition createMaleBangHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(16, 17).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(-4.0F, -7.5F, -3.5F, 8.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(54, 5).addBox(2.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(20, 26).addBox(2.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(48, 3).addBox(-3.5F, -6.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 21).addBox(3.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 21).addBox(-4.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 45).addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(12, 26).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 25).addBox(-4.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(0, 52).addBox(-4.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(42, 24).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(25, 43).addBox(-1.0F, -5.25F, -4.2499F, 2.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 17).addBox(-4.0F, -7.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createSideTuftsHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(76, 11).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(50, 70).addBox(-4.0F, -8.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(15, 83).addBox(-4.0F, -8.75F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 83).addBox(-4.45F, -8.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(51, 59).addBox(-4.65F, -5.0F, -1.0F, 2.0F, 3.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 88).addBox(2.65F, -5.0F, -1.0F, 2.0F, 3.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 89).addBox(-4.5F, -8.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(9, 89).addBox(3.5F, -8.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 94).addBox(-3.5F, -7.25F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(68, 35).addBox(3.45F, -8.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(59, 51).addBox(2.0F, -8.75F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(76, 0).addBox(-4.0F, -8.5F, -3.5F, 8.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(6, 89).addBox(-2.0F, -8.75F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createSideburnHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(16, 17).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(-4.0F, -7.5F, -3.5F, 8.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(54, 5).addBox(2.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(20, 26).addBox(2.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(48, 3).addBox(-3.5F, -6.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 21).addBox(3.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 21).addBox(-4.5F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 45).addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(12, 26).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 25).addBox(-4.5F, -7.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(0, 52).addBox(-4.0F, -7.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(42, 24).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 17).addBox(-4.0F, -7.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(29, 74).addBox(2.25F, -5.0F, -3.0F, 2.0F, 4.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(0, 67).addBox(-4.25F, -5.0F, -3.0F, 2.0F, 4.0F, 5.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createShortFrontHair() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(9, 70).addBox(-2.0F, -10.0001F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(30, 64).addBox(-4.0F, -9.5001F, -3.5F, 8.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(59, 43).addBox(2.0F, -10.0001F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(2, 57).addBox(2.5F, -9.0001F, -3.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.025F))
                .texOffs(12, 40).addBox(3.5F, -9.0001F, -4.5F, 1.0F, 2.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(12, 36).addBox(-4.5F, -9.0001F, -4.5F, 1.0F, 2.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(57, 35).addBox(2.5F, -6.0001F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(68, 20).addBox(-4.5F, -6.0001F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(13, 60).addBox(-4.5F, -9.0001F, -3.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.025F))
                .texOffs(64, 14).addBox(-4.0F, -10.0001F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 69).addBox(-4.0F, -9.0001F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(36, 56).addBox(-4.0F, -9.0001F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(34, 71).addBox(-3.5F, -8.0001F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 1.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createPonytail() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Base_r1 = partdefinition.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(24, 5).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 18).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 30).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 36).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 37).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(24, 8).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition PonyTail = partdefinition.addOrReplaceChild("PonyTail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Base_r2 = PonyTail.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(51, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 26).addBox(3.75F, -4.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(24, 50).addBox(-4.0F, -8.75F, 3.25F, 2.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 50).addBox(2.0F, -8.75F, 3.25F, 2.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 12).addBox(-1.0F, -10.0F, 2.5F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(41, 41).addBox(-1.0F, -9.0F, 4.5F, 2.0F, 12.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(41, 42).addBox(-2.0F, -9.0F, 3.5F, 4.0F, 8.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }
}
