// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class LatexSnake<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "latexsnake"), "main");
	private final ModelPart Abdomen;
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public LatexSnake(ModelPart root) {
		this.Abdomen = root.getChild("Abdomen");
		this.Head = root.getChild("Head");
		this.Torso = root.getChild("Torso");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Abdomen = partdefinition.addOrReplaceChild("Abdomen", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Base_r1 = Abdomen.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, 0.734F, -1.8537F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.3F))
		.texOffs(0, 16).addBox(-4.5F, 2.6799F, -2.3597F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 0.0478F, -0.6297F, 0.0F, 0.0F, 0.0F));

		PartDefinition LowerAbdomen = Abdomen.addOrReplaceChild("LowerAbdomen", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0F, -1.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Base_r2 = LowerAbdomen.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(48, 23).addBox(-4.5F, -0.6616F, -2.0281F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 23).addBox(-4.5F, 0.3384F, -3.0281F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0025F, 1.0529F, 0.0F, 0.0F, 0.0F));

		PartDefinition Tail = LowerAbdomen.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Base_r3 = Tail.addOrReplaceChild("Base_r3", CubeListBuilder.create().texOffs(30, 11).addBox(-3.5F, 3.8569F, -3.4336F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -5.0025F, 1.0529F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Joint = Tail.addOrReplaceChild("Joint", CubeListBuilder.create(), PartPose.offset(0.0F, 5.8854F, 2.329F));

		PartDefinition Base_r4 = Joint.addOrReplaceChild("Base_r4", CubeListBuilder.create().texOffs(14, 51).addBox(-2.5F, 10.8541F, -2.9527F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(0.0F, -10.8879F, -1.2762F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Joint2 = Joint.addOrReplaceChild("Joint2", CubeListBuilder.create(), PartPose.offset(0.0F, 6.2157F, 1.3003F));

		PartDefinition Base_r5 = Joint2.addOrReplaceChild("Base_r5", CubeListBuilder.create().texOffs(0, 43).addBox(-2.5F, 16.8531F, -2.848F, 5.0F, 8.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -17.1036F, -2.5765F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Joint3 = Joint2.addOrReplaceChild("Joint3", CubeListBuilder.create(), PartPose.offset(0.0F, 7.3826F, 1.4447F));

		PartDefinition Base_r6 = Joint3.addOrReplaceChild("Base_r6", CubeListBuilder.create().texOffs(32, 51).addBox(-2.0F, 23.8458F, -2.4497F, 4.0F, 7.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -24.4861F, -4.0212F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(49, 11).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition Waist_r1 = Torso.addOrReplaceChild("Waist_r1", CubeListBuilder.create().texOffs(46, 3).addBox(-3.5F, -2.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.4F))
		.texOffs(0, 29).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition Finger_r1 = RightArm.addOrReplaceChild("Finger_r1", CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 3).addBox(6.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.75F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition Finger_r2 = RightArm.addOrReplaceChild("Finger_r2", CubeListBuilder.create().texOffs(0, 2).addBox(3.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.75F, -1.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition Finger_r3 = RightArm.addOrReplaceChild("Finger_r3", CubeListBuilder.create().texOffs(3, 1).addBox(3.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(24, 35).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition Finger_r4 = LeftArm.addOrReplaceChild("Finger_r4", CubeListBuilder.create().texOffs(0, 4).addBox(3.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 5).addBox(6.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.75F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition Finger_r5 = LeftArm.addOrReplaceChild("Finger_r5", CubeListBuilder.create().texOffs(0, 6).addBox(3.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.75F, -1.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition Finger_r6 = LeftArm.addOrReplaceChild("Finger_r6", CubeListBuilder.create().texOffs(0, 16).addBox(3.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(40, 35).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Abdomen.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}