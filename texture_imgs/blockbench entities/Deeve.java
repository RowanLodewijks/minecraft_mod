// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Deeve<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "deeve"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Arm_Left;
	private final ModelPart Arm_Right;
	private final ModelPart Leg_Left;
	private final ModelPart Leg_Right;
	private final ModelPart ass;

	public Deeve(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Arm_Left = root.getChild("Arm_Left");
		this.Arm_Right = root.getChild("Arm_Right");
		this.Leg_Left = root.getChild("Leg_Left");
		this.Leg_Right = root.getChild("Leg_Right");
		this.ass = root.getChild("ass");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -49.0F, -6.0F, 24.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(5.0F, -47.0F, -7.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-9.0F, -47.0F, -7.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 53).addBox(11.0F, -53.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(18, 53).addBox(-12.0F, -53.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-8.0F, -33.0F, -6.0F, 16.0F, 17.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(44, 24).addBox(-1.0F, -37.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Arm_Left = partdefinition.addOrReplaceChild("Arm_Left", CubeListBuilder.create().texOffs(62, 24).addBox(11.0F, -29.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 53).addBox(8.0F, -29.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 24).addBox(10.0F, -21.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Arm_Right = partdefinition.addOrReplaceChild("Arm_Right", CubeListBuilder.create().texOffs(58, 60).addBox(-12.0F, -29.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 53).addBox(-11.0F, -29.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(-13.0F, -21.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Leg_Left = partdefinition.addOrReplaceChild("Leg_Left", CubeListBuilder.create().texOffs(52, 60).addBox(3.0F, -16.0F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Leg_Right = partdefinition.addOrReplaceChild("Leg_Right", CubeListBuilder.create().texOffs(46, 60).addBox(-5.0F, -16.0F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ass = partdefinition.addOrReplaceChild("ass", CubeListBuilder.create().texOffs(60, 0).addBox(3.0F, -19.0F, 7.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(56, 36).addBox(-7.0F, -19.0F, 7.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(49, 46).addBox(-10.0F, -20.0F, 1.0F, 20.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm_Left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm_Right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg_Left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg_Right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ass.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}