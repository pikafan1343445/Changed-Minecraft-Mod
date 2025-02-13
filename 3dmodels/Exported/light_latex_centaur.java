// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class LightLatexCentaur<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "lightlatexcentaur"), "main");
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart LowerTorso;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public LightLatexCentaur(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Torso = root.getChild("Torso");
		this.LowerTorso = root.getChild("LowerTorso");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-2.0F, -4.0F, -6.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 16).addBox(-1.5F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -7.0F));

		PartDefinition Snout_r1 = Head.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -29.625F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 25.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 4).addBox(-1.5088F, -0.3841F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 4).addBox(-0.5088F, -1.3841F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 4).addBox(-0.5088F, -0.3841F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.5F, 0.0F, -0.3927F, -0.3491F, -1.6581F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9912F, -1.0341F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(-0.9912F, -2.0341F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(-0.9912F, -1.0341F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -7.0F, 0.0F, -0.3927F, 0.3491F, 1.6581F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(0, 60).addBox(-2.0F, -35.0F, -4.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(-4.0F, -34.5F, -3.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 63).addBox(2.0F, -35.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(2.5F, -34.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
		.texOffs(0, 64).addBox(-3.5F, -33.0F, -4.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 64).addBox(3.5F, -34.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 64).addBox(-4.5F, -34.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(2.5F, -31.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(2, 60).addBox(-4.5F, -31.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-4.5F, -34.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
		.texOffs(3, 62).addBox(-4.0F, -35.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(-4.0F, -34.0F, -4.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(0, 62).addBox(-4.0F, -34.0F, 4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -7.0F));

		PartDefinition LowerTorso = partdefinition.addOrReplaceChild("LowerTorso", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -7.0F));

		PartDefinition LowerTorso_r1 = LowerTorso.addOrReplaceChild("LowerTorso_r1", CubeListBuilder.create().texOffs(59, 40).addBox(-4.5F, -16.75F, -2.0F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.3F))
		.texOffs(56, 5).addBox(-4.5F, -12.75F, -2.0F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Tail = LowerTorso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 15.25F));

		PartDefinition Base_r1 = Tail.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(56, 30).addBox(-1.5F, 2.1914F, -2.1983F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 5.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition Base_r2 = Tail.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(68, 30).addBox(-1.5F, 2.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition LeftLeg = LowerTorso.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(12, 44).addBox(-1.75F, 12.0F, -1.8F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 47).addBox(-1.75F, 12.0F, -2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 0.0F, 0.0F));

		PartDefinition Toe_r1 = LeftLeg.addOrReplaceChild("Toe_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(0, 58).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(0, 58).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.25F, 13.0F, -3.3F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Toe_r2 = LeftLeg.addOrReplaceChild("Toe_r2", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(24, 6).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(24, 6).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.25F, 16.0F, -1.8F, 0.0F, 0.0F, 0.0F));

		PartDefinition LeftLowerLeg_r1 = LeftLeg.addOrReplaceChild("LeftLowerLeg_r1", CubeListBuilder.create().texOffs(16, 38).addBox(-2.0F, 9.8638F, 2.7342F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F))
		.texOffs(16, 32).addBox(-2.0F, 2.8638F, 2.7342F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.25F, 1.0348F, -2.0472F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftUpperLeg_r1 = LeftLeg.addOrReplaceChild("LeftUpperLeg_r1", CubeListBuilder.create().texOffs(40, 11).addBox(-2.0F, -0.3172F, -0.0274F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.25F, 1.0348F, -2.0472F, 0.3054F, 0.0F, 0.0F));

		PartDefinition RightLeg = LowerTorso.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(43, 42).addBox(-1.75F, 12.0F, -1.8F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 45).addBox(-1.75F, 12.0F, -2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition Toe_r3 = RightLeg.addOrReplaceChild("Toe_r3", CubeListBuilder.create().texOffs(0, 56).addBox(1.0F, -0.8114F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(0, 56).addBox(-2.0F, -0.8114F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(0, 56).addBox(-0.5F, -0.8114F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.25F, 13.1886F, -2.7018F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Toe_r4 = RightLeg.addOrReplaceChild("Toe_r4", CubeListBuilder.create().texOffs(0, 18).addBox(1.0F, -0.1886F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(0, 18).addBox(-0.5F, -0.1886F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(0, 18).addBox(-2.0F, -0.1886F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.25F, 13.1886F, -2.7018F, 0.0F, 0.0F, 0.0F));

		PartDefinition RightLowerLeg_r1 = RightLeg.addOrReplaceChild("RightLowerLeg_r1", CubeListBuilder.create().texOffs(32, 6).addBox(-2.0F, 9.8638F, 2.7342F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F))
		.texOffs(32, 0).addBox(-2.0F, 2.8638F, 2.7342F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.25F, 1.0348F, -2.0472F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightUpperLeg_r1 = RightLeg.addOrReplaceChild("RightUpperLeg_r1", CubeListBuilder.create().texOffs(32, 32).addBox(-2.0F, -0.3172F, -0.0274F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.25F, 1.0348F, -2.0472F, 0.3054F, 0.0F, 0.0F));

		PartDefinition LeftLeg2 = LowerTorso.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(26, 57).addBox(-2.0F, 12.0F, 0.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.75F, 0.0F, 15.0F));

		PartDefinition Toe_r5 = LeftLeg2.addOrReplaceChild("Toe_r5", CubeListBuilder.create().texOffs(20, 58).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(20, 58).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(20, 58).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0F, 13.0F, -0.25F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Toe_r6 = LeftLeg2.addOrReplaceChild("Toe_r6", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(24, 6).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(24, 6).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 16.0F, 1.25F, 0.0F, 0.0F, 0.0F));

		PartDefinition LeftLowerLeg_r2 = LeftLeg2.addOrReplaceChild("LeftLowerLeg_r2", CubeListBuilder.create().texOffs(24, 63).addBox(-2.0F, 3.5131F, 2.8162F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.1238F, 0.5226F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftMidLeg_r1 = LeftLeg2.addOrReplaceChild("LeftMidLeg_r1", CubeListBuilder.create().texOffs(38, 61).addBox(-2.0F, -0.098F, -4.8445F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1238F, 0.5226F, 0.8727F, 0.0F, 0.0F));

		PartDefinition LeftUpperLeg_r2 = LeftLeg2.addOrReplaceChild("LeftUpperLeg_r2", CubeListBuilder.create().texOffs(38, 51).addBox(-2.0F, -2.0208F, -2.9291F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.1238F, 0.5226F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RightLeg2 = LowerTorso.addOrReplaceChild("RightLeg2", CubeListBuilder.create().texOffs(56, 57).addBox(-2.0F, 12.0F, 0.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.75F, 0.0F, 15.0F));

		PartDefinition Toe_r7 = RightLeg2.addOrReplaceChild("Toe_r7", CubeListBuilder.create().texOffs(20, 56).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(20, 56).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(20, 56).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0F, 13.0F, -0.25F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Toe_r8 = RightLeg2.addOrReplaceChild("Toe_r8", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(0, 18).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(0, 18).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 16.0F, 1.25F, 0.0F, 0.0F, 0.0F));

		PartDefinition RightLowerLeg_r2 = RightLeg2.addOrReplaceChild("RightLowerLeg_r2", CubeListBuilder.create().texOffs(54, 63).addBox(-2.0F, 3.5131F, 2.8162F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.1238F, 0.5226F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightMidLeg_r1 = RightLeg2.addOrReplaceChild("RightMidLeg_r1", CubeListBuilder.create().texOffs(68, 61).addBox(-2.0F, -0.098F, -4.8445F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1238F, 0.5226F, 0.8727F, 0.0F, 0.0F));

		PartDefinition RightUpperLeg_r2 = RightLeg2.addOrReplaceChild("RightUpperLeg_r2", CubeListBuilder.create().texOffs(68, 51).addBox(-2.0F, -2.0208F, -2.9291F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.1238F, 0.5226F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 16).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(36, 16).addBox(0.0F, 8.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(36, 18).addBox(-3.0F, 8.75F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(36, 18).addBox(-3.0F, 8.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(36, 18).addBox(-3.0F, 8.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offset(-5.0F, 0.0F, -7.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(32, 14).addBox(-1.0F, 8.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(28, 6).addBox(2.0F, 8.75F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(28, 6).addBox(2.0F, 8.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(28, 6).addBox(2.0F, 8.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offset(5.0F, 0.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 90, 72);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LowerTorso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}